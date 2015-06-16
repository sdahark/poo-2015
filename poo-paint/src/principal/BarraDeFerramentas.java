package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class BarraDeFerramentas extends JToolBar {

	ButtonGroup grupo;
	private Ferramenta ferramenta;
	
	
	public BarraDeFerramentas() {
		super("Barra de Ferramentas");
		this.grupo = new ButtonGroup();
		
		Ferramenta[] ferramentas = new Ferramenta[]{
			new FerramentaRetangulo(this),
			new FerramentaCirculo(this),
			new FerramentaLinha(this)
		};
		for (Ferramenta f : ferramentas) {
			criarBotao(f);
		}
		this.setFloatable(false);
	}
	

	private JToggleButton criarBotao(Ferramenta ferramenta) {
		JToggleButton botao = new JToggleButton(ferramenta.getNome());
		botao.addActionListener(ferramenta);
		grupo.add(botao);
		this.add(botao);
		if (ferramenta.ehFerramentaPadrao()) {
			botao.getModel().setPressed(true);
			this.ferramenta = ferramenta;
		}
		return botao;
	}
	
	public Ferramenta leFerramentaSelecionada() {
		return this.ferramenta;
	}

	public void setFerramentaAtiva(Ferramenta ferramenta) {
		this.ferramenta = ferramenta;
	}

}