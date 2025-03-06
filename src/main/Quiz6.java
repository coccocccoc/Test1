package main;

public class Quiz6 {

	public static void main(String[] args) {

		Ballpen ballpen = new Ballpen(2, 1.0, "파랑색");

		FountainPen fountainPen = new FountainPen(3, 0.8, "몽블랑");

	}

}

class Pen {

	int thickness;
	double inkLevel;

	public Pen(int thickness, double inkLevel) {
		super();
		this.thickness = thickness;
		this.inkLevel = inkLevel;
	}

}

class Ballpen extends Pen {

	String color;

	public Ballpen(int thickness, double inkLevel, String color) {
		super(thickness, inkLevel);
		this.color = color;
	}

}

class FountainPen extends Pen {

	String brand;

	public FountainPen(int thickness, double inkLevel, String brand) {
		super(thickness, inkLevel);
		this.brand = brand;
	}

}