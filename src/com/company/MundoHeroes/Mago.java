package com.company.MundoHeroes;

import com.company.MundoCriaturas.Criatura;

public class Mago extends Heroe implements Luchador {
    public Mago(Integer experienciaHeroe, Criatura criatura) {
        super(experienciaHeroe, criatura);
    }

    public Mago(Integer experienciaHeroe) {
        super(experienciaHeroe);
    }

    public void resucitarGuerrero(Guerrero guerrero) {
        if (guerrero.getExperienciaHeroe() <= getExperienciaHeroe()) {
            System.out.println("Voy a revivir a este guerrero con vida " + guerrero.getNivelDeVida());
            System.out.println("Guerrero resucitado, su nueva vida es de " + guerrero.setNivelDeVida(20));

        } else {
            System.out.println("Mi experiencia es menor, no puedo resucitar");
        }
    }

    @Override
    public void luchar() {
        Integer nuevaExperiencia;
        if (getExperienciaHeroe() > getCriatura().getNivelDeAtaque()) {
            System.out.println("El mago gano.");
            nuevaExperiencia = getExperienciaHeroe() + 2;
            System.out.println("La nueva experiencia del mago es " + nuevaExperiencia);

        } else {
            Integer otraExperiencia;
            otraExperiencia = getExperienciaHeroe() - 1;
            System.out.println("El mago perdio y su nueva experiencia es " + otraExperiencia);
        }
    }
}