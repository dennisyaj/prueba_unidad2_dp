package ec.edu.uce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.service.IDoctorService;

@RestController
@RequestMapping("/doctores")
public class DoctorControllerRestFul {

	@Autowired
	private IDoctorService iDoctorService;

	@PostMapping
	private void guardarDoctor(@RequestBody Doctor doctor) {
		this.iDoctorService.insertarDoctor(doctor);
	}

	@GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	private Doctor obtenerDoctor(@PathVariable("id") Integer id) {
		return this.iDoctorService.buscarDoctor(id);
	}
	
	@PutMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	private Doctor actualizarDoctor(@PathVariable("id") Integer id,@RequestBody Doctor doctor) {
		doctor.setId(id);
		this.iDoctorService.actualizarDoctor(doctor);
		return this.iDoctorService.buscarDoctor(id);
	}
	
	@DeleteMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	private void eliminarDoctor(@PathVariable("id") Integer id){
		this.iDoctorService.borrarDoctor(id);
	}

}
