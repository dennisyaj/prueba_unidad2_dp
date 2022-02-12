package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.repository.ICitaMedicaRepo;

@Service
public class GestorCitaServiceImpl implements IGestorCitaService {
	@Autowired
	private ICitaMedicaRepo iCitaMedicaRepo;

	@Override
	public void agendamientoCitaMedica(Integer Número, LocalDateTime fechaCita, BigDecimal valorCita, String cita,
			String cedulaDoctor, String cedulaPaciente) {

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
