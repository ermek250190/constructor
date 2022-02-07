package com.company;

import java.util.Arrays;

public class Class {
    private int nomer;
    private String soz;
    private int [] mass;

    public Class() {
    }

    public Class(int nomer, String soz, int[] mass) {
        this.nomer = nomer;
        this.soz = soz;
        this.mass = mass;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    public int[] getMass() {
        return mass;
    }

    public void setMass(int[] mass) {
        this.mass = mass;
    }



    void glass2(){
        System.out.println(getNomer()+getSoz()+ Arrays.toString(getMass()));
    }
}
