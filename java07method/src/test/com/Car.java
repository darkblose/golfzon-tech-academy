package test.com;

public class Car {

	private String model;
	private String color;
	private int maxSpeed;

	public Car() {
		model = "OOOO";
		color = "Àº»ö";
		maxSpeed = 250;
	}
	
	

	public Car(String model) {
		this();
		this.model = model;
	}
	
	public Car(int maxSpeed) {
		this();
		this.maxSpeed = maxSpeed;
	}

	

	public Car(String model, String color) {
		this(500);
		this.model = model;
		this.color = color;
	}
	public Car(String model, String color, int maxSpeed) {
		this("SM7","black");
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}



	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}

}
