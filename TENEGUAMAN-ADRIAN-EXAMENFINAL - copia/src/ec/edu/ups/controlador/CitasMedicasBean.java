package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import ec.edu.ups.ejb.CitasMedicasFacade;
import ec.edu.ups.ejb.PacienteFacade;
import ec.edu.ups.ejb.SignosVitalesFacade;
import ec.edu.ups.modelo.CitasMedicas;
import ec.edu.ups.modelo.Paciente;
import ec.edu.ups.modelo.SignosVitales;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped

public class CitasMedicasBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private SignosVitales signos;
	private String hora;
	private String fecha;
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public List<CitasMedicas> getListarCitas() {
		return listarCitas;
	}

	public void setListarCitas(List<CitasMedicas> listarCitas) {
		this.listarCitas = listarCitas;
	}

	public CitasMedicasFacade getEjbCitasMedicasFacade() {
		return ejbCitasMedicasFacade;
	}

	public void setEjbCitasMedicasFacade(CitasMedicasFacade ejbCitasMedicasFacade) {
		this.ejbCitasMedicasFacade = ejbCitasMedicasFacade;
	}

	public void setId(int id) {
		this.id = id;
	}

	private List<CitasMedicas> listarCitas;

	
	public int getId() {
		return id;
	}

	
	@EJB
	private CitasMedicasFacade ejbCitasMedicasFacade;
	public String add() {
		SignosVitales s= new SignosVitales();
		CitasMedicas cliente = new CitasMedicas(this.id,this.signos,this.hora,this.fecha);
		ejbCitasMedicasFacade.create(cliente);
		System.out.println("cliente creado con exito!");
		this.fecha="";
		this.id=0;
		this.signos=null;
		this.hora="";
		this.fecha="";
		return null;
	}
}


