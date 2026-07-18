public class Motorcycle extends Vehicle {
    private double discountRate;

    public Motorcycle(String plateNumber, String brand, double dailyRate, double discountRate) {
        super(plateNumber, brand, dailyRate);
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getDailyRate() * days * (1 - discountRate);
    }

    
}
