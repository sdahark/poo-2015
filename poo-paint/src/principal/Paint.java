package principal;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import figuras.Circulo;
import figuras.Figura;
import figuras.Retangulo;

public class Paint extends JFrame {
	
	AreaDeDesenho areaDeDesenho;
	
	public static void main(String[] args) {
		Paint aplicacao = new Paint();
	}

	public Paint() {
		// Criar algumas figuras que serão desenhadas
		List<Figura> figuras = new ArrayList<Figura>();
		
		JPanel painel  = new JPanel();
		painel.setLayout( new BorderLayout());
		BarraDeFerramentas barra = new BarraDeFerramentas();
		JButton btPNG = new JButton("Exporta PNG");
		
        btPNG.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				exportar();
				
			}
		});
		barra.add(btPNG);
		painel.add(barra, BorderLayout.NORTH);
		areaDeDesenho = new AreaDeDesenho(figuras);
		
		Mouse mouse = new Mouse(areaDeDesenho, barra);
		
		areaDeDesenho.addMouseListener(mouse);
		
		painel.add(areaDeDesenho, BorderLayout.CENTER);
		
		this.setContentPane(painel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	public void exportar() {
		JFileChooser exportar = new JFileChooser();
		int resultado = exportar.showSaveDialog(this);
				
		if(resultado == JFileChooser.APPROVE_OPTION){
			File arquivo = exportar.getSelectedFile();
			try {
				BufferedImage in = new BufferedImage(areaDeDesenho.getWidth(), areaDeDesenho.getHeight(), BufferedImage.TYPE_INT_ARGB);
				areaDeDesenho.paint(in.getGraphics());
				ImageIO.write(in, "png", arquivo);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro na gravação do arquivo!","Erro!",JOptionPane.ERROR_MESSAGE);
			}
			
			
		}else{
			System.out.println("Nenhum arquivo selecionado!");
		}
	}
	
}