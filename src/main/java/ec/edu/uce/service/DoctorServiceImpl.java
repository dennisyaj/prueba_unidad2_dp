package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.repository.IDoctorRepo;

@Service
public class DoctorServiceImpl implements IDoctorService {


	@Autowired
	private IDoctorRepo iDoctorRepo;

	@Override
	public void insertarDoctor(Doctor doctor) {
		this.iDoctorRepo.insertarDoctor(doctor);

	}

	@Override
	public Doctor buscarDoctor(Integer id) {
		return this.iDoctorRepo.buscarDoctor(id);
	}

	@Override
	public void actualizarDoctor(Doctor doctor) {
		this.iDoctorRepo.actualizarDoctor(doctor);
	}

	@Override
	public void borrarDoctor(Integer id) {
		this.iDoctorRepo.borrarDoctor(id);
	}

	@Override
	public Doctor buscarDoctorCEdula(String cedula) {
		return this.iDoctorRepo.buscarDoctorPorCedula(cedula);
	}

}
