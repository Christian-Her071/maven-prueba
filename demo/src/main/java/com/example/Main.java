package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Persona persona1 = new Persona(123, "Christian", "Christian@gmail.com");

        String obtenersaludo = persona1.hablar("Hola como estas");

        System.out.println(obtenersaludo);
        System.out.println("Termino!");
    }
}