package Builder.models;

import Builder.enums.TypeRAM;

public class Ram {

    private int taille;
    private TypeRAM type;
    public Ram() {
        this.taille = 4;
        this.type = TypeRAM.DDR3;
    }
    public Ram(int taille, TypeRAM type) {
        this.taille = taille;
        this.type = type;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public TypeRAM getType() {
        return type;
    }

    public void setType(TypeRAM type) {
        this.type = type;
    }
}
