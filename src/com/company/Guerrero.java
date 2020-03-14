package com.company;

public class Guerrero extends Heroe implements Luchador {
    private Integer nivelDeVida;

    public Integer getNivelDeVida() {
        return nivelDeVida;
    }

    public Integer setNivelDeVida(Integer nuevoNivelDeVida) {
        this.nivelDeVida = nuevoNivelDeVida;
        return nuevoNivelDeVida;
    }

    public Guerrero(Integer experienciaHeroe, Criatura criatura, Integer nivelDeVida) {
        super(experienciaHeroe, criatura);
        this.nivelDeVida = nivelDeVida;
    }


    @Override
    public void luchar() {
        //todo codea
        Integer nuevaExperiencia;

        if (getNivelDeVida().equals(0)) {
            System.out.println("El guerrero no puede luchar y debe esperar a su resurreccion.");
        } else if (getExperienciaHeroe() > getCriatura().getNivelDeAtaque()) {
            System.out.println("El guerrero gano.");
            nuevaExperiencia = getExperienciaHeroe() + 1;
            System.out.println("El nuevo nivel de experiencia del guerrero es " + nuevaExperiencia);

        } else {
            nivelDeVida = 0;
            System.out.println("El guerrero perdio y se quedo con vida " + getNivelDeVida());
        }
    }

}
