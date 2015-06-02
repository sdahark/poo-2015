package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import figuras.Figura;

public abstract class Ferramenta implements ActionListener {

	private BarraDeFerramentas barra;
	
	public Ferramenta(BarraDeFerramentas barra) {
		this.barra = barra;
	}
	
	public abstract Figura criaFigura(int x, int y);
	
	public void actionPerformed(ActionEvent e) {
		this.barra.setFerramentaAtiva(this);
	}
	
	public abstract String getNome();
	
	public boolean ehFerramentaPadrao() {
		return false;
	}
	
}