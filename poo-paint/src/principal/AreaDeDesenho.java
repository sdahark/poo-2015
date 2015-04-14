package principal;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class AreaDeDesenho extends JPanel {

	public AreaDeDesenho() {
		this.setPreferredSize(new Dimension(600, 400));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// desenha algumas figuras
		g.drawRect(200, 200, 200, 120);
		g.drawOval(100, 300, 40, 40);
	}

}
