package padroesestruturais_exercicios.adapter;

public class ConversaoMilhas implements IConversao{
    private float milha;

    @Override
    public float getConversao() {
        return this.milha;
    }

    @Override
    public void setConversao(float milha) {
        this.milha = milha;
    }
}
