package ec.edu.uce.repository;

import ec.edu.uce.modelo.CitaMedica;

public interface ICitaMedicaRepo {

	void insertarCita(CitaMedica citaMedica);
	public CitaMedica buscarNumeroCita(String numero);
	public void actualizar(CitaMedica citaMedica);
}
