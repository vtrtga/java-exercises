import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R;
		
		double area; // Fixing
		
		System.out.println("Digite o raio: ");
		R = sc.nextInt();
		area = Math.pow(R, 2) * 3.14159;
		
		System.out.println("AREA = " + area);
	}

}