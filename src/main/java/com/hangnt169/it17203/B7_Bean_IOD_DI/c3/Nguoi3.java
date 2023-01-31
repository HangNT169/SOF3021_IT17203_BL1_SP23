package com.hangnt169.it17203.B7_Bean_IOD_DI.c3;

/**
 * @author hangnt169
 */
public class Nguoi3 {

    private IOutfit3 outfit3;

    public Nguoi3(IOutfit3 iOutfit){
        this.outfit3 = iOutfit;
    }

    public  void macTrangPhuc(){
        outfit3.mac();
    }
}
