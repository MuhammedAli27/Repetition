package Transport;
abstract class Vehicle {
    abstract void move();
}
class Bicycle extends Vehicle{
    private int wheelCount = 2;

    public int getWheelCount() {
        return wheelCount;
    }

    @Override
    void move() {
        System.out.println("Кручу педали! Колёс: " + wheelCount);
    }
}
