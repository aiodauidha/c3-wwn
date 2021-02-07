class Vehicle{
    private int wheels;
    private double weight;

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    public int getWheels() {
        return wheels;
    }

    public double getWeight() {
        return weight;
    }

    public void print() {
        System.out.println("车轮的个数是：" + getWheels() + "  " + "车重是" + getWeight());
    }
}

class Car extends Vehicle {
    private int loader;

    public Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public void print() {
        System.out.print("这是一辆小车，能载5人，实载" + loader + "人");
        if (loader > 5) {
            System.out.println(",你超员了！");
        } else {
            System.out.println();
        }
    }
}

class Truck extends Vehicle{
    private int loader;
    private double payload;

    public Truck(int wheels, double weight, int loader, double payload) {
        super(wheels, weight);
        this.loader = loader;
        this.payload = payload;
    }

    public void print() {
        System.out.print("这是一辆卡车，能载3人，实载" + loader + "人");
        if (loader > 3) {
            System.out.println(",你超员了！");
        }
        else {
            System.out.println();
        }
        System.out.printf("这是一辆卡车，能载5000kg，你已载" + payload + "kg");
        if (payload > 5000) {
            System.out.println(",你超重了！！");
        }
        else {
            System.out.println();
        }
    }
}
public class Task6 {
    public static void main(String[] args) {
        Vehicle vehicleCar = new Vehicle(4,1150.0);
        Vehicle vehicleTruck = new Vehicle(6,15000.0);
        Car car = new Car(4, 1150.0, 6);
        Truck truck = new Truck(6, 15000.0, 1, 7000.0);
        vehicleCar.print();
        car.print();
        vehicleTruck.print();
        truck.print();
    }
}
