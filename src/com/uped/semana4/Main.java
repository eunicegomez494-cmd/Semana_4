package com.uped.semana4;

import com.uped.semana4.modelo.Vehiculo;
import com.uped.semana4.modelo.ConfiguracionReporte;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA EJERCICIO 8.2: VEHICULO ===");
        Vehiculo v1 = Vehiculo.nuevo("P123-789", "Kia");
        System.out.println(v1);
        v1.recorrer(150);
        System.out.println(v1);
        v1.recorrer(-20);

        System.out.println("\n=== PRUEBA EJERCICIO 8.4: PATRÓN BUILDER ===");
        ConfiguracionReporte config = new ConfiguracionReporte.Builder()
                .titulo("Reporte de Ventas")
                .conGrafico()
                .build();
        System.out.println(config);
    }
}