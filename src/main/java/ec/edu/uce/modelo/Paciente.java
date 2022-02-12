package ec.edu.uce.modelo;

import java.math.BigDecimal;
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
	private Integer cedula;
	
	@Column(name = "paci_nombre")
	private String nombre;
	
	@Column(name = "paci_apellido")
	private String apellido;
	
	@Column(name = "paci_fecha_nacimiento", columnDefinition = "TIMESTAMP") // HORA Y FECHA
	private LocalDateTime fechaNacimiento;

	@Column(name = "paci_codigo_iess")
	private Integer codigoIESS;
	
	@Column(name = "paci_estatura")
	private Integer estatura;
	
	@Column(name = "paci_peso")
	private BigDecimal peso;
	
	@Column(name = "paci_edad")
	private Integer edad;
	
	@OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
	private List<CitaMedica> detalleCitaMedicaPaciente;
	
}
