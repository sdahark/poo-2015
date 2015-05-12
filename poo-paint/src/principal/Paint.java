package principal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import figuras.Circulo;
import figuras.Figura;
import figuras.Retangulo;
import principal.Eventos;

public class Paint extends JFrame {

	public static void main(String[] args) {
		Paint aplicacao = new Paint();
	}

	public Paint() {
	
		Retangulo ret1 = new Retangulo(5, 5, 100, 80);
		Retangulo ret2 = new Retangulo(400, 150, 30, 30);
		Circulo c = new Circulo(200, 200, 56);
		
		
		
		
		List<Figura> figuras = new ArrayList<Figura>();
		AreaDeDesenho areaDeDesenho = new AreaDeDesenho(figuras);
		Eventos e = new Eventos(areaDeDesenho); 
		areaDeDesenho.addMouseListener(e);
		Layout painel = new Layout();
		painel.add(areaDeDesenho);
		this.setContentPane(painel);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
}
