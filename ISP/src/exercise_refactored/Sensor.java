package exercise_refactored;

import java.util.Random;

public class Sensor
{
    public void register(ProximityBasedDoor door)
    {
        while (true) {
            if (isPersonClose()) {
                door.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}