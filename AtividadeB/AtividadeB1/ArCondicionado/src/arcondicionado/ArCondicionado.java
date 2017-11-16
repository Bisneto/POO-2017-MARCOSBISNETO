//split
package arcondicionado;

import javax.swing.JOptionPane;

public class ArCondicionado {
        public String Modo;
   	public boolean ON;
        public int Temperatura_numero;
	public String velocidadeVentilador;
	public String Velocidade_nome;

	public ArCondicionado(boolean ON, String Modo, int Temperatura_numero, String Velocidade_nome){
		this.ON = ON;
		this.Modo = Modo;
		this.Temperatura_numero = Temperatura_numero;
		this.Velocidade_nome = Velocidade_nome;
}
        
	public String estado(){
		if (ON){
			return "ON";
		}else{
			return "OFF";
		}
	}
        
	public void AlterarTemperatura_AC(){
		
		if(Modo  == "VENTILAR" || ON == false){
			JOptionPane.showMessageDialog(null, "Está Ventilando ou Desligado!");
			
		}else{
			int mudarTemperatura = Integer.valueOf(JOptionPane.showInputDialog("Temperatura: "));
			
			if (mudarTemperatura < 12){
				Temperatura_numero = 12;
			}else if(mudarTemperatura > 25){
					Temperatura_numero =25;
			}else{
				Temperatura_numero = mudarTemperatura;
			}
			
		}
	}
        
	public void velocidadeVent(){
		
		String nome =JOptionPane.showInputDialog("Nome Velocidade: ");
		Velocidade_nome = nome;
	}
        
public void EstadoSplit(){
		int opcao = Integer.valueOf(JOptionPane.showInputDialog("AR CONDICIONADO(split)\n" + "ON: "+ estado() + "\nTEMPERATURA: " + Temperatura_numero + Velocidade_nome + "\n\n1 - ON ou OFF\n1 - Baixar Temperatura\n2 - Subir teemperatura\n3 - Velocidade do Ventilador\n"));
		
		if (opcao == 1){
			String option_nome = estado();
			if(option_nome == "Sim"){
				ON = false;
			}else{
				ON = true;
			}
			EstadoSplit();
		
		}else if (opcao == 2){
			AlterarTemperatura_AC();
			EstadoSplit();
		
		}else if(opcao == 3){
			estado();
			EstadoSplit();
			
		}else if(opcao == 4){
			velocidadeVent();
			EstadoSplit();
	}
}
public static void main(String[] args) {
		
		ArCondicionado primeiro = new ArCondicionado(true,"ventilar", 21,"baixo"); //ordem
		primeiro.EstadoSplit();
	}

}
