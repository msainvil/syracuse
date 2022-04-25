package esiea.tools.mock;
import java.awt.Image;

public class DigitalPhotographer {
    private IDigitalCamera digitalCamera;

    public void setDigitalCamera(IDigitalCamera f){}
    public Image takePictureWithoutFlash(){
        return null;
    }

    public Image takePictureWithFlash(){
        return null;
    }


}
