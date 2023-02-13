public class Motorcycle {
    private int motorcycleTireCount;
    private int motorcycleFuel;

    public Motorcycle() {
        this.motorcycleTireCount = 33;
        this.motorcycleFuel = 340;
    }

    public Motorcycle(int motorcycleTireCount, int motorcycleFuel) {
        this.motorcycleTireCount = motorcycleTireCount;
        this.motorcycleFuel = motorcycleFuel;
    }

    public int getMotorcycleTireCount() {
        return motorcycleTireCount;
    }

    public int getMotorcycleFuel() {
        return motorcycleFuel;
    }

    public void setMotorcycleTireCount(int motorcycleTireCount) {
        this.motorcycleTireCount = motorcycleTireCount;
    }

    public void setMotorcycleFuel(int motorcycleFuel) {
        this.motorcycleFuel = motorcycleFuel;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "motorcycleTireCount=" + motorcycleTireCount +
                ", motorcycleFuel=" + motorcycleFuel +
                '}';
    }
}
