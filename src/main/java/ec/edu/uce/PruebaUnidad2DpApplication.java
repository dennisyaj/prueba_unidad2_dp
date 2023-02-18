package ec.edu.uce;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.service.IDoctorService;
import ec.edu.uce.service.ICitaService;
import ec.edu.uce.service.IPacienteService;

@SpringBootApplication
public class PruebaUnidad2DpApplication implements CommandLineRunner {

	@Autowired
	private IDoctorService iDoctorService;
	
	@Autowired
	private IPacienteService iPacienteService;
	
	@Autowired
	private ICitaService iGestorCitaService;

	public static void main(String[] args) {
		SpringApplication.run(PruebaUnidad2DpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//
//		LocalDateTime miFecha = LocalDateTime.of(1985, Month.AUGUST, 8, 12, 45);
//
//		Doctor doctor = new Doctor();
//		doctor.setApellido("alvare");
//		doctor.setCedula("12345");
//		doctor.setCodigoSenescyt(1235);
//		doctor.setFechaNacimiento(miFecha);
//		doctor.setNombre("Juan");
//		doctor.setNumeroConsultorio(15);
//		doctor.setSueldo(new BigDecimal("1500"));
//		this.iDoctorService.insertarDoctor(doctor);
//
//		LocalDateTime miFecha2 = LocalDateTime.of(1986, Month.AUGUST, 8, 12, 45);
//		Doctor doctor2 = new Doctor();
//		doctor2.setApellido("alvarez");
//		doctor2.setCedula("123456");
//		doctor2.setCodigoSenescyt(12356);
//		doctor2.setFechaNacimiento(miFecha2);
//		doctor2.setNombre("Pedro");
//		doctor2.setNumeroConsultorio(16);
//		doctor2.setSueldo(new BigDecimal("1600"));
//		this.iDoctorService.insertarDoctor(doctor2);
//
//		LocalDateTime miFecha3 = LocalDateTime.of(1987, Month.AUGUST, 8, 12, 45);
//		Paciente paciente = new Paciente();
//		paciente.setApellido("jaramillo");
//		paciente.setCedula("123456");
//		paciente.setCodigoIESS(123456);
//
//		paciente.setEdad(25);
//		paciente.setEstatura(new BigDecimal(18.5));
//		paciente.setFechaNacimiento(miFecha);
//		paciente.setNombre("Jairo");
//		paciente.setPeso(new BigDecimal("68.5"));
//		this.iPacienteService.insertarPaciente(paciente);
//		
//		LocalDateTime miFecha4 = LocalDateTime.of(1988, Month.AUGUST, 8, 12, 45);
//		Paciente paciente2 = new Paciente();
//		paciente2.setApellido("jaramillo");
//		paciente2.setCedula("123456");
//		paciente2.setCodigoIESS(123456);
//
//		paciente2.setEdad(25);
//		paciente2.setEstatura(new BigDecimal(18.5));
//		paciente2.setFechaNacimiento(miFecha);
//		paciente2.setNombre("Jairo");
//		paciente2.setPeso(new BigDecimal("68.5"));
//		this.iPacienteService.insertarPaciente(paciente2);
//		
//		this.iGestorCitaService.agendamientoCitaMedica(12, miFecha4, new BigDecimal(15), "", "", "");

	}

}
