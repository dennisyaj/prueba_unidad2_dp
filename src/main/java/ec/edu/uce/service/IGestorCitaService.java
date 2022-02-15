package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import ec.edu.uce.modelo.CitaMedica;

public interface IGestorCitaService {

	void agendamientoCitaMedica(String Número, LocalDateTime fechaCita, BigDecimal valorCita, String lugarCita, String apellidoDoctor, String codigoSeguroPaciente);

	void actualizacionCitaMedica(CitaMedica citaMedica);

	void reporteCitaMedica(CitaMedica citaMedica);
}
