import org.junit.Assert;
import org.junit.Test;


public class RetanguloTeste {

	@Test
	public void testaImprime() {
		Retangulo r = new Retangulo(31, 31, 50, 40);
		
		String saida = r.imprime();
	    
		Assert.assertEquals("retangulo[X:31,Y:31,l:40,a:50]", saida);
	}

}
