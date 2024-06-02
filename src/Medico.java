public class Medico {
    private String nombre;
    private String especialidad;
    private String direccionConsultorio;
    private String horarioAtencion;
    private String telefonoConsultorio;

    public Medico(String nombre, String especialidad, String direccionConsultorio,
                  String horarioAtencion, String telefonoConsultorio) {

        this.nombre = nombre;
        this.especialidad = especialidad;
        this.direccionConsultorio = direccionConsultorio;
        this.horarioAtencion = horarioAtencion;
        this.telefonoConsultorio = telefonoConsultorio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public String getDireccionConsultorio() {
        return direccionConsultorio;
    }

    public void setDireccionConsultorio(String direccionConsultorio) {
        this.direccionConsultorio = direccionConsultorio;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public String getTelefonoConsultorio() {
        return telefonoConsultorio;
    }

    public void setTelefonoConsultorio(String telefonoConsultorio) {
        this.telefonoConsultorio = telefonoConsultorio;
    }

    public void actualizarNombre(String s) {
    }
}
