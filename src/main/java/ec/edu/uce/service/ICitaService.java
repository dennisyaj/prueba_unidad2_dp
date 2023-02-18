package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import ec.edu.uce.modelo.CitaMedica;

public interface ICitaService {

	void agendamientoCitaMedica(Integer Número, LocalDateTime fechaCita, BigDecimal valorCita, String cita,
			String cedulaDoctor, String cedulaPaciente);

	void reporteCitaMedica(CitaMedica citaMedica);

	void actualizacionCitaMedica(String numeroCitaMedica);

	public CitaMedica buscarNumeroCita(String numero);
}
