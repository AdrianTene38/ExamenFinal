package ec.edu.ups.modelo;

import java.io.Serializable;

import javax.persistence.Id;

public class SignosVitales implements Serializable {
	@Id
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	private String presion;
	private String frecuencia_cardiaca;
	private String frecuencia_respiratorio;
	private String temperatura;
	private String saturacion;
	private String alergias;
	private String enfermedades_previas;
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	private Paciente paciente;
	public SignosVitales(int id, String presion, String frecuencia_cardiaca, String frecuencia_respiratorio,
			String temperatura, String saturacion, String alergias, String enfermedades_previas) {
		super();
		this.id = id;
		this.presion = presion;
		this.frecuencia_cardiaca = frecuencia_cardiaca;
		this.frecuencia_respiratorio = frecuencia_respiratorio;
		this.temperatura = temperatura;
		this.saturacion = saturacion;
		this.alergias = alergias;
		this.enfermedades_previas = enfermedades_previas;
	}

	public SignosVitales() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alergias == null) ? 0 : alergias.hashCode());
		result = prime * result + ((enfermedades_previas == null) ? 0 : enfermedades_previas.hashCode());
		result = prime * result + ((frecuencia_cardiaca == null) ? 0 : frecuencia_cardiaca.hashCode());
		result = prime * result + ((frecuencia_respiratorio == null) ? 0 : frecuencia_respiratorio.hashCode());
		result = prime * result + id;
		result = prime * result + ((presion == null) ? 0 : presion.hashCode());
		result = prime * result + ((saturacion == null) ? 0 : saturacion.hashCode());
		result = prime * result + ((temperatura == null) ? 0 : temperatura.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SignosVitales other = (SignosVitales) obj;
		if (alergias == null) {
			if (other.alergias != null)
				return false;
		} else if (!alergias.equals(other.alergias))
			return false;
		if (enfermedades_previas == null) {
			if (other.enfermedades_previas != null)
				return false;
		} else if (!enfermedades_previas.equals(other.enfermedades_previas))
			return false;
		if (frecuencia_cardiaca == null) {
			if (other.frecuencia_cardiaca != null)
				return false;
		} else if (!frecuencia_cardiaca.equals(other.frecuencia_cardiaca))
			return false;
		if (frecuencia_respiratorio == null) {
			if (other.frecuencia_respiratorio != null)
				return false;
		} else if (!frecuencia_respiratorio.equals(other.frecuencia_respiratorio))
			return false;
		if (id != other.id)
			return false;
		if (presion == null) {
			if (other.presion != null)
				return false;
		} else if (!presion.equals(other.presion))
			return false;
		if (saturacion == null) {
			if (other.saturacion != null)
				return false;
		} else if (!saturacion.equals(other.saturacion))
			return false;
		if (temperatura == null) {
			if (other.temperatura != null)
				return false;
		} else if (!temperatura.equals(other.temperatura))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SignosVitales [id=" + id + ", presion=" + presion + ", frecuencia_cardiaca=" + frecuencia_cardiaca
				+ ", frecuencia_respiratorio=" + frecuencia_respiratorio + ", temperatura=" + temperatura
				+ ", saturacion=" + saturacion + ", alergias=" + alergias + ", enfermedades_previas="
				+ enfermedades_previas + "]";
	}
}