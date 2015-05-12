package principal;

  

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event. *;  

import javax.swing. *;  
import javax.swing.event. *; 

import figuras.Circulo;
import figuras.Retangulo;


public class Layout extends JPanel{
	
	//Componentes
	private JPanel painel = new JPanel();
	private JToolBar toolbar = new JToolBar (" Ferramentas "); 
	private ButtonGroup grupo = new ButtonGroup();
	private JToggleButton circulo = new JToggleButton ("circulo");  
	private JToggleButton retangulo = new JToggleButton ("retangulo");  
	public Layout(){	
		this.montaMenu ();
		montaJanela();
	}
    private void montaMenu () {   
        this.toolbar.add (circulo);  
        this.toolbar.add (retangulo);
        this.grupo.add (retangulo);
        this.grupo.add (circulo);
    }
    private void montaJanela (){
    	this.setLayout (new BorderLayout ());  
        this.add (this.toolbar, BorderLayout.NORTH);   	
    }
    
    private void addEvento(){
    	this.circulo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent c) {
				// TODO Auto-generated method stub
				if (c.equals(circulo)){
					
				}
			}
		});
          this.retangulo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent r) {
				// TODO Auto-generated method stub
                if (r.equals(circulo)){
					
				}
			}
		});
    }

   
}

