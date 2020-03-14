package com.company;

public class Mago extends Heroe implements Luchador {
    public Mago(Integer experienciaHeroe, Criatura criatura) {
        super(experienciaHeroe, criatura);
    }


    public void resucitarGuerrero() {
        //todo CODEAR BRO

    }

    @Override
    public void luchar() {
        Integer nuevaExperiencia;
        if (getExperienciaHeroe() > getCriatura().getNivelDeAtaque()) {
            System.out.println("El mago gano.");
            nuevaExperiencia = getExperienciaHeroe() + 2;
            System.out.println("La nueva experiencia del mago es: " + nuevaExperiencia);

        } else {
            Integer otraExperiencia;
            otraExperiencia = getExperienciaHeroe() - 1;
            System.out.println("El mago perdio y su nueva experiencia es: " + otraExperiencia);
        }
    }
}