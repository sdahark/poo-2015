package principal;

import javax.swing.JFrame;

public class Paint extends JFrame {

	public static void main(String[] args) {
		Paint aplicacao = new Paint();
	}

	public Paint() {
		// Criar algumas figuras que serão desenhadas
		AreaDeDesenho areaDeDesenho = new AreaDeDesenho(/* passar um vetor de figuras */);
		this.setContentPane(areaDeDesenho);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
}
