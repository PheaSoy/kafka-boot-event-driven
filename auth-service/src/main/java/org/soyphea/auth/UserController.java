package org.soyphea.auth;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserRequest userRequest){
        userService.register(userRequest);
        APISuccess apiSuccess = APISuccess.builder().
                message("Successfully created user.")
                .timestamp(System.currentTimeMillis())
                .build();
        return ResponseEntity.ok(apiSuccess);
    }
}
