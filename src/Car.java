public class Car {
    private int carTireCount;
    private int carFuel;


    public Car() {
        this.carTireCount = 21;
        this.carFuel = 340;
    }

    public Car(int carTireCount, int carFuel) {
        this.carTireCount = carTireCount;
        this.carFuel = carFuel;
    }

    public int getCarTireCount() {
        return carTireCount;
    }

    public int getCarFuel() {
        return carFuel;
    }

    public void setCarTireCount(int carTireCount) {
        this.carTireCount = carTireCount;
    }

    public void setCarFuel(int carFuel) {
        this.carFuel = carFuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carTireCount=" + carTireCount +
                ", carFuel=" + carFuel +
                '}';
    }
}
