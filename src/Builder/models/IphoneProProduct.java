package Builder.models;

import java.util.ArrayList;
import java.util.List;

public class IphoneProProduct {
    private List<Camera> camera=new ArrayList<Camera>();;
    private Ram ram;
    public IphoneProProduct(List<Camera> camera, Ram ram) {
        this.camera = camera;
        this.ram = ram;
    }
    public List<Camera> getCamera() {
        return camera;
    }
    public Ram getRam() {
        return ram;
    }
    public String toString() {
        String affichage ="Iphone Pro\n"+"\tLa Ram: "
                +ram.getTaille()+"Go, "
                +"\tType de RAM: "+ram.getType()+"\n";
        int i=1;
        for(Camera cam:camera) {
            affichage+="\tRésolution caméra "+
                    " : "+cam.getResolution()
                    +"p, \tType: "+cam.getType()+"\n";
            i++;
        }
        return affichage;
    }
}
