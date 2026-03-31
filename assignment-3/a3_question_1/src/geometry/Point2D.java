package geometry;

public class Point2D {
	private double x;
	private double y;
	
	public Point2D(){}
	public Point2D(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	public double getX() {
		return x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getY() {
		return y;
	}
	
	public String getDetails() {
		return String.format("X: %f, and Y: %f", x, y);
	}
	
	public boolean isEqual(Point2D coords) {
		if(this == coords) {
			return true;
		}
		
		if(this.x == coords.x && this.y == coords.y) {
			return true;
		}
		
		return false;
	}
	
	public double calculateDistance(Point2D coords) {
		

		double distance = Math.sqrt(
			    (coords.x - x) * (coords.x - x) +
			    (coords.y - y) * (coords.y - y)
		);
		
		return distance;
	}
	
}
