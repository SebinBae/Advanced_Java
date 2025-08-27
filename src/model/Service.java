package model;

import annotation.Custom_Logging;

public class Service {

    @Custom_Logging()
    public void adder(int v1, int v2) {
        System.out.println("v1 + v2 = " + (v1 + v2));
    }

    @Custom_Logging()
    public void minuser(int v3, int v4) {
        System.out.println("v3 - v4 = " + (v3 - v4));
    }

    @Custom_Logging()
    public void multiplexer(int v5, int v6) {
        System.out.println("v5 * v6 = " + (v5 * v6));
    }



}

