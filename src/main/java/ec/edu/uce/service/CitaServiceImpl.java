package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.repository.ICitaMedicaRepo;

@Service
public class CitaServiceImpl implements ICitaService {
	@Autowired
	private IPacienteService iPacienteService;
	@Autowired
	private ICitaMedicaRepo iCitaMedicaRepo;
	@Autowired
	private IDoctorService iDoctorService;

	@Override
	public void agendamientoCitaMedica(Integer Número, LocalDateTime fechaCita, BigDecimal valorCita, String cita,
			String cedulaDoctor, String cedulaPaciente) {
		CitaMedica citaMedica = new CitaMedica();
		citaMedica.setNumero(Número);
		citaMedica.setLugarCita(cita);
		citaMedica.setFechaCita(fechaCita);
		citaMedica.setValorCita(valorCita);
		this.iDoctorService.buscarDoctor(Número);
		citaMedica.setDoctor(this.iDoctorService.buscarDoctorCEdula(cedulaDoctor));
		citaMedica.setPaciente(this.iPacienteService.buscarPacienteCedula(cedulaPaciente));
		this.iCitaMedicaRepo.insertarCita(citaMedica);
	}

	@Override
	public void actualizacionCitaMedica(String numeroCitaMedica) {
		CitaMedica citaMedica= this.iCitaMedicaRepo.buscarNumeroCita(numeroCitaMedica);
		citaMedica.setDiagnostico("");
		citaMedica.setFechaControl(null);
		citaMedica.setReceta("");
		this.iCitaMedicaRepo.actualizar(citaMedica);
	}
	

	@Override
	public void reporteCitaMedica(CitaMedica citaMedica) {
		// TODO Auto-generated method stub

	}

	@Override
	public CitaMedica buscarNumeroCita(String numero) {
		return this.iCitaMedicaRepo.buscarNumeroCita(numero);
	}

	
}
