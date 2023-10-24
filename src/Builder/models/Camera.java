package Builder.models;

import Builder.enums.TypeCAM;

public class Camera {

    private int resolution;
    private TypeCAM type;
    public Camera() {
        this.resolution = 720;
        this.type = TypeCAM.HD;
    }
    public Camera(int resolution, TypeCAM type) {
        this.resolution = resolution;
        this.type = type;
    }
    public int getResolution() {
        return resolution;
    }
    public void setResolution(int resolution) {
        this.resolution = resolution;
    }
    public TypeCAM getType() {
        return type;
    }
    public void setType(TypeCAM type) {
        this.type = type;
    }
}
