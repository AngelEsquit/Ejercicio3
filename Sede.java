import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sede {
    
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEstudiantes(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public float getPromedio(String tipoExamen) {
        ArrayList<Integer> notas = new ArrayList<>();
        int total = 0;
        float prom = 0;
                
        for (Estudiante estudiante: this.estudiantes) {
            if (estudiante.getNotas(tipoExamen) != -1) {
                notas.add(estudiante.getNotas(tipoExamen));
                total += estudiante.getNotas(tipoExamen);
            }
        }

        int conteo = notas.size();

        if (conteo == 0) {
            prom = -1;
        }

        prom = total/conteo;

        return prom;
    }

    public int getMediana(String tipoExamen) {
        ArrayList<Integer> notas = new ArrayList<>();
        int mediana;

        for (Estudiante estudiante: this.estudiantes) {
            if (estudiante.getNotas(tipoExamen) != -1) {
                notas.add(estudiante.getNotas(tipoExamen));
            }
        }

        Collections.sort(notas);

        int conteo = notas.size();

        if (conteo == 0) {
            mediana = -1;
        }

        else {
            if (conteo % 2 == 0) {
                mediana = notas.get(conteo / 2);
            } else {
                mediana = notas.get(Math.round(conteo / 2));
            }
        }

        return mediana;
    }

    public int getModa(String tipoExamen) {
        ArrayList<Integer> notas = new ArrayList<>();
        
        for (Estudiante estudiante: this.estudiantes) {
            if (estudiante.getNotas(tipoExamen) != -1) {
                notas.add(estudiante.getNotas(tipoExamen));
            }
        }

        int[] notasArray = new int[notas.size()];
        for (int i = 0; i < notas.size(); i++) {
            notasArray[i] = notas.get(i);
        }

        Arrays.sort(notasArray);

        int moda = notasArray[0];
        int frecuenciaMax = 1;
        int frecuenciaActual = 1;

        for (int i = 1; i < notasArray.length; i++) {
            if (notasArray[i] == notasArray[i - 1]) {
                frecuenciaActual++;
            } else {
                frecuenciaActual = 1;
            }

            if (frecuenciaActual > frecuenciaMax) {
                frecuenciaMax = frecuenciaActual;
                moda = notasArray[i];
            }
        }

        int conteo = notas.size();

        if (conteo == 0) {
            moda = -1;
        }

        return moda;
    }

    public float getDesviacionEstandar(String tipoExamen) {
        ArrayList<Integer> notas = new ArrayList<>();
        int total = 0;
        float prom = 0;
    
        for (Estudiante estudiante: this.estudiantes) {
            if (estudiante.getNotas(tipoExamen) != -1) {
                notas.add(estudiante.getNotas(tipoExamen));
                total += estudiante.getNotas(tipoExamen);
            }
        }
    
        int conteo = notas.size();
    
        if (conteo == 0) {
            return -1;
        }
    
        prom = (float) total / conteo;
    
        float varianza = 0;
        for (int nota : notas) {
            varianza += Math.pow(nota - prom, 2);
        }
        varianza /= conteo;
    
        float desviacionEstandar = (float) Math.sqrt(varianza);
    
        return desviacionEstandar;
    }

    public int getMax(String tipoExamen) {
        ArrayList<Integer> notas = new ArrayList<>();
        int max;

        for (Estudiante estudiante: this.estudiantes) {
            if (estudiante.getNotas(tipoExamen) != -1) {
                notas.add(estudiante.getNotas(tipoExamen));
            }
        }

        Collections.sort(notas);

        int conteo = notas.size();

        if (conteo == 0) {
            max = -1;
        }

        else {
            max = notas.get(notas.size() - 1);
        }

        return max;
    }

    public int getMin(String tipoExamen) {
        ArrayList<Integer> notas = new ArrayList<>();
        int min;

        for (Estudiante estudiante: this.estudiantes) {
            if (estudiante.getNotas(tipoExamen) != -1) {
                notas.add(estudiante.getNotas(tipoExamen));
            }
        }

        Collections.sort(notas);

        int conteo = notas.size();

        if (conteo == 0) {
            min = -1;
        }

        else {
            min = notas.get(0);
        }

        return min;
    }
}
