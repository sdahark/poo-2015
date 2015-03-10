import org.junit.Assert;
import org.junit.Test;


public class RetanguloTeste {

	@Test
	public void testaImprime() {
		Retangulo r = new Retangulo(31, 31, 50, 40);
		
		String saida = r.imprime();
	    
		Assert.assertEquals("retangulo[X:31,Y:31,l:40,a:50]", saida);
	}

	@Test
	public void testaContadorDeInstancias() {
		Retangulo.zeraInstancias();
		Assert.assertEquals(0, Retangulo.instancias());
		
		Retangulo r1 = new Retangulo(31, 31, 50, 40);
		Retangulo r2 = new Retangulo(15, 45, 52, 40);
		Assert.assertEquals(2, Retangulo.instancias());
		
		Retangulo r3 = new Retangulo(15, 45, 52, 40);
		Assert.assertEquals(3, Retangulo.instancias());
	}

	@Test
	public void testaIgual() {
		Retangulo r1 = new Retangulo(31, 31, 50, 40);
		Retangulo r2 = new Retangulo(15, 45, 52, 40);
		Assert.assertEquals(false, Retangulo.igual(r1, r2));
		
		Retangulo r3 = new Retangulo(31, 31, 50, 40);
		Retangulo r4 = new Retangulo(31, 31, 50, 40);
		Assert.assertEquals(true, Retangulo.igual(r3, r4));
	}

}
