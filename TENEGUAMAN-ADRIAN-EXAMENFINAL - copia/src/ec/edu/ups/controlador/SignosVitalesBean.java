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
import ec.edu.ups.ejb.PacienteFacade;
import ec.edu.ups.ejb.SignosVitalesFacade;
import ec.edu.ups.modelo.Paciente;
import ec.edu.ups.modelo.SignosVitales;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped

public class SignosVitalesBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String presion;
	private String frecuencia_cardiaca;
	private String frecuencia_respiratorio;
	private String temperatura;
	private String saturacion;
	private String alergias;
	private String enfermedades_previas;
	private int id;
	
	public int getId() {
		return id;
	}

	@EJB
	private SignosVitalesFacade ejbSignosFacade;
	

	


	public SignosVitalesFacade getEjbSignosFacade() {
		return ejbSignosFacade;
	}




	public void setEjbSignosFacade(SignosVitalesFacade ejbSignosFacade) {
		this.ejbSignosFacade = ejbSignosFacade;
	}




	public void setId(int id) {
		this.id = id;
	}
	private List<SignosVitales> listarSignos;

	
	
	public List<SignosVitales> getListarSignos() {
		return listarSignos;
	}




	public void setListarSignos(List<SignosVitales> listarSignos) {
		this.listarSignos = listarSignos;
	}




	public String getPresion() {
		return presion;
	}




	public void setPresion(String presion) {
		this.presion = presion;
	}




	public String getFrecuencia_cardiaca() {
		return frecuencia_cardiaca;
	}




	public void setFrecuencia_cardiaca(String frecuencia_cardiaca) {
		this.frecuencia_cardiaca = frecuencia_cardiaca;
	}




	public String getFrecuencia_respiratorio() {
		return frecuencia_respiratorio;
	}




	public void setFrecuencia_respiratorio(String frecuencia_respiratorio) {
		this.frecuencia_respiratorio = frecuencia_respiratorio;
	}




	public String getTemperatura() {
		return temperatura;
	}




	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}




	public String getSaturacion() {
		return saturacion;
	}




	public void setSaturacion(String saturacion) {
		this.saturacion = saturacion;
	}




	public String getAlergias() {
		return alergias;
	}




	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getEnfermedades_previas() {
		return enfermedades_previas;
	}

	public void setEnfermedades_previas(String enfermedades_previas) {
		this.enfermedades_previas = enfermedades_previas;
	}
	
	public String add() {
		SignosVitales cliente = new SignosVitales(this.id, this.alergias, this.enfermedades_previas, this.frecuencia_cardiaca, this.frecuencia_respiratorio,this.presion, this.saturacion, this.temperatura);
		ejbSignosFacade.create(cliente);
		System.out.println("cliente creado con exito!");
		this.listarSignos = ejbSignosFacade.findAll();
		this.id=0;
		this.alergias="";
		this.enfermedades_previas="";
		this.frecuencia_cardiaca="";
		this.frecuencia_respiratorio="";
		this.presion="";
		this.saturacion="";
		this.temperatura="";
		return null;
	}
	
}