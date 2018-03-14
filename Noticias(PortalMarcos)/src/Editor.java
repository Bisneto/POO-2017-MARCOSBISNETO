
public class Editor extends Jornalista{
	private String area;
	private boolean chefe;
	private boolean editor;
	
	public Editor(String nome, String email, String senha, boolean chefe, boolean editor) {
		super(nome,email,senha);
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public boolean isChefe() {
		return chefe;
	}

	public void setChefe(boolean chefe) {
		this.chefe = chefe;
	}

	public boolean isEditor() {
		return editor;
	}

	public void setEditor(boolean editor) {
		this.editor = editor;
	}	
}
