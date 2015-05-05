package principal;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import figuras.Retangulo;

public class Eventos extends MouseAdapter{
private AreaDeDesenho area;
	public Eventos(AreaDeDesenho areaDeDesenho) {
		this.area = areaDeDesenho;
	}

	public void mouseClicked (MouseEvent evento){
		System.out.println(evento.getX());
		System.out.println(evento.getY());
		Retangulo clicou = new Retangulo (evento.getX(),evento.getY(), 20, 20);
		this.area.setFigura(clicou);
	}
	

}
