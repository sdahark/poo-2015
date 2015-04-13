package figuras;

public class Circulo extends Figura {

	private int raio = 0;

	public Circulo(int x, int y, int raio) {
		super(x, y);
		this.raio = raio;
	}

	public String imprime() {
		return "circulo[X:"+this.x+",Y:"+this.y+",raio:"+this.raio+"]";
	}

	public int getRaio() {
		return raio;
	}

}
