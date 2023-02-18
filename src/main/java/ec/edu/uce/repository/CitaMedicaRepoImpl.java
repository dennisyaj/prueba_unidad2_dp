package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.CitaMedica;

@Repository
public class CitaMedicaRepoImpl implements ICitaMedicaRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarCita(CitaMedica citaMedica) {

		Object[] datosAInsertar = new Object[] { citaMedica.getNumero(), citaMedica.getFechaCita(),
				citaMedica.getValorCita(), citaMedica.getLugarCita() };
		this.jdbcTemplate.update(
				"insert into cita_medica(cime_numero, cime_fecha_cita, cime_valor_cita, cime_lugar_cita) values (?,?,?,?)",
				datosAInsertar);

		// •Número•Fecha cita•Valor cita•Lugar cita•Cedula doctor•Cedula paciente

	}

	@Override
	public CitaMedica buscarNumeroCita(String numero) {
		TypedQuery<CitaMedica> query = this.entityManager.createQuery("SELECT c FROM CitaMedica WHERE c.numero=:cedula",
				CitaMedica.class);
		query.setParameter("numero", numero);
		return query.getSingleResult();
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub

	}

}
