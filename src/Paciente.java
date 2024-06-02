import java.util.Date;

public class Paciente {
    private String nombre;
    private Date fechaNacimiento;
    private String genero;
    private String identificacion;
    private String direccion;
    private String telefono;
    private String alergias;
    private String historialMedico;
    private String tipoSangre;

    public Paciente(String nombre, Date fechaNacimiento, String genero, String identificacion,
                    String direccion, String telefono, String alergias, String historialMedico,
                    String tipoSangre) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.alergias = alergias;
        this.historialMedico = historialMedico;
        this.tipoSangre = tipoSangre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;


    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public void actualizarNombre(String juanPerez) {

    }

    public void actualizarFechaNacimiento(Date date) {
    }

    public void actualizarGenero(String masculino) {
    }

    public void actualizarHistorialMedico(String saludable) {
    }

    public void actualizarIdentificacion(String number) {
    }
}
