package model.test;

import java.util.*;

public class Pregunta {

    private static final String IDS = "abcdefghijklmnopqrstuvwxyz";

    private int id;
    private String texto;
    private List<String> idsRespuestasCorrectas;
    private List<Respuesta> respuestas;

}
public Pregunta() {
    respuestas = new ArrayList<Respuesta>();
    idsRespuestasCorrectas = new ArrayList<>();
}

public Pregunta(int id, String texto) {
    this();
    this.id = id;
    this.texto = texto;
}
public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getTexto() {
    return texto;
}

public void setTexto(String texto) {
    this.texto = texto
}
@Override
public int hashCode() {
    return Objects.hash(id, idsRespuestasCorrectas, respuestas, texto);
}



@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Pregunta other = (Pregunta) obj;
    return id == other.id && Objects.equals(other.idsRespuestasCorrectas, idsRespuestasCorrectas)
            && Objects.equals(respuestas, other.respuestas) && Objects.equals(texto, other.texto);
}

public String toString() {
    return "Pregunta [id=" + id + ", texto=" + texto + ", idsRespuestasCorrectas=" + idsRespuestasCorrectas
            + ", respuestas=" + respuestas + "]";
}
public List<Respuesta> getRespuestas() {
    return Collections.unmodifiableList(respuestas);
}

public void addRespuesta(Respuesta r) {
    this.respuestas.add(r);

    if (r.esCorrecta()) {
        idsRespuestasCorrectas.add(r.getId());
    }
}
public void addVariasRespuestas(List<Respuesta> lista) {
    for (Respuesta r : lista) {
        addRespuesta(r);
    }
}
public List<String> getIdsRespuestasCorrectas() {
    return Collections.unmodifiableList(idsRespuestasCorrectas);
}

private void actualizarIds() {
    String[] letras = IDS.split("");
    for (int i = 0; i < respuestas.size(); i++) {
        respuestas.get(i).setId(letras[i]);
    }
}

public void desordenarRespuestas() {
    // Random r = new Random(System.currentTimeMillis());
    Random r = new Random(Double.doubleToLongBits(Math.random()));

    Collections.shuffle(respuestas, r);

    // Reajustamos los ids de las respuestas una vez ordenados
    actualizarIds();

    // Actualizamos los ids de las respuestas correctas
    idsRespuestasCorrectas = respuestas.stream()
            .filter(Respuesta::esCorrecta)
            .map(Respuesta::getId)
            .toList();
}
}


