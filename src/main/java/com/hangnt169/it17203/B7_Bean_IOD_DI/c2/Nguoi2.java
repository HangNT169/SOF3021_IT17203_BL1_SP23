package com.hangnt169.it17203.B7_Bean_IOD_DI.c2;

/**
 * @author hangnt169
 */
public class Nguoi2 {

    private IOutfit outfit;

    public Nguoi2(){
        outfit = new Vay2();
    }

    public void nguoiMac(){
        outfit.mac();
    }
}
