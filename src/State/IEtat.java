package State;

public interface IEtat {

    public void insererCarte();
    public void ejecterCarte();
    public void saisirPin(int pin);
    public void retrait(int montant);
}
