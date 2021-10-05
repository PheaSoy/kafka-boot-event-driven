package org.soyphea.auth;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class LoginService {

    private final LoginEventBinder loginEventBinder;
    private final UserRepository userRepository;

    public void authenticate(LoginRequest loginRequest) {
        User user = this.validateUser(loginRequest);
        LoginEventMessaging loginEventMessaging = new LoginEventMessaging();
        loginEventMessaging.setUsername(loginRequest.getUsername());
        if (loginRequest.getUsername().equals(user.getUsername()) &&
                loginRequest.getPassword().equals(user.getPassword())) {
            loginEventMessaging.setLoginSuccess(true);
            loginEventBinder.report().send(MessageBuilder.withPayload(loginEventMessaging).build());
        } else {
            loginEventMessaging.setLoginSuccess(false);
            log.info("loginEventMessaging =>"+loginEventMessaging);
            loginEventBinder.report().send(MessageBuilder.withPayload(loginEventMessaging).build());
            throw new BadAuthorizationException("Invalid username or password");
        }

    }

    private User validateUser(LoginRequest loginRequest) {
        Optional<User> userOptional = userRepository.findByUsername(loginRequest.getUsername());
        if(!userOptional.isPresent()){
            throw new UserException("User is not found.");
        } else {
            if(userOptional.get().isDisabled){
                throw new UserException("User is disabled.");
            }
        }
        return userOptional.get();
    }
}
