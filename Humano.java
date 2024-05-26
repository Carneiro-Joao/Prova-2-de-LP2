public class Humano extends Animal implements Racional {
    public Humano(String som) {
        super(som);
    }

    @Override
    public void Comunicar() {
        System.out.println("Posso falar qualquer coisa.");
    }

    @Override
    public void Comunicar(String frase) {
        System.out.println(frase);
    }
}
