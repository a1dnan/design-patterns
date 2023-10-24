package Observer;

import Observer.capteurs.Humidite;
import Observer.capteurs.LumiereAmbiante;
import Observer.capteurs.Temperature;
import Observer.observateurs.Conducteur;
import Observer.observateurs.OrdinateurDeBord;

public class main {

    public static void main(String[] args) {

        Conducteur conducteur = new Conducteur();
        OrdinateurDeBord ordinateurDeBord = new OrdinateurDeBord();

        Humidite humidite = new Humidite();
        LumiereAmbiante lumiereAmbiante = new LumiereAmbiante();
        Temperature temperature = new Temperature();

        humidite.ajouter(ordinateurDeBord);

        lumiereAmbiante.ajouter(ordinateurDeBord);

        temperature.ajouter(conducteur);
        temperature.ajouter(ordinateurDeBord);

        humidite.setTauxHumidite(100);
        humidite.getTauxHumidite();

        lumiereAmbiante.setTauxLumiere(60);
        lumiereAmbiante.getTauxLumiere();

        temperature.setTemperature(90);
        temperature.getTemperature();

    }
}
