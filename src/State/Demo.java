package State;

public class Demo {
    public static void main(String[] args) {
        Guichet gab = new Guichet();

        gab.insererCarte();
        gab.saisirPin(0000);
        gab.retrait(1000);

        gab.insererCarte();
        gab.ejecterCarte();

        gab.saisirPin(0000);
        gab.retrait(900);



    }
}
