import java.util.Date;

public class Factura {
        private Paciente paciente;
        private Date fecha;
        private String descripcionServicios;
        private double iva;
        private double montoTotal;
        private String formaPago;
        private String numeroFactura;

        // Constructor
        public Factura(Paciente paciente, Date fecha, String descripcionServicios,
                       double iva, double montoTotal, String formaPago, String numeroFactura) {
            this.paciente = paciente;
            this.fecha = fecha;
            this.descripcionServicios = descripcionServicios;
            this.iva = iva;
            this.montoTotal = montoTotal;
            this.formaPago = formaPago;
            this.numeroFactura = numeroFactura;
        }

        // Getters y Setters
        public Paciente getObtenerPaciente() {
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

        public String getDescripcionServicios() {
            return descripcionServicios;
        }

        public void setDescripcionServicios(String descripcionServicios) {
            this.descripcionServicios = descripcionServicios;
        }

        public double getIVA() {
            return iva;
        }

        public void setIVA(double iva) {
            this.iva = iva;
        }

        public double getMontoTotal() {
            return montoTotal;
        }

        public void setMontoTotal(double montoTotal) {
            this.montoTotal = montoTotal;
        }

        public String getFormaPago() {
            return formaPago;
        }

        public void setFormaPago(String formaPago) {
            this.formaPago = formaPago;
        }

        public String getNumeroFactura() {
            return numeroFactura;
        }

        public void setNumeroFactura(String numeroFactura) {
            this.numeroFactura = numeroFactura;
        }
    }

