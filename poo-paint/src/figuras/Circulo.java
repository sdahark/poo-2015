package figuras;

import java.awt.Graphics;

public class Circulo extends Figura {

	private int x2, y2;

	public Circulo(int x, int y, int x2, int y2) {
		super(x, y);
		this.y2 = y2;
		this.x2 = x2;
	}

	public String imprime() {
		//return "circulo[X:"+this.x+",Y:"+this.y+",raio:"+this.raio+"]";
		return "";
	}

	
	public void desenha(Graphics g){
		   if (x2>x && y2>y)
               g.drawOval(x,y,x2-x,y2-y);
           if (x2>x && y>y2)
               g.drawOval(x,y2,x2-x,y-y2);
           if (x>x2 && y>y2)
               g.drawOval(x2,y2,x-x2,y-y2);
           if (x>x2 && y2>y)
               g.drawOval(x2,y,x-x2,y2-y);
	}

}