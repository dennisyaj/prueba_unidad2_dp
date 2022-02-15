package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Paciente;

@Repository
@Transactional
public class PacienteRepoImpl implements IPacienteRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarPaciente(Paciente paciente) {
		this.entityManager.persist(paciente);
	}

	@Override
	public Paciente buscarPaciente(Integer id) {
		return this.entityManager.find(Paciente.class, id);
	}

	@Override
	public Paciente buscarPacienteCodigoSeguro(String codigo) {
		TypedQuery<Paciente> typedQuery = this.entityManager.createQuery("SELECT p FROM Paciente p where p.codigoIESS=:valor", Paciente.class);
		typedQuery.setParameter("valor", codigo);

		return typedQuery.getSingleResult();
	}

	@Override
	public void actualizarPaciente(Paciente paciente) {
		this.entityManager.merge(paciente);
	}

	@Override
	public void borrarPaciente(Integer id) {
		Paciente paciente = this.buscarPaciente(id);
		this.entityManager.remove(paciente);
	}

}
