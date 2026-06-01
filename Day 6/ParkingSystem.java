package day6assignments;

public class ParkingSystem {
	    String vehicleNumber;
	    int hoursParked;
	    String vehicleType;
	    double parkingFee;

	    ParkingSystem(String vehicleNumber, int hoursParked, String vehicleType) {
	        this.vehicleNumber = vehicleNumber;
	        this.hoursParked = hoursParked;
	        this.vehicleType = vehicleType;

	        if (vehicleType.equalsIgnoreCase("Bike"))
	            parkingFee = hoursParked * 10;
	        else if (vehicleType.equalsIgnoreCase("Car"))
	            parkingFee = hoursParked * 30;
	        else if (vehicleType.equalsIgnoreCase("Bus"))
	            parkingFee = hoursParked * 50;
	    }

	    void display() {
	        System.out.println("Vehicle Number: " + vehicleNumber);
	        System.out.println("Vehicle Type: " + vehicleType);
	        System.out.println("Hours Parked: " + hoursParked);
	        System.out.println("Parking Fee: ₹" + parkingFee);
	    }

	    public static void main(String[] args) {
	        ParkingSystem p1 = new ParkingSystem("OD02AB1234", 5, "Car");
	        p1.display();
	    }
	
}

	