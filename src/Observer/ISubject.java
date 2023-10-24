package Observer;

public interface ISubject {

    void ajouter(IObserver o);
    void supprimer(IObserver o);
    void notifier(int valeur);

}
