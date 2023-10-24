package Singleton;

import java.util.ArrayList;
import java.util.List;

public class Journalisation {

    private static Journalisation INSTANCE = new Journalisation();
    private List<String> logs = new ArrayList<>();

    private Journalisation(){}

    public static Journalisation getInstance()
    {   return INSTANCE;
    }

    public void ajouterLog(String msg){
        this.logs.add(msg);
    }

    public void getLog(){
        for (String s : logs){
            System.out.println(s);
        }
    }
}
