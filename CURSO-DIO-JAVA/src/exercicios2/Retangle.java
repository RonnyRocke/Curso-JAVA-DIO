package exercicios2;


public class Retangle {

	double width;
	double heigth;
	
	
	public double Area() {
		// area*altura
		double area = width*heigth;
		return area;
	}
	
	double Perimeter(){
		//(4+4)+(3+3)  = 14
		double perimeter = (width+width)+(heigth+heigth);
		return perimeter;
	}
	
	double Diagonal(){
		// 4² + 3² = 16 +9 = 25/5 = 5
		double diagonal = Math.pow(width, 2)+Math.pow(heigth,2);
		double raiz = Math.sqrt(diagonal);
		return raiz;
	}
}
