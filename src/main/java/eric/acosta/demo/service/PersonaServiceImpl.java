package eric.acosta.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eric.acosta.demo.dao.IPersonaDAO;
import eric.acosta.demo.model.Alumno;

@Service //Para definir logica de negocio se usa estereotipo
public class PersonaServiceImpl implements IPersonaService{
	
	@Autowired
	private IPersonaDAO dao;

	@Override
	public Alumno crear(Alumno alumno) {

		return dao.save(alumno);
	}

	@Override
	public Alumno modificar(Alumno alumno) {
		
		return dao.save(alumno);
	}

	@Override
	public List<Alumno> listar() {
		

		return dao.findAll();
	}

	@Override
	public Alumno listarPorId(Integer id) {
		

		return dao.findOne(id);
	}

	@Override
	public void eliminar(Integer id) {
		
		dao.delete(id);
		
	}





}
