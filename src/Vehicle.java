public class Vehicle {

    public int VIN;
    public String vehicleModel;
    public String vehicleMake;
    public int vehicleHorsePower;
    public double vehiclePrice;

    public Vehicle() {
        this.VIN = 21;
        this.vehicleModel = "neshto";
        this.vehicleMake = "neshtosi";
        this.vehicleHorsePower = 200;
        this.vehiclePrice = 3400;
    }

    public Vehicle(int VIN, String vehicleModel, String vehicleMake, int vehicleHorsePower, double vehiclePrice) {
        this.VIN = VIN;
        this.vehicleModel = vehicleModel;
        this.vehicleMake = vehicleMake;
        this.vehicleHorsePower = vehicleHorsePower;
        this.vehiclePrice = vehiclePrice;
    }

    public int getVIN() {
        return VIN;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public int getVehicleHorsePower() {
        return vehicleHorsePower;
    }

    public double getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public void setVehicleHorsePower(int vehicleHorsePower) {
        this.vehicleHorsePower = vehicleHorsePower;
    }

    public void setVehiclePrice(double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VIN=" + VIN +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleMake='" + vehicleMake + '\'' +
                ", vehicleHorsePower=" + vehicleHorsePower +
                ", vehiclePrice=" + vehiclePrice +
                '}';
    }
}
