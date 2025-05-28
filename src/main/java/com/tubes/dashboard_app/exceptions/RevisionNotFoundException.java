package com.tubes.dashboard_app.exceptions;

public class RevisionNotFoundException extends RuntimeException {
    public RevisionNotFoundException(String message) {
        super(message);
    }

}