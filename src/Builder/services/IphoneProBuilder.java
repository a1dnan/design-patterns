package Builder.services;

import Builder.models.Camera;
import Builder.models.IphoneProProduct;
import Builder.models.IphoneXProduct;
import Builder.models.Ram;

import java.util.ArrayList;
import java.util.List;

public class IphoneProBuilder implements IBuilder{
    private List<Camera> camera=new ArrayList<>();
    private Ram ram;

    @Override
    public void addRam(Ram ram) {
        this.ram=ram;

    }

    @Override
    public void addCamera(Camera camera) {
        this.camera.add(camera);
    }
    public IphoneProProduct getIphonePro() {
        return new IphoneProProduct(camera,ram);
    }
}