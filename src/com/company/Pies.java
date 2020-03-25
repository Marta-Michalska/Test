package com.company;

public class Pies implements Glos, Łapy {
    @Override
    public int ilośćŁap() {
        return 4;
    }

    @Override
    public void dajGlos() {
        System.out.println("Hauu Hauu!");
    }
}
