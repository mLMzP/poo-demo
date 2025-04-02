package com.lm2a.solid.l_ko;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private String tarjeta;

    public Persona(String nombre, String apellido, String dni, String tarjeta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void pagar(){
        System.out.println("Pagando con mi DNI "+getDni()+ " y mi tarjeta "+getTarjeta());
    }
}
