package padroesestruturaisteste_exercicios.adapter;
import org.junit.jupiter.api.Test;
import padroesestruturais_exercicios.adapter.Distancia;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class DistanciaTest {
    @Test
    void deveRetornarTemperaturaMilha() {
        Distancia distancia = new Distancia();
        distancia.setConversao(10);

        assertEquals(10, distancia.getConversao());
    }

    @Test
    void deveRetornarTemperaturaKm() {
        Distancia distancia = new Distancia();
        distancia.setConversao(1.609F);

        assertEquals(1, distancia.getKm());
    }
}
