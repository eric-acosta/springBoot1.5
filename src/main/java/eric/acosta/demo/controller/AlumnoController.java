package eric.acosta.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eric.acosta.demo.model.Alumno;
import eric.acosta.demo.service.IPersonaService;

@RestController //Tambien es un Stereotipo para servicios REST
@RequestMapping("/alumnos")// (RequestMapping valido en estos casos), la anotacion RestController siempre va
public class AlumnoController {
	
	@Autowired //Para indicar que ya existe en el repositorio de beans de spring (Para usar la inyeccion de dependencias) No es estereotipo
	private IPersonaService service;

	@GetMapping
	public List<Alumno> listar() {
		return service.listar();
		
	}
	
	@GetMapping(value = "/{id}")
	public Alumno listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
		
	}
	
	@PostMapping
	public Alumno registrar(@RequestBody Alumno alumno) {
		return service.crear(alumno);
		
	}
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id); 
		
	}

}
