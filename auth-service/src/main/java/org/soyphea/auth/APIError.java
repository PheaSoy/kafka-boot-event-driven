package org.soyphea.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor@NoArgsConstructor
@Getter
public class APIError {
    private long timestamp = System.currentTimeMillis();
    private String error;
}
