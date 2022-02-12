package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import ec.edu.uce.modelo.CitaMedica;

public interface IGestorCitaService {

	void agendamientoCitaMedica(Integer Número, LocalDateTime fechaCita, BigDecimal valorCita, String cita, String cedulaDoctor, String cedulaPaciente);

	void actualizacionCitaMedica(CitaMedica citaMedica);

	void reporteCitaMedica(CitaMedica citaMedica);
}
