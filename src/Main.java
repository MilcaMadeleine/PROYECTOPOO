import java.util.Date;
public class Main {
    public static void main(String[] args) {

                // Detalles del paciente
                Paciente paciente = new Paciente("Andres Zurita", new Date(), "Masculino", "1234567890",
                        "Av Siempreviva", "123-456-7890", "Ninguna", "Hipertenso", "O+");

                //  Crear un agendamiento de cita medica
                Agendamiento agendamiento = new Agendamiento(paciente, new Date(), "10:00", "Dr. Rodriguez Andres",
                        "Cardiología", "Pendiente", "Ninguna");

                // Asignar datos del médico
                Medico medico = new Medico("Dr. Rodriguez Andres", "Cardiología", "Veris",
                        "Lunes a Viernes, 9:00 - 17:00", "123-456-7890");

                // Definir la historia clínica
                HistoriaClinica historiaClinica = new HistoriaClinica(paciente, new Date(), medico,
                        "Control mensual", "Aunque se ve mejoria con respecto a su hipertension , es recomendable seguir con el tratamiento para evitar algun accidente cerebrovascular", "Analgésicos y reposo");

                // Receta del paciente
                Receta receta = new Receta("losartan", "100 mg", "Cada 6 horas", "Consumir luego de haber ingerido alimentos , tomar agua , realizar ejercicios", 5.99);

                // Creacion del examen
                Examen examen = new Examen(paciente, new Date(), "Electrocardiograma", "Ritmo sinusal regular, una frecuencia cardíaca normal, intervalos cardíacos normales y ondas T normales. Este tipo de ECG indicaría una función cardíaca normal sin signos de enfermedad cardíaca, arritmias o isquemia.");

                // Crear una factura
                Factura factura = new Factura(paciente, new Date(), "Consulta médica", 0.16, 150.00, "Tarjeta de crédito", "F2024001");

                // Imprimir datosg
                System.out.println("Detalles del paciente:");
                System.out.println("Nombre: " + paciente.getNombre());
                System.out.println("Fecha de nacimiento: " + paciente.getFechaNacimiento());
                System.out.println("Género: " + paciente.getGenero());
                System.out.println("Identificación: " + paciente.getIdentificacion());
                System.out.println("Dirección: " + paciente.getDireccion());
                System.out.println("Teléfono: " + paciente.getTelefono());
                System.out.println("Alergias: " + paciente.getAlergias());
                System.out.println("Historial médico: " + paciente.getHistorialMedico());
                System.out.println("Tipo de sangre: " + paciente.getTipoSangre());
                System.out.println();

                System.out.println("Detalles del agendamiento:");
                System.out.println("Paciente: " + agendamiento.getPaciente().getNombre());
                System.out.println("Fecha: " + agendamiento.getFecha());
                System.out.println("Hora: " + agendamiento.getHora());
                System.out.println("Médico: " + agendamiento.getMedico());
                System.out.println("Especialidad: " + agendamiento.getEspecialidad());
                System.out.println("Estado: " + agendamiento.getEstado());
                System.out.println("Observaciones: " + agendamiento.getObservaciones());
                System.out.println();

                System.out.println("Detalles del médico:");
                System.out.println("Nombre: " + medico.getNombre());
                System.out.println("Especialidad: " + medico.getEspecialidad());
                System.out.println("Dirección del consultorio: " + medico.getDireccionConsultorio());
                System.out.println("Horario de atención: " + medico.getHorarioAtencion());
                System.out.println("Teléfono del consultorio: " + medico.getTelefonoConsultorio());
                System.out.println();

                System.out.println("Detalles de la historia clínica:");
                System.out.println("Paciente: " + historiaClinica.getPaciente().getNombre());
                System.out.println("Fecha: " + historiaClinica.getFecha());
                System.out.println("Médico: " + historiaClinica.getMedico().getNombre());
                System.out.println("Motivo de la consulta: " + historiaClinica.getMotivoConsulta());
                System.out.println("Diagnóstico: " + historiaClinica.getDiagnostico());
                System.out.println("Tratamiento: " + historiaClinica.getTratamiento());
                System.out.println();

                System.out.println("Detalles de la receta:");
                System.out.println("Nombre: " + receta.getNombre());
                System.out.println("Dosis: " + receta.getDosis());
                System.out.println("Frecuencia: " + receta.getFrecuencia());
                System.out.println("Indicaciones: " + receta.getIndicaciones());
                System.out.println("Precio: " + receta.getPrecio());
                System.out.println();

                System.out.println("Detalles del examen:");
                System.out.println("Paciente: " + examen.getPaciente().getNombre());
                System.out.println("Fecha: " + examen.getFecha());
                System.out.println("Tipo de examen: " + examen.getTipoExamen());
                System.out.println("Resultado: " + examen.getResultado());
                System.out.println();

                System.out.println("Detalles de la factura:");
                System.out.println("Paciente: " + factura.getObtenerPaciente().getNombre());
                System.out.println("Fecha: " + factura.getFecha());
                System.out.println("Descripción de servicios: " + factura.getDescripcionServicios());
                System.out.println("IVA: " + factura.getIVA());
                System.out.println("Monto total: " + factura.getMontoTotal());
                System.out.println("Forma de pago: " + factura.getFormaPago());
                System.out.println("Número de factura: " + factura.getNumeroFactura());
            }
        }