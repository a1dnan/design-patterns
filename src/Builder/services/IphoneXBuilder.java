package Builder.services;

import Builder.models.Camera;
import Builder.models.IphoneXProduct;
import Builder.models.Ram;

public class IphoneXBuilder implements IBuilder{
    private Camera camera;
    private Ram ram;

    @Override
    public void addRam(Ram ram) {
        this.ram=ram;
    }
    @Override
    public void addCamera(Camera camera) {
        this.camera=camera;
    }

    public IphoneXProduct getIphoneX() {
        return new IphoneXProduct(camera,ram);
    }
}