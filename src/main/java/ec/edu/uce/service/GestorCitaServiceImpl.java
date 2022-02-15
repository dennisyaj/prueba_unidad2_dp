package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.ICitaMedicaRepo;

@Service
public class GestorCitaServiceImpl implements IGestorCitaService {

	private static Logger LOG = Logger.getLogger(GestorCitaServiceImpl.class);
	
	@Autowired
	private ICitaMedicaRepo iCitaMedicaRepo;

	@Autowired
	private IDoctorService iDoctorService;

	@Autowired
	private IPacienteService iPacienteService;

	@Override
	public void agendamientoCitaMedica(String Número, LocalDateTime fechaCita, BigDecimal valorCita, String lugarCita,
			String apellidoDoctor, String codigoSeguroPaciente) {

		Doctor doctor = this.iDoctorService.buscarDoctorApellido(apellidoDoctor);
		Paciente paciente = this.iPacienteService.buscarPacienteCodigoSeguro(codigoSeguroPaciente);

		CitaMedica citaMedica = new CitaMedica();
		citaMedica.setNumero(Número);
		citaMedica.setFechaCita(fechaCita);
		BigDecimal temp = valorCita.multiply(new BigDecimal(0.12));
		citaMedica.setValorCita(valorCita.add(temp));
		citaMedica.setLugarCita(lugarCita);
		citaMedica.setDoctor(doctor);
		citaMedica.setPaciente(paciente);

		LocalDate hoy = LocalDate.now();
		LocalTime ahora = LocalTime.now();
		LocalDateTime fechaActual = LocalDateTime.of(hoy, ahora);

		if (fechaCita.isAfter(fechaActual)) {
			this.iCitaMedicaRepo.insertarCita(citaMedica);
			LOG.info("Se ha insertado una cita");
		} else {
			LOG.warn("No se pudo agendar la cita");
		}

	}

	@Override
	public void actualizacionCitaMedica(CitaMedica citaMedica) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reporteCitaMedica(CitaMedica citaMedica) {
		// TODO Auto-generated method stub

	}

}
