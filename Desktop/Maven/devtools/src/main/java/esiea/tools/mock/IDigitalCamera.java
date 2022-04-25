package esiea.tools.mock;
import java.awt.Image;

public interface IDigitalCamera {
    public Image takeSnapshot();
    public void flashLightOn();
    public void flashLightOff();
}
