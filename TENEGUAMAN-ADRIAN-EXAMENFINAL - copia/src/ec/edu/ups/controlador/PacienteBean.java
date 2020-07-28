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
import ec.edu.ups.modelo.Paciente;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped

public class PacienteBean implements Serializable{

	public List<Paciente> getListarPacientes() {
		return listarPacientes;
	}

	public void setListarPacientes(List<Paciente> listarPacientes) {
		this.listarPacientes = listarPacientes;
	}

	public FaceletContext getFaceletContext() {
		return faceletContext;
	}

	public void setFaceletContext(FaceletContext faceletContext) {
		this.faceletContext = faceletContext;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void setEjbPacienteFacade(PacienteFacade ejbPacienteFacade) {
		this.ejbPacienteFacade = ejbPacienteFacade;
	}

	private static final long serialVersionUID = 1L;

	private static final String fecha = null;

	@EJB
	private PacienteFacade ejbPacienteFacade;
	private static HttpSession httpSession;
	private List<Paciente> listarPacientes;
	

	private FaceletContext faceletContext;
	private String cedula;
	private String nombre;
	private String apellido;
	private String correo;

	public PacienteBean() {

	}

	@PostConstruct
	public void init() {

		this.listarPacientes = ejbPacienteFacade.findAll();
		System.out.println(listarPacientes);

	}

	public PacienteFacade getEjbPacienteFacade() {
		return ejbPacienteFacade;
	}
	
	public String add() {
		Paciente cliente = new Paciente(this.cedula, this.nombre, this.apellido, this.correo);
		ejbPacienteFacade.create(cliente);
		System.out.println("cliente creado con exito!");
		this.listarPacientes = ejbPacienteFacade.findAll();
		this.cedula="";
		this.nombre="";
		this.apellido="";
		this.correo="";
		return null;
	}
	
}