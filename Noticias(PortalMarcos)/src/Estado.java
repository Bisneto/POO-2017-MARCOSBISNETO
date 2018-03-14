import java.sql.Time;
import java.util.Date;

public class Estado {
	public String estado;
	public Date date;
	public Time time;
	Jornalista funcionario;
	
	public Estado(String estado, Date date, Time time) {
		this.estado = estado;
		this.date = date;
		this.time = time;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Jornalista getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Jornalista funcionario) {
		this.funcionario = funcionario;
	}

}
