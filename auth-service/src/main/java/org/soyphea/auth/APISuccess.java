package org.soyphea.auth;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class APISuccess<T> {
    Long timestamp;
    String message;
    T data;
}
