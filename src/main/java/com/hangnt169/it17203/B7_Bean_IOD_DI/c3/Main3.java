package com.hangnt169.it17203.B7_Bean_IOD_DI.c3;

/**
 * @author hangnt169
 */
public class Main3 {

    public static void main(String[] args) {
        IOutfit3 vay = new Vay3();
        IOutfit3 quanAo = new QuanAo();

        Nguoi3 nguoi3 = new Nguoi3(quanAo);
        nguoi3.macTrangPhuc();
    }
}
