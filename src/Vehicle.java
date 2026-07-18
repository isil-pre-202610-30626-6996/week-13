
public abstract class Vehicle {

    private String plateNumber;
    private String brand;
    private double dailyRate;

    public Vehicle(String plateNumber, String brand, double dailyRate) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.dailyRate = dailyRate;
    }

    public abstract double calculateRentalCost(int days);

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    
}
