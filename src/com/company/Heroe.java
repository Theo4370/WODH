package com.company;

public abstract class Heroe {
   private Integer experienciaHeroe;
private Criatura criatura;

   public Heroe(Integer experienciaHeroe, Criatura criatura) {
      this.experienciaHeroe = experienciaHeroe;
      this.criatura = criatura;
   }

   public Heroe(Integer experienciaHeroe) {
      this.experienciaHeroe = experienciaHeroe;
   }

   public Criatura getCriatura() {
      return criatura;
   }

   public Integer getExperienciaHeroe() {
      return experienciaHeroe;
   }
}
