package Circulo;

import javax.swing.JOptionPane;

public class Circulo {
	
	public double diametro;
	public double raio;
	public double pontoX=pontos.x;
	public double pontoY=pontos.y;
	public pontos centro;
	
	public Circulo(double raio){
		if(raio <=0){
			this.raio = 1;
	}
	else{
		this.raio = raio;
	}
	}
	
	public double circuferencia() {
		return 2*3.14*raio;
	}
	public double area(){
		return 3.14*(this.raio * this.raio);
		
	}
	
	public void AumentarRaio(int unidadeFixa){
		this.raio += unidadeFixa;
		
	}

	public void DiminuirRaio(int unidadeFixa){
		this.raio -= unidadeFixa;
	
	}
	
	public void MovimentarCirculo(pontos Destino){
		this.centro = Destino;
	}
	
	public boolean isIn(Circulo SegundoCirculo){
		double x2=SegundoCirculo.pontoX;
		double y2=SegundoCirculo.pontoY;
		if (x2<=pontoX+raio && x2>=pontoX && y2<=pontoY && y2>=pontoY-raio){
			return true;
		}else{
			return false;
		}
}
	
	public void estado(){
		JOptionPane.showMessageDialog(null,"\nDiametro: "+diametro+"\nRaio: "+raio+"\nX: "+pontoX+"\nY: "+pontoY);
	}
}
}

	