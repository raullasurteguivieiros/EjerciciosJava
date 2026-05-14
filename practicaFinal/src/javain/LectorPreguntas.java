package javain;

import java.util.List;
import plantilla.PlantillaPregunta;

public interface LectorPreguntas {

    PlantillaPregunta leerSiguientePregunta();

    boolean hayMasPreguntas();

    List<PlantillaPregunta> leerTodasPreguntas();
}
