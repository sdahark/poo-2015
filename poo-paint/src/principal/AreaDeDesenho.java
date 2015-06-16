package principal;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

import figuras.Circulo;
import figuras.Figura;
import figuras.Retangulo;

public class AreaDeDesenho extends JPanel {

	private List<Figura> figuras; 
    private Figura figura;
	public AreaDeDesenho(List<Figura> f) {
		this.setPreferredSize(new Dimension(600, 400));
		this.figuras = f;
	}

	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		// desenha algumas figuras
		for(Figura f : figuras ){
			f.desenha(g);
		}
	}

	public void addFigura(Figura figura) {
		this.figura = figura;
		this.figuras.add(figura);
	}
	
	public void remove(Figura f) {
		this.figuras.remove(f);
	}
	
	public void atualiza() {
		figuras.remove(this.figura);
	}
}