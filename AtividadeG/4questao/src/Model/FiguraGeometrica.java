package Model;

public abstract class FiguraGeometrica {
	    
		private int lado;

	    public FiguraGeometrica(int lado) {
	        this.lado = lado;
	    }

	    public int obterLado() {
	        return lado;
	    }

	    public abstract int perimetro();

	    public abstract int area();

}
