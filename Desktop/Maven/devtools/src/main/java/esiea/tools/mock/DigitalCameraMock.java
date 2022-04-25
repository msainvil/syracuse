package esiea.tools.mock;

import java.awt.*;

public class DigitalCameraMock implements IDigitalCamera{
    @Override
    public Image takeSnapshot() {
        return null;
    }

    @Override
    public void flashLightOn() {
        System.out.println(" Flash !!! Cheese !");
    }

    @Override
    public void flashLightOff() {
        System.out.println("Nothing happen");
    }
}
