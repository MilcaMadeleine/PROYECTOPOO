import java.util.Date;
public class Examen {
    private Paciente paciente;
    private Date fecha;
    private String tipoExamen;
    private String resultado;

    public Examen(Paciente paciente, Date fecha, String tipoExamen, String resultado) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.tipoExamen = tipoExamen;
        this.resultado = resultado;
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

    public String getTipoExamen() {
        return tipoExamen;
    }

    public void setTipoExamen(String tipoExamen) {
        this.tipoExamen = tipoExamen;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
