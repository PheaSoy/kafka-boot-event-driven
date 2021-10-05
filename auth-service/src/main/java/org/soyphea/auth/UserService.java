package org.soyphea.auth;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    public void register(UserRequest userRequest) {

        if(userRepository.findByUsername(userRequest.getUsername()).isPresent())
            throw new UserException("User is already existed.");

        User user = User.builder()
                .username(userRequest.getUsername())
                .password(userRequest.getPassword())
                .build();
        User userSaved = userRepository.save(user);
        log.info("Save user with id:{} successfully.",userSaved.getId());
    }
}
