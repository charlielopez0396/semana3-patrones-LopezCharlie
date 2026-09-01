package edu.uees.patrones.builder;

public class Reserva {

    private final String estudiante;
    private final String asignatura;
    private final String fecha;
    private final String hora;

    private final String docente;
    private final String modalidad;
    private final String tema;
    private final String observaciones;
    private final EstadoReserva estado;

    Reserva(
            String estudiante,
            String asignatura,
            String fecha,
            String hora,
            String docente,
            String modalidad,
            String tema,
            String observaciones,
            EstadoReserva estado
    ) {
        this.estudiante = estudiante;
        this.asignatura = asignatura;
        this.fecha = fecha;
        this.hora = hora;
        this.docente = docente;
        this.modalidad = modalidad;
        this.tema = tema;
        this.observaciones = observaciones;
        this.estado = estado;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getDocente() {
        return docente;
    }

    public String getModalidad() {
        return modalidad;
    }

    public String getTema() {
        return tema;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Reserva {" +
                "\n  estudiante='" + estudiante + '\'' +
                ",\n  asignatura='" + asignatura + '\'' +
                ",\n  fecha='" + fecha + '\'' +
                ",\n  hora='" + hora + '\'' +
                ",\n  docente='" + docente + '\'' +
                ",\n  modalidad='" + modalidad + '\'' +
                ",\n  tema='" + tema + '\'' +
                ",\n  observaciones='" + observaciones + '\'' +
                ",\n  estado='" + estado + '\'' +
                "\n}";
    }
}