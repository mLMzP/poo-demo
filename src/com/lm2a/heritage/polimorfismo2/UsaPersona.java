package com.lm2a.heritage.polimorfismo2;

public class UsaPersona {

    public static void main(String[] args) {
        Persona[] personas = new Persona[3];
        personas[0] = new Ciudadano("Juan Perez", "1234567Q");
        personas[1] = new Turista("John Smith", "QW123T56");
        personas[2] = new Ciudadano("Pedro Ramirez", "2345678W");

        for (Persona persona : personas) {
            imprimirDoc(persona);
        }
    }

    public static void imprimirNombre(Persona persona) {
        System.out.println(persona.getNombre());
    }

    public static void imprimirDoc(Persona persona) {
        System.out.println(persona.getDocumento());
    }

}
