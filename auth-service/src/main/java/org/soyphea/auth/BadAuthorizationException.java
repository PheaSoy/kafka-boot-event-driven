package org.soyphea.auth;

public class BadAuthorizationException extends RuntimeException {
    public BadAuthorizationException() {
        super();
    }

    public BadAuthorizationException(String message) {
        super(message);
    }
}
