package padroesestruturais_exercicios.adapter;

public class ConversaoAdapter extends ConversaoKm{
    private IConversao conversaoMilha;

    public ConversaoAdapter (IConversao conversaoMilha){
        this.conversaoMilha = conversaoMilha;}

    public float recuperarConversao() {
        float resultado = (float) (this.getKm() * 1.609);
        conversaoMilha.setConversao(resultado);
        return conversaoMilha.getConversao();
    }

    public void salvarConversao() {
        float resultado2 = (float) (conversaoMilha.getConversao()/ 1.609);
        this.setKm(resultado2);
    }
}
