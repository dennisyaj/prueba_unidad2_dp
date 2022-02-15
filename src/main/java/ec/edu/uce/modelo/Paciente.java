package ec.edu.uce.modelo;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_paciente")
	@SequenceGenerator(name = "seq_paciente", sequenceName = "seq_paciente", allocationSize = 1)
	@Column(name = "paci_id")
	private Integer id;

	@Column(name = "paci_cedula")
	private String cedula;

	@Column(name = "paci_nombre")
	private String nombre;

	@Column(name = "paci_apellido")
	private String apellido;

	@Column(name = "paci_fecha_nacimiento", columnDefinition = "TIMESTAMP") // HORA Y FECHA
	private LocalDateTime fechaNacimiento;

	@Column(name = "paci_codigo_iess")
	private String codigoIESS;

	@Column(name = "paci_estatura")
	private Double estatura;

	@Column(name = "paci_peso")
	private Double peso;

	@Column(name = "paci_edad")
	private String edad;

	@OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
	private List<CitaMedica> detalleCitaMedicaPaciente;

	// gets and sets
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCodigoIESS() {
		return codigoIESS;
	}

	public void setCodigoIESS(String codigoIESS) {
		this.codigoIESS = codigoIESS;
	}

	public Double getEstatura() {
		return estatura;
	}

	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public List<CitaMedica> getDetalleCitaMedicaPaciente() {
		return detalleCitaMedicaPaciente;
	}

	public void setDetalleCitaMedicaPaciente(List<CitaMedica> detalleCitaMedicaPaciente) {
		this.detalleCitaMedicaPaciente = detalleCitaMedicaPaciente;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", codigoIESS=" + codigoIESS + ", estatura=" + estatura
				+ ", peso=" + peso + ", edad=" + edad + "]";
	}

}
