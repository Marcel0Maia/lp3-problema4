
public class Retangulo {
	
	protected int comprimento;
	protected int largura;
	protected int area;
	protected int perimetro;

	public Retangulo(int comprimento, int largura) {
		this.comprimento = comprimento;
		this.largura = largura;
		area = comprimento * largura;
		perimetro = 2 * comprimento + 2 * largura;
	}
	
	public int getArea() {
		return area;
	}
	
	public int getPerimetro() {
		return perimetro;
	}
	
	public void setComprimento(int comprimento, int largura) {
		this.comprimento = comprimento;
		this.largura = largura;
	}
	
	public String toString() {
		return "Area: " + area + " || Perimetro: " + perimetro;
	}
}