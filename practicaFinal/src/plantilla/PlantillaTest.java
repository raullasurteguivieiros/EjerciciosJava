package plantilla;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class PlantillaTest {
    private String nombre;
    private String curso;
    private List<PlantillaPregunta> preguntas;

    public PlantillaTest() {
        preguntas = new ArrayList<>();
    }

    public PlantillaTest(String nombre, String curso) {
        this();
        this.nombre = nombre;
        this.curso = curso;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }
    public void addPregunta(PlantillaPregunta p) {
        this.preguntas.add(p);
    }

    public void addPreguntas(List<PlantillaPregunta> lista) {
        this.preguntas.addAll(lista);
    }

    public boolean removePregunta(PlantillaPregunta p) {
        return this.preguntas.remove(p);
    }

    public List<PlantillaPregunta> getPreguntas() {
        return Collections.unmodifiableList(preguntas);
    }


    public int hashCode(){
        return Objects.hash(curso, nombre, preguntas);
    }

    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PlantillaTest other = (PlantillaTest) obj;
        return Objects.equals(curso, other.curso) && Objects.equals(nombre, other.nombre) && Objects.equals(preguntas, other.preguntas);

    }

    public String toString() {
        return "PlantillaTest [nombre" +nombre+ ",curso=" +curso+ ", preguntas=" + preguntas + "]";
    }


}
