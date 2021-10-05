package org.soyphea.auth;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@AllArgsConstructor
@Slf4j
public class AuthController {

    final private LoginService loginService;


    @PostMapping("/auth/login")
    public ResponseEntity<?> authenticate(@RequestBody LoginRequest loginRequest) {
        log.info("Login with request :{}", loginRequest);
        loginService.authenticate(loginRequest);
        APISuccess apiSuccess = APISuccess.builder().
                message("Login successfully.")
                .timestamp(System.currentTimeMillis())
                .build();
        return ResponseEntity.ok(apiSuccess);
    }

}
