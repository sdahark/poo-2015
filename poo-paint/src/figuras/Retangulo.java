package figuras;

public class Retangulo extends Figura {

	private int altura;
	private int largura;
	
	public Retangulo(int x, int y, int largura, int altura) {
		super(x, y);
		this.altura = altura;
		this.largura = largura;
	}

	public String imprime() {
		return "retangulo[X:"+this.x+",Y:"+this.y+",l:"+this.largura+",a:"+this.altura+"]";
	}

	public int getAltura() {
		return altura;
	}

	public int getLargura() {
		return largura;
	}

}
