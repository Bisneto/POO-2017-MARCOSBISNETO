package Model;

public class quadrado extends FiguraGeometrica {
	
	    public quadrado(int lado) {
	        super(lado);
	    }

	    @Override
	    public int perimetro() {
	        return obterLado() * 4;
	    }

	    @Override
	    public int area() {
	        return obterLado() * 2;
	    }
}
