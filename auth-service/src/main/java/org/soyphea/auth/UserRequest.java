package org.soyphea.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    @NotNull(message = "username must be not null.")
    String username;
    @NotNull(message = "password must be not null.")
    String password;
}
