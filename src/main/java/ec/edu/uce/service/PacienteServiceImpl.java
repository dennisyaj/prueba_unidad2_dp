package ec.edu.uce.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.IPacienteRepo;

@Service
public class PacienteServiceImpl implements IPacienteService {

	private static Logger LOG = Logger.getLogger(PacienteServiceImpl.class);

	@Autowired
	private IPacienteRepo iPacienteRepo;

	@Override
	public void insertarPaciente(Paciente paciente) {
		LOG.info("se ha ingresado un paciente");
		this.iPacienteRepo.insertarPaciente(paciente);
	}

	@Override
	public Paciente buscarPaciente(Integer id) {
		return this.iPacienteRepo.buscarPaciente(id);
	}

	@Override
	public void actualizarPaciente(Paciente paciente) {
		this.iPacienteRepo.actualizarPaciente(paciente);
	}

	@Override
	public void borrarPaciente(Integer id) {
		this.iPacienteRepo.borrarPaciente(id);
	}

}
