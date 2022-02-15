package ec.edu.uce.service;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteService {

	void insertarPaciente(Paciente paciente);

	Paciente buscarPaciente(Integer id);

	Paciente buscarPacienteCodigoSeguro(String codigo);

	void actualizarPaciente(Paciente paciente);

	void borrarPaciente(Integer id);
}
