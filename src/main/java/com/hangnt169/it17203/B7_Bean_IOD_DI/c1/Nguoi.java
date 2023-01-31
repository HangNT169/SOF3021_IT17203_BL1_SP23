package com.hangnt169.it17203.B7_Bean_IOD_DI.c1;

/**
 * @author hangnt169
 */
public class Nguoi {

    private Vay vay;

    public Nguoi(){
        vay = new Vay();
    }
    public void nguoiMac(){
        vay.mac();
    }
}
