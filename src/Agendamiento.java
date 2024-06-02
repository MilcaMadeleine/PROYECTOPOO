import java.util.Date;

public class Agendamiento {
    private Paciente paciente;
    private Date fecha;
    private String hora;
    private String medico;
    private String especialidad;
    private String estado;
    private String observaciones;

    public Agendamiento(Paciente paciente, Date fecha, String hora, String medico, String especialidad,
                        String estado, String observaciones) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.medico = medico;
        this.especialidad = especialidad;
        this.estado = estado;
        this.observaciones = observaciones;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
