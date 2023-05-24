
public class TesteRetangulo {
	public static void main(String[] args) {
		Retangulo[] ret = new Retangulo[2];
		
		ret[0] = new Retangulo(30, 20);
		ret[1] = new Retangulo(33, 35);
		
		System.out.println(ret[0].toString());
		System.out.println(ret[1].toString());
	}
}
