import java.util.Scanner;

public class TesteRetangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Retangulo[] ret = new Retangulo[2];
		
	System.out.println("Escreva os valores que deseja settar para o retangulo 1");
		int comprimento = sc.nextInt();
		int largura = sc.nextInt();
		ret[0] = new Retangulo(comprimento, largura);
		
		
		
		
		
		System.out.println("Escreva os valores que deseja settar para o retangulo 2");
		comprimento = sc.nextInt();
		largura = sc.nextInt();
		ret[1] = new Retangulo(comprimento, largura);
		
		
		System.out.println(ret[0].toString());
		System.out.println(ret[1].toString());
		sc.close();
	}
}
