package principal;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

import figuras.Figura;

public class AreaDeDesenho extends JPanel {

	private List<Figura> figuras;
	
	public AreaDeDesenho(List<Figura> figuras) {
		this.figuras = figuras;
		this.setPreferredSize(new Dimension(600, 400));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// desenha algumas figuras
		for (Figura f : figuras) {
			f.desenha(g);
		}
	
	}
	public void setFigura (Figura figura){
		this.figuras.add(figura);
		this.repaint();
	}

}
