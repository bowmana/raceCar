/* Alex Bowman 
 * Csc 112
 * Professor Silvestri
 * HW#1
 * 2/5
 */
package hw1;

public class Vehicle {
	private String make;
	private String model;
	private int year;
	private int speed;
	private double distance;

	public Vehicle(String make, String model, int year) {

		setMake(make);
		setModel(model);
		setYear(year);
		this.speed = 0;
		this.distance = 0;
	}

	public void accelerate() {
		if (this.speed < 120)
			this.speed += 10;

	}

	public void brake() {
		if (this.speed > 0)
			this.speed -= 10;

	}

	public int getSpeed() {
		return speed;
	}

	public void setDistance(int time) {
		this.distance += this.speed / 60 * time;

	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year < 2022)
			this.year = year;

	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", year=" + year + "]";
	}

	public double getDistance() {
		// TODO Auto-generated method stub
		return distance;
	}

	public void adjustCarSpeed() {
		// TODO Auto-generated method stub
		int randNum = (int) (Math.random() * 4);
		if (randNum == 0 || randNum == 1)
			accelerate();
		else if (randNum == 2)
			brake();

	}
}