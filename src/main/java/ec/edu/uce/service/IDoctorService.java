package ec.edu.uce.service;

import ec.edu.uce.modelo.Doctor;

public interface IDoctorService {

	void insertarDoctor(Doctor doctor);

	Doctor buscarDoctor(Integer id);

	void actualizarDoctor(Doctor doctor);

	void borrarDoctor(Integer id);
}
