package com.haceb.utils;
import java.util.concurrent.ThreadLocalRandom;

public class Logica {
    public static int numeroAleatorio(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo);
    }
}