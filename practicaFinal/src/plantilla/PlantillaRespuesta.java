package plantilla;

import java.util.Objects;

public class PlantillaRespuesta {

    private String texto;

    public PlantillaRespuesta(){
    }
    public PlantillaRespuesta(String texto){
        this.texto = texto;
    }

    public String getTexto(){
        return texto;
    }

    public void setTexto(String texto){
        this.texto = texto;
    }

    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if ( getClass() != obj.getClass())
            return false;
            PlantillaRespuesta other = (PlantillaRespuesta) obj;
            return Objects.equals(texto, other.texto);

}

public String toString() {
        return "PlantillaRespuesta [texto=" + texto +"]";
}



}
