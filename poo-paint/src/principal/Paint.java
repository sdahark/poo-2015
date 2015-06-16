package principal;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import figuras.Circulo;
import figuras.Figura;
import figuras.Retangulo;

public class Paint extends JFrame {
	
	public static void main(String[] args) {
		Paint aplicacao = new Paint();
	}

	public Paint() {
		// Criar algumas figuras que serão desenhadas
		List<Figura> figuras = new ArrayList<Figura>();
		
		Figura r = new Retangulo(78, 45, 55, 40);
		Figura r2 = new Retangulo(15, 40, 50, 30);
		Figura c = new Circulo(45, 195, 52);
		Figura c2 = new Circulo(65, 293, 87);
		
		JPanel painel  = new JPanel();
		painel.setLayout( new BorderLayout());
		BarraDeFerramentas barra = new BarraDeFerramentas();
		painel.add(barra, BorderLayout.NORTH);
		AreaDeDesenho areaDeDesenho = new AreaDeDesenho();
		
		Mouse mouse = new Mouse(areaDeDesenho, barra);
		
		areaDeDesenho.addMouseListener(mouse);
		
		painel.add(areaDeDesenho, BorderLayout.CENTER);
		
		this.setContentPane(painel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

	
}
