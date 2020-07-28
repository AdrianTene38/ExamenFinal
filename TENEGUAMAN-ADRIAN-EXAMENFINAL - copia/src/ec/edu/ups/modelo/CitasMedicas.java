package ec.edu.ups.modelo;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class CitasMedicas implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private SignosVitales signos;
	private String hora;
	private String fecha;
	private List<CitasMedicas> listarCitas;

	public List<CitasMedicas> getListarCitas() {
		return listarCitas;
	}
	public void setListarCitas(List<CitasMedicas> listarCitas) {
		this.listarCitas = listarCitas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public SignosVitales getSignos() {
		return signos;
	}
	public void setSignos(SignosVitales signos) {
		this.signos = signos;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public CitasMedicas(int id, SignosVitales signos, String hora, String fecha) {
		super();
		this.id = id;
		this.signos = signos;
		this.hora = hora;
		this.fecha = fecha;
	}
	public CitasMedicas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "CitasMedicas [id=" + id + ", signos=" + signos + ", hora=" + hora + ", fecha=" + fecha + "]";
	}

	
	
	
}
