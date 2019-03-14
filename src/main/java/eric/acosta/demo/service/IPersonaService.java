package eric.acosta.demo.service;

import java.util.List;

import eric.acosta.demo.model.Alumno;

public interface IPersonaService {
	Alumno crear(Alumno alumno);
	Alumno modificar(Alumno alumno);
	List<Alumno> listar();
	Alumno listarPorId(Integer id);
	void eliminar(Integer id);

}
