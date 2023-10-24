package Builder.services;

import Builder.enums.TypeCAM;
import Builder.enums.TypeRAM;
import Builder.models.Camera;
import Builder.models.Ram;

public class Director {
    public void construireIphoneX(IBuilder builder) {
        builder.addRam(new Ram(4, TypeRAM.DDR3));
        builder.addCamera(new Camera(1080, TypeCAM.FullHD));
    }
    public void construireIphonePro(IBuilder builder) {
        builder.addRam(new Ram(8,TypeRAM.DDR4));
        builder.addCamera(new Camera(4320,TypeCAM.UHD4K)); // camera 1
        builder.addCamera(new Camera(2160,TypeCAM.FullHD)); // camera 2
        builder.addCamera(new Camera(720,TypeCAM.HD)); // camera 3
    }
}