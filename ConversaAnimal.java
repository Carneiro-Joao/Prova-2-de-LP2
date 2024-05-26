public class ConversaAnimal {
    public static void main(String[] args) {
        Humano homem = new Humano("Ola.");
        Animal cachorro = new Animal("Au au.");
    }

    public static void Dialogar(Animal A1) {
        A1.Comunicar();
        if (A1 instanceof Humano) {
            Humano H = (Humano) A1;
            H.Comunicar("Boa prova!");
        }
    }
}

// A)
// Se na linha 5 adicionarmos "Dialogar(homem);"
// Teremos como saída: Posso falar qualquer coisa.
//                     Boa prova! 

// B)
// Se na linha 5 adicionarmos "Dialogar(cachorro);"
// Teremos como saída: Au au.

// C)
// Se trocarmos "Humano H = (Humano) A1;" por
//              "Animal H = (Humano) A1;" teremos erro no código.

// D)
// Se na linha 4 Trocarmos "Animal cachorro = new Animal("Au au.");" por
//                         "Animal cachorro = humano;"
// e chamarmos a função "Dialogar(cachorro);" na linha 5 teremos:
// Posso falar qualquer coisa.
// Boa prova!
// Como saída.
