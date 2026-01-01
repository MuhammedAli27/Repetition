package Transport;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bicycle();

        myCar.move();
        myBike.move();

        if (myCar instanceof Car) {
            System.out.println("Тип топлива: " + ((Car) myCar).getFuelType());
        }
    }
}
