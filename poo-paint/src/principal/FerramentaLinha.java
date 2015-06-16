package principal;

import figuras.Figura;
import figuras.Linha;

public class FerramentaLinha extends Ferramenta {

	public FerramentaLinha(BarraDeFerramentas barra) {
		super(barra);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Figura criaFigura(int x, int y,int x2, int y2) {
		// TODO Auto-generated method stub
		return new Linha(x,y,x2,y2);
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return "Linha";
	}

}
