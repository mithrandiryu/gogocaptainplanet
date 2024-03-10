package com.tremend.practice.util.constants.framework;


public class TestConstant {

    private TestConstant() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * The maximum
     */
    public static final int TIMEOUT_CONNECTION_REST_ASSURED = 40000;

    public static final String NOT_A_NUMBER = "NaN";
    
    /**
     * Waiting time for expected conditions
     */
    public static final int SHORT_WAIT = 10;
}
