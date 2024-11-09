package exercise_refactored;

public class ElectronicDuck implements Duck {
    private boolean on = false;

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    @Override
    public void quack() {
        if (!on) 
        	turnOn();
        System.out.println("Electronic duck quack...");
    }

    @Override
    public void swim() {
        if (!on) 
        	turnOn();
        System.out.println("Electronic duck swim...");
    }
}