import java.util.ArrayList;

public class Estudiante {

    private String nombre;
    private String apellido;
    private int codigoUnico;
    private String fecha;
    private String email;
    private ArrayList<Examen> examenes;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setCodigoUnico(int codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public int getCodigoUnico() {
        return codigoUnico;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setExamenes(ArrayList<Examen> examenes) {
        this.examenes = examenes;
    }

    public int getNotas(String correcto) { // Se agregó para recorrer las notas de cada estudiante
        int nota = -1;

        for (Examen examen : this.examenes) {
            if (examen.getNombre() == correcto) {
                nota = examen.getNota();
            }
        }

        return nota;
    }
}
