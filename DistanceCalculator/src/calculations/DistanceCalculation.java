package calculations;

import domain.Coordinates;

public class DistanceCalculation {
	public Coordinates pointA;
	public Coordinates pointB;
	public static double distance;

	public DistanceCalculation(Coordinates pointA, Coordinates pointB) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
	}

	public Coordinates getPointA() {
		return pointA;
	}

	public void setPointA(Coordinates pointA) {
		this.pointA = pointA;
	}

	public Coordinates getPointB() {
		return pointB;
	}

	public void setPointB(Coordinates pointB) {
		this.pointB = pointB;
	}

	public double getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return "distanceCalculation [pointA=" + pointA + ", pointB=" + pointB + ", distance=" + distance + "]";
	}
	
	public void distanceCalculator() {
		int xCoordinate = this.pointA.getxCoordinate() - this.pointB.getxCoordinate();
		int yCoordinate = this.pointA.getyCoordinate() - this.pointB.getyCoordinate();
		distance =  Math.sqrt( Math.pow(xCoordinate, 2) + Math.pow(yCoordinate, 2));
	}

	public static void main(String[] args) {
		Coordinates a = new Coordinates(452, 522);
		Coordinates b = new Coordinates(456, 521);
		DistanceCalculation distance1 = new DistanceCalculation(a, b);
		distance1.distanceCalculator();
		System.out.println(distance1.getDistance());
	}

}
