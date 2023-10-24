package Builder.services;

import Builder.models.Camera;
import Builder.models.Ram;

public interface IBuilder {
    void addRam(Ram ram);
    void addCamera(Camera camera);
}
