package padroesestruturais_exercicios.adapter;

public class Distancia {
    IConversao conversao;
    ConversaoAdapter persistencia;

    public Distancia() {
        conversao = new ConversaoMilhas();
        persistencia = new ConversaoAdapter(conversao);
    }

    public void setConversao(float milha) {
        conversao.setConversao(milha);
        persistencia.salvarConversao();
    }

    public float getConversao() {
        return persistencia.recuperarConversao();
    }

    // Método apenas para mostrar que está convertendo conceito para nota através do adaptador
    public float getKm() {
        return persistencia.getKm();
    }
}
