package com.company;

public class Pies implements Glos, Lapy{

    private String rasa = new String();

    @Override
    public void dajGlos() {
        System.out.println("Hau hau");
    }

    @Override
    public int ilośćLap() {
        return 4;
    }
}
