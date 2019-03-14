package eric.acosta.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import eric.acosta.demo.model.Alumno;

public interface IPersonaDAO extends JpaRepository<Alumno,Integer> {

}
