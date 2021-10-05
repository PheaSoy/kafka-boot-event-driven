package org.soyphea.auth;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@ToString
public class LoginRequest {
    private String username;
    private String password;
}
