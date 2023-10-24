package Builder.models;

public class IphoneXProduct {
    private Camera camera;
    private Ram ram;
    public IphoneXProduct(Camera camera, Ram ram) {
        this.camera = camera;
        this.ram = ram;
    }
    public Camera getCamera() {
        return camera;
    }
    public Ram getRam() {
        return ram;
    }
    public String toString() {
        return "Iphone X\n"+"\tLa Ram: »"
                +ram.getTaille()+"Go "
                +"\tType de RAM: "+ram.getType()
                +"\n\tRésolution caméra: "
                +camera.getResolution()
                +"p\tType: "+camera.getType();
    }
}
