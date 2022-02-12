package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.CitaMedica;

@Repository
public class CitaMedicaRepoImpl implements ICitaMedicaRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertarCita(CitaMedica citaMedica) {
		
		Object[] datosAInsertar = new Object[] { citaMedica.getNumero(),citaMedica.getFechaCita(),citaMedica.getValorCita(),citaMedica.getLugarCita()};
		this.jdbcTemplate.update("insert into cita_medica(cime_numero, cime_fecha_cita, cime_valor_cita, cime_lugar_cita) values (?,?,?,?)", datosAInsertar);
		
		
		
		//•Número•Fecha cita•Valor cita•Lugar cita•Cedula doctor•Cedula paciente

	}

}
