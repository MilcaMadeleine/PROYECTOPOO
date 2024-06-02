public class Receta {
        private String nombre;
        private String dosis;
        private String frecuencia;
        private String indicaciones;
        private double precio;

    public Receta(String nombre, String dosis, String frecuencia, String indicaciones, double precio) {
        this.nombre = nombre;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.indicaciones = indicaciones;
        this.precio = precio;
    }
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDosis() {
            return dosis;
        }

        public void setDosis(String dosis) {
            this.dosis = dosis;
        }

        public String getFrecuencia() {
            return frecuencia;
        }

        public void setFrecuencia(String frecuencia) {
            this.frecuencia = frecuencia;
        }

        public String getIndicaciones() {
            return indicaciones;
        }

        public void setIndicaciones(String indicaciones) {
            this.indicaciones = indicaciones;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }
    }
