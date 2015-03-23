package figuras;

public class Retangulo {

	private int x;
	private int y;
	private int altura;
	private int largura;
	
	public Retangulo(int x, int y, int largura, int altura) {
		this.x = x;
		this.y = y;
		this.altura = altura;
		this.largura = largura;
	}

	public String imprime() {
		return "retangulo[X:"+this.x+",Y:"+this.y+",l:"+this.largura+",a:"+this.altura+"]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getAltura() {
		return altura;
	}

	public int getLargura() {
		return largura;
	}

}
