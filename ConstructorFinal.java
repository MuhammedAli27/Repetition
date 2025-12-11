package Constructors;

public class ConstructorFinal {
    public static void main(String[] args) {
        BMW myBMW = new BMW("Black", 200);
        myBMW.display();
    }

    public static class BMW{
        String color;
        int speed;

        public BMW(String color, int speed) {
            this.color = color;
            this.speed = speed;
        }

        public void display(){
            System.out.println("BMW color is " + color);
            System.out.println("BMW speed is " + speed);
        }
    }


}
