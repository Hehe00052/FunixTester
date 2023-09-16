package Lab1;
import java.util.Scanner;

public class Circle {
	private float R;
	private static final float pi=3.14f;
	
	public Circle(float r){
		this.R=r;
	}
	
	public float chuVi() {
		return this.R * 2 * pi;
	}
	
	public float dienTich() {
		return this.R * this.R * pi;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ban kinh: ");
		float bankinh=scanner.nextFloat();
		Circle c = new Circle(bankinh);
		float cv = c.chuVi();
		float dt = c.dienTich();
		System.out.print("chu vi la " + cv);
		System.out.print("dien tich la " + dt);
	}
}
