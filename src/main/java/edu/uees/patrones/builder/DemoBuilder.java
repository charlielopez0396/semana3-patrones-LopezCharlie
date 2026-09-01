package edu.uees.patrones.builder;

public class DemoBuilder {

    public static void main(String[] args) {

        Reserva reservaPresencial = new ReservaBuilder()
                .conEstudiante("Carlos Mendoza")
                .conAsignatura("Diseño de Software")
                .conFecha("05/09/2026")
                .conHora("18:00")
                .conDocente("Ing. Pérez")
                .conTema("Patrones de diseño")
                .conObservaciones("Revisar Factory Method y Builder")
                .build();

        Reserva reservaVirtual = new ReservaBuilder()
                .conEstudiante("Andrea López")
                .conAsignatura("Programación Orientada a Objetos")
                .conFecha("06/09/2026")
                .conHora("19:00")
                .conDocente("Ing. Ramírez")
                .conModalidad("Virtual")
                .conTema("Principios SOLID")
                .conEstado(EstadoReserva.CONFIRMADA)
                .build();

        System.out.println("=== RESERVA 1 ===");
        System.out.println(reservaPresencial);

        System.out.println();

        System.out.println("=== RESERVA 2 ===");
        System.out.println(reservaVirtual);

        System.out.println();
        System.out.println("=== PRUEBA DE VALIDACIÓN ===");

        try {

            Reserva reservaInvalida = new ReservaBuilder()
                    .conEstudiante("Pedro Torres")
                    .conAsignatura("Diseño de Software")
                    .conFecha("07/09/2026")
                    // No se especifica la hora intencionalmente
                    .build();

            System.out.println(reservaInvalida);

        } catch (IllegalStateException e) {
            System.out.println(
                    "Reserva no creada: " + e.getMessage());
        }
    }
}