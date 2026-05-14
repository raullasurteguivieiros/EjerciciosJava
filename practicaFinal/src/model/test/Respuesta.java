package model.test;

import plantilla.PlantillaRespuesta;

import java.util.Objects;

public class Respuesta {
    private String id;
    private String texto;
    private boolean esCorrecta;

    public Respuesta(String id, String texto, boolean esCorrecta) {
        this.id = id;
        this.texto = texto;
        this.esCorrecta = esCorrecta;
    }
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }


    public boolean esCorrecta() {
        return esCorrecta;
    }

    public void setEsCorrecta(boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }



    public int hashCode(){
        return Objects.hash(esCorrecta, id, texto);
    }
    public static Respuesta of(String id, PlantillaRespuesta plantilla, boolean esCorrecta) {
        return new Respuesta(id, plantilla.getTexto(), esCorrecta);
    }

    public static Respuesta of(PlantillaRespuesta plantilla, boolean esCorrecta) {
        return new Respuesta(null, plantilla.getTexto(), esCorrecta);
    }


    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Respuesta other = (Respuesta) obj;
        return id.equals(other.id);
    }

    public String toString() {
        return "Respuesta [id=" + id + ", texto=" + texto + ", esCorrecta=" + esCorrecta + "]";
    }




}
