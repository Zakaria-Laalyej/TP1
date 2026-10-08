package com.example;

import org.h2.tools.Server;

public class Test {
    public static void main(String[] args) {
try {
        Server.createWebServer("-web", "-webPort", "8082").start();
        System.out.println("Console H2 disponible sur : http://localhost:8082");
    } catch (Exception e) {
        System.out.println("Erreur lors du démarrage de la console H2");
        e.printStackTrace();
    }
}
}
