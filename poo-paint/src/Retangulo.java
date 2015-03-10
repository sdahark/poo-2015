
public class Retangulo {

	int x;
	int y;
	int altura;
	int largura;
	static int cont = 0;
	
	
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

}
