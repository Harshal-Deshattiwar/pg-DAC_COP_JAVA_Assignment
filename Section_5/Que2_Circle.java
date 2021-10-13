

public class Que2_Circle {
	
	int rad;
	  
	Que2_Circle(int r){this.rad = r;}
	double calArea(){
		Double r = (double) rad;
		double area = (double) ((22 *r*r)/7);
		return area; 
	  }
	double calPerimeter(){
		Double r = (double) rad;
		double perimeter = (double) ((22 *2*r)/7);
		return perimeter;
	}

}
