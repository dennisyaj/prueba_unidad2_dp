package ec.edu.uce.repository;

import ec.edu.uce.modelo.Doctor;

public interface IDoctorRepo {

	void insertarDoctor(Doctor doctor);

	Doctor buscarDoctor(Integer id);

	void actualizarDoctor(Doctor doctor);

	void borrarDoctor(Integer id);

	Doctor buscarDoctorPorCedula(String cedula);
}
