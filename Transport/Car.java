package Transport;

class Car extends Vehicle {
    private String fuelType = "бензин";

    public String getFuelType() {
        return fuelType;
    }

    @Override
    void move() {
        System.out.println("Еду на: " + fuelType + "е!");
    }
}