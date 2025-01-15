package com.sandflow.smpte.util;

// Custom exception class for XML processing errors
public class RegXMLException extends Exception {

    // Constructor with a message
    public RegXMLException(String message) {
        super(message);
    }

    // Constructor with a message and a cause
    public RegXMLException(String message, Throwable cause) {
        super(message, cause);
    }

    // Constructor with a cause
    public RegXMLException(Throwable cause) {
        super(cause);
    }
}
