package testes;
import org.junit.Assert;
import org.junit.Test;

import figuras.RetanguloANTIGO;


public class RetanguloTesteANTIGO {
	@Test
	public void testaImprime() {
		RetanguloANTIGO r = new RetanguloANTIGO(31, 31, 50, 40);
		
		String saida = r.imprime();
	    
		Assert.assertEquals("retangulo[X:31,Y:31,l:40,a:50]", saida);
	}

	@Test
	public void testaContadorDeInstancias() {
		RetanguloANTIGO.zerainstancias();
		Assert.assertEquals(0, RetanguloANTIGO.instancias());
		
		RetanguloANTIGO r1 = new RetanguloANTIGO(31, 31, 50, 40);
		RetanguloANTIGO r2 = new RetanguloANTIGO(15, 45, 52, 40);
		Assert.assertEquals(2, RetanguloANTIGO.instancias());
		
		RetanguloANTIGO r3 = new RetanguloANTIGO(15, 45, 52, 40);
		Assert.assertEquals(3, RetanguloANTIGO.instancias());
	}	
	public void testaIgual() {
		RetanguloANTIGO r1 = new RetanguloANTIGO(31, 31, 50, 40);
		RetanguloANTIGO r2 = new RetanguloANTIGO(15, 45, 52, 40);
		Assert.assertEquals(false, RetanguloANTIGO.igual(r1, r2));
		
		RetanguloANTIGO r3 = new RetanguloANTIGO(31, 31, 50, 40);
		RetanguloANTIGO r4 = new RetanguloANTIGO(31, 31, 50, 40);
		Assert.assertEquals(true, RetanguloANTIGO.igual(r3, r4));

}
}
