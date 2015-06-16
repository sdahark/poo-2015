package figuras;

import java.awt.Graphics;

public class Retangulo extends Figura{

	private int altura;
	private int largura;
    
	private static int instancias = 0;
	
    public Retangulo(int pos_x, int pos_y, int altura, int largura) {
		super(pos_x, pos_y);
		this.altura = altura;
		this.largura = largura;
		
		Retangulo.instancias++;
	}

	public String imprime() {
		
		return "retangulo[X:"+this.x+",Y:"+this.y+",l:"+this.largura+",a:"+this.altura+"]";
	}
	
	public static void zeraInstancias() {
		instancias = 0;
	}
	
	public static int instancias() {
		return Retangulo.instancias;
	}

	public static boolean igual(Retangulo r1, Retangulo r2) {
		
		boolean altura = r1.altura == r2.altura;
		boolean largura = r1.largura == r2.largura;
		boolean y = r1.y == r2.y;
		boolean x = r1.x == r2.x;
		
		return (x && y && largura && altura && largura);
	}
	

	public int getAltura() {
		return altura;
	}

	public int getLargura() {
		return largura;
	}
	
	public void desenha(Graphics g){
		  if (altura>x && largura>y)
              g.drawRect(x,y,altura-x,largura-y);
          if (altura>x && y>largura)
              g.drawRect(x,largura,altura-x,y-largura);
          if (x>altura && y>largura)
              g.drawRect(altura,largura,x-altura,y-largura);
          if (x>altura && largura>y)
              g.drawRect(altura,y,x-altura,largura-y);
	}

}
