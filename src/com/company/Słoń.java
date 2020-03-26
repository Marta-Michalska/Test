package com.company;

public class Słoń implements Lapy,Glos {

    @Override
    public void dajGlos() {
        System.out.println("Toot tooot");
    }

    @Override
    public int ilośćLap() {
        return 4;
    }
}
