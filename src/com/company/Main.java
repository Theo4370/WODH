package com.company;

import com.company.MundoCriaturas.CriaturaRandom;
import com.company.MundoCriaturas.Dragon;
import com.company.MundoHeroes.Guerrero;
import com.company.MundoHeroes.Mago;

public class Main {

    public static void main(String[] args) {
        // write your code here
        CriaturaRandom unaCriatura = new CriaturaRandom(300);
        CriaturaRandom otraCriatura = new CriaturaRandom(50);
        Dragon unDragon = new Dragon(60);
        Mago unMago = new Mago(18, unaCriatura);
        Mago otroMago = new Mago(55, otraCriatura);
        Guerrero unGuerrero = new Guerrero(18, unaCriatura, 14);
        Guerrero mataDragones = new Guerrero(80, unDragon, 80);
        WODH nuevoMundo = new WODH();
        nuevoMundo.agregarLuchador(unMago);
        nuevoMundo.agregarLuchador(unGuerrero);
        //nuevoMundo.agregarLuchador(otroMago);
        //nuevoMundo.agregarLuchador(mataDragones);
        //nuevoMundo.realizarLuchas();
        unGuerrero.luchar();
        unMago.resucitarGuerrero(unGuerrero);
        //unGuerrero.luchar();
        //mataDragones.luchar();
        //unDragon.volarYEscupirFuego();

    }
}
