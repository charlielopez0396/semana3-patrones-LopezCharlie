package edu.uees.patrones.builder;

public class ReservaBuilder {

    private String estudiante;
    private String asignatura;
    private String fecha;
    private String hora;

    private String docente;
    private String modalidad = "Presencial";
    private String tema;
    private String observaciones;
    private EstadoReserva estado = EstadoReserva.PENDIENTE;

    public ReservaBuilder conEstudiante(String estudiante) {
        this.estudiante = estudiante;
        return this;
    }

    public ReservaBuilder conAsignatura(String asignatura) {
        this.asignatura = asignatura;
        return this;
    }

    public ReservaBuilder conFecha(String fecha) {
        this.fecha = fecha;
        return this;
    }

    public ReservaBuilder conHora(String hora) {
        this.hora = hora;
        return this;
    }

    public ReservaBuilder conDocente(String docente) {
        this.docente = docente;
        return this;
    }

    public ReservaBuilder conModalidad(String modalidad) {
        this.modalidad = modalidad;
        return this;
    }

    public ReservaBuilder conTema(String tema) {
        this.tema = tema;
        return this;
    }

    public ReservaBuilder conObservaciones(String observaciones) {
        this.observaciones = observaciones;
        return this;
    }

    public ReservaBuilder conEstado(EstadoReserva estado) {
        this.estado = estado;
        return this;
    }

    public Reserva build() {

        validarObligatorios();

        return new Reserva(
                estudiante,
                asignatura,
                fecha,
                hora,
                docente,
                modalidad,
                tema,
                observaciones,
                estado
        );
    }

    private void validarObligatorios() {

        if (estudiante == null || estudiante.isBlank()) {
            throw new IllegalStateException(
                    "El estudiante es obligatorio."
            );
        }

        if (asignatura == null || asignatura.isBlank()) {
            throw new IllegalStateException(
                    "La asignatura es obligatoria."
            );
        }

        if (fecha == null || fecha.isBlank()) {
            throw new IllegalStateException(
                    "La fecha es obligatoria."
            );
        }

        if (hora == null || hora.isBlank()) {
            throw new IllegalStateException(
                    "La hora es obligatoria."
            );
        }
    }
}