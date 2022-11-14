import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, soma;
		
		System.out.println("Digite um número: ");
		A = sc.nextInt();
		System.out.println("Digite outro número: ");
		B = sc.nextInt();
		
		soma = A + B;
		
		System.out.println("SOMA = " + soma);
	}

}