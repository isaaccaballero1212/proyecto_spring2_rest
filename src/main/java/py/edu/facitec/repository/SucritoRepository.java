package py.edu.facitec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import py.edu.facitec.model.Suscrito;
// PRIMER ELEMENTO ES LA ENTIDAD EL SEGUNDO TIPO DE ID 
public interface SucritoRepository extends JpaRepository<Suscrito,Long> {

}
