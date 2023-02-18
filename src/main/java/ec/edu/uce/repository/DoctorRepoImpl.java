package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Doctor;

@Repository
@Transactional
public class DoctorRepoImpl implements IDoctorRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarDoctor(Doctor doctor) {
//		Object[] datosAInsertar = new Object[] {  doctor.getApellido(), doctor.getCedula(), doctor.getCodigoSenescyt(), doctor.getFechaNacimiento(), doctor.getId(), doctor.getNombre(), doctor.getNumeroConsultorio(), doctor.getSueldo()};
//		this.jdbcTemplate.update("insert into doctor(doct_apellido, doct_cedula, doct_codigo_senescyt, doct_fecha_nacimiento,doct_id,doct_nombre,doct_numero_consultorio,doct_sueldo) values (?,?,?,?,?,?,?,?)", datosAInsertar);
		this.entityManager.persist(doctor);
	}

	@Override
	public Doctor buscarDoctor(Integer id) {
		return this.entityManager.find(Doctor.class, id);
	}

	@Override
	public void actualizarDoctor(Doctor doctor) {
		this.entityManager.merge(doctor);
	}

	@Override
	public void borrarDoctor(Integer id) {
		Doctor gBorrar = this.buscarDoctor(id);
		this.entityManager.remove(gBorrar);
	}

	@Override
	public Doctor buscarDoctorPorCedula(String cedula) {
		TypedQuery<Doctor> query = this.entityManager.createQuery("SELECT d FROM Doctor WHERE d.cedula=:cedula",
				Doctor.class);
		query.setParameter("cedula", cedula);
		return query.getSingleResult();
	}

}
