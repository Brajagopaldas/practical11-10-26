class Vehicle {
	String registrationNo;
	String brand;
	String fuelType;
	double price;

	private Vehicle(String registrationNo, String brand, String fuelType, double price) {
		this.registrationNo = registrationNo;
		this.brand = brand;
		this.fuelType = fuelType;
		this.price = price;
	}

	public Vehicle(String registrationNo, String brand) {
		this(registrationNo, brand, "Petrol", 0.0);
	}

	public Vehicle(String registrationNo, String brand, String fuelType) {
		this(registrationNo, brand, fuelType, 0.0);
	}

	public static Vehicle createVehicle(String registrationNo, String brand, String fuelType, double price) {
		return new Vehicle(registrationNo, brand, fuelType, price);
	}

	void display() {
		System.out.println("\n--------------------------------");
		System.out.println("Registration No : " + registrationNo);
		System.out.println("Brand           : " + brand);
		System.out.println("Fuel Type       : " + fuelType);
		System.out.println("Price           : Rs. " + price);
		System.out.println("--------------------------------");
	}

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("OD-02-AB-1234", "Tata");
		Vehicle v2 = new Vehicle("OD-02-AB-4321", "Hyundai", "Diesel");
		Vehicle v3 = Vehicle.createVehicle("OD-02-B-1234", "Mahindra", "Diesel", 1750000.0);

		v1.display();
		v2.display();
		v3.display();
	}
}