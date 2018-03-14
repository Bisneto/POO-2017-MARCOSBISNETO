import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Noticia {

	private String titulo;
	private String texto;
	private String resumo;
	private String area;
	private boolean imagem;
	private Editor editor;
	private Jornalista jornalista;
	private int indice;
	List<Noticia>noticia;
	
	public Jornalista getJornalista() {
		return jornalista;
	}

	public void setJornalista(Jornalista jornalista) {
		this.jornalista = jornalista;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public boolean isImagem() {
		return imagem;
	}

	public void setImagem(boolean imagem) {
		this.imagem = imagem;
	}
	
	public void criarNoticia(Jornalista jornalista) {
		
		Noticia novaNoticia;
		novaNoticia = new Noticia();
		
		novaNoticia.titulo = titulo;
		novaNoticia.imagem = imagem;
		novaNoticia.texto = texto;
		novaNoticia.resumo = resumo;
		novaNoticia.area = area;
		
		novaNoticia.setTitulo(titulo);
		novaNoticia.setImagem(imagem);
		novaNoticia.setTexto(texto);
		novaNoticia.setResumo(resumo);
		novaNoticia.setArea(area);
		novaNoticia.setJornalista(jornalista);
		}
	}
	public void editarNoticia(Editor editor) {
		if(editor.isEditor)==true) {
			System.out.println("Autorizado");
			
		}
	}
	public void postarNoticia(Editor editor) {
		if(editor.isChefe()==true) {
			System.out.println("Autorizado para Postar");
		}
	}
	
	
	
