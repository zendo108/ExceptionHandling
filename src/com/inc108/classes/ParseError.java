/*
 * This is a custom Exception
 */
package com.inc108.classes;

/**
 *
 * @author IvanAranda
 */
public class ParseError extends Exception {
    public ParseError(String message) {
                // Create a ParseError object containing
                // the given message as its error message.
             super(message);
}
    
}
