public class Examen {
    
    private String nombre;
    private int nota;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public Examen(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
}
