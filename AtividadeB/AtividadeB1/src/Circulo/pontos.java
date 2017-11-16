package Circulo;

public class pontos {
	
	public static double x;
	public static double y;
	
	public pontos(){
		this.x = 0;
		this.y = 0;
	}
	public double Distance(pontos p){
		return Math.sqrt((Math.pow(this.x-p.x,2) +Math.pow(this.y-p.y,2)));
				
	}

}
