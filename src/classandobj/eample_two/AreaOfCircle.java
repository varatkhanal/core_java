package classandobj.eample_two;

public class AreaOfCircle {
	float radius; //global variable
	double area=0;
	
	public void setRadius(float rad){
		radius=rad;
	}
	public void computeArea() {
		area = Math.PI*radius*radius;
	}
	
	public double getArea() {
		return area;
	}

	
}
