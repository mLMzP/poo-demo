package com.lm2a.heritage.ejercicio;

public class EjecutaVehiculo {

    public static void main(String[] args) {
        Automovil a1 = new Automovil(110,"Volvo 540", 4, 5, 4 );
        Motocicleta m1 = new Motocicleta(20, "Yamaha 100", 2, 2);
        Autobus au1 = new Autobus(400, "Mercedes", 6, 22, 2, 22);

        a1.mostrarCaracteristicas();
        m1.mostrarCaracteristicas();
        au1.mostrarCaracteristicas();

        a1.pruebaDelMotor();
        m1.pruebaDelMotor();
        au1.pruebaDelMotor();
    }
}
