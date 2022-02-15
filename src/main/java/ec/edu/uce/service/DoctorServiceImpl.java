package ec.edu.uce.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.repository.IDoctorRepo;

@Service
public class DoctorServiceImpl implements IDoctorService {

	private static Logger LOG = Logger.getLogger(DoctorServiceImpl.class);

	@Autowired
	private IDoctorRepo iDoctorRepo;

	@Override
	public void insertarDoctor(Doctor doctor) {
		this.iDoctorRepo.insertarDoctor(doctor);
		LOG.info("se ha ingresado un doctor");
	}

	@Override
	public Doctor buscarDoctor(Integer id) {
		return this.iDoctorRepo.buscarDoctor(id);
	}

	@Override
	public Doctor buscarDoctorApellido(String apellido) {
		return this.iDoctorRepo.buscarDoctorApellido(apellido);
	}

	@Override
	public void actualizarDoctor(Doctor doctor) {
		this.iDoctorRepo.actualizarDoctor(doctor);
		LOG.info("Se ha actualizado el Doctor");
	}

	@Override
	public void borrarDoctor(Integer id) {
		this.iDoctorRepo.borrarDoctor(id);
	}

}
