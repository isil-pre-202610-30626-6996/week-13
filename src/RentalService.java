public class RentalService {
    private Vehicle vehicle;
    private int rentalDays;

    public RentalService(Vehicle vehicle, int rentalDays) {
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double calculateRentalCost() {
        return vehicle.calculateRentalCost(rentalDays);
    }

    public double calculateTotalCost(double promotionalDiscount) {
        double rentalCost = calculateRentalCost();
        return rentalCost * (1 - promotionalDiscount);
    }
    
}
