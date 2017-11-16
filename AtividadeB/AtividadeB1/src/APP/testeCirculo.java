package APP;
import javax.swing.JOptionPane;

import Circulo.*;

public class testeCirculo {
	
	public static void receber(Circulo circulo){
		circulo.raio=Double.parseDouble(JOptionPane.showInputDialog("Insira o Raio: "));
		circulo.diametro=Double.parseDouble(JOptionPane.showInputDialog("Insira o Diametro: "));
		
		circulo.pontoX=Double.parseDouble(JOptionPane.showInputDialog("Insira o ponto x: "));
		circulo.pontoY=Double.parseDouble(JOptionPane.showInputDialog("Insira o ponto y: "));
		circulo.estado();	
	}
		public static void main(String[] args) {
			Circulo circulo = new Circulo();
			Circulo SegundoCirculo = new Circulo();
			String enter=JOptionPane.showInputDialog("1-Comecar\n2-Sair");
			if (enter.equals("1")) {
				receber(circulo);
				receber(SegundoCirculo);
				Circulo escolhido;
				Circulo outro;
				
				while (true) {
					String enter2=JOptionPane.showInputDialog("1-Area\n2-Circuferencia\n3-Está contido?\n4-Sair");
					if (enter2.equals("1")) {
						JOptionPane.showMessageDialog(null,"Area = "+escolhido.area());
					} else if(enter2.equals("2")) {
						JOptionPane.showMessageDialog(null,"Circuferencia = "+escolhido.circuferencia());
					}else if (enter2.equals("3")) {
						if (escolhido.isIn(outro)==true){
							JOptionPane.showMessageDialog(null,"Esta contido!" );
						}else{
							JOptionPane.showMessageDialog(null,"Nao esta contido!" );
						}
					}else if (enter2.equals("4")) {
						JOptionPane.showMessageDialog(null, "Programa encerrado");
						break;
					}
				}
		
			}
		
		}
}