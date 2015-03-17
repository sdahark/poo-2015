package figuras;
public class Retangulo {

	private int x;
	private int y;
	private int altura;
	private int largura;
	private static int cont = 0;
	
	
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

	public Retangulo(int x, int y, int altura, int largura) {
		this.x = x;
		this.y = y;
		this.altura = altura;
		this.largura = largura;
		cont ++;
		
	}

	public String imprime() {
		return "retangulo[X:"+this.x+",Y:"+this.y+",l:"+this.largura+",a:"+this.altura+"]";
	}
	public static void zerainstancias(){
		cont = 0;		
	}
	public static int instancias(){
		return cont;
	}

	public static boolean igual(Retangulo r1, Retangulo r2) {	
		return (r1.x == r2.x && r1.y == r2.y && r1.altura == r2.altura && r1.largura == r2.largura);
	}

}
