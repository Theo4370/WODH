package com.company;

import java.util.ArrayList;
import java.util.List;

public class WODH {
    List<Heroe> heroes = new ArrayList<>();
    List<Luchador> luchadores = new ArrayList<>();
    List<Criatura> criaturas = new ArrayList<>();

    public WODH() {
        this.heroes = new ArrayList<>();
        this.luchadores = new ArrayList<>();
        this.criaturas = new ArrayList<>();
    }

    public void agregarHeroe(Heroe heroe){
        heroes.add(heroe);
    }

    public void agregarLuchador(Luchador luchador){
        luchadores.add(luchador);
    }

    public void agregarCriatura(Criatura criatura){
        criaturas.add(criatura);
    }

    public void realizarLuchas() {

        System.out.println("QUE COMIENZE EL JUEGO!!!");
        for (Luchador luchador: luchadores) {
            luchador.luchar();

        }

        System.out.println("EL JUEGO HA TERMINADO!!!");
    }
}
