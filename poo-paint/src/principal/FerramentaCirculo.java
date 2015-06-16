package principal;

import figuras.Circulo;
import figuras.Figura;

public class FerramentaCirculo extends Ferramenta {

	public FerramentaCirculo(BarraDeFerramentas barra) {
		super(barra);
	}

	@Override
	public Figura criaFigura(int x, int y, int x2 ,int y2) {
		return new Circulo(x,y ,y2);
	}

	@Override
	public String getNome() {
		return "Circulo";
	}
}