package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        CriaturaRandom unaCriatura = new CriaturaRandom(30);
        Mago unMago = new Mago(18, unaCriatura);
        Guerrero unGuerrero = new Guerrero(20, unaCriatura, 14);
        WODH nuevoMundo = new WODH();
        nuevoMundo.agregarLuchador(unMago);
        nuevoMundo.agregarLuchador(unGuerrero);
        //nuevoMundo.agregarCriatura(unaCriatura);

       // nuevoMundo.realizarLuchas();
        //System.out.println(unGuerrero.getNivelDeVida());
    }
}
