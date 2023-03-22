package py.edu.facitec.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.web.bind.annotation.Mapping;

//Una anotación aporta informacion adicional a la clase.

// La implementación de JPA una de ellas es HIBERNATE
// ORM   OBJECT RELACIONAL MAPPING
// Objeto   -->Generar la consulta SQL
//Sirve para crear una tabla.
@Entity
public class Suscrito {
	
@Id  //Clave primaria
@GeneratedValue   //Generación automática de clave
private Long codigo;
private String nombre;
private String correo;

@OneToMany(mappedBy = "suscrito")
private java.util.List<Suscrito> suscrito;

public Long getCodigo() {
	return codigo;
}

public void setCodigo(Long codigo) {
	this.codigo = codigo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

public java.util.List<Suscrito> getSuscrito() {
	return suscrito;
}

public void setSuscrito(java.util.List<Suscrito> suscrito) {
	this.suscrito = suscrito;
}

@Override
public String toString() {
	return "Suscrito [codigo=" + codigo + ", nombre=" + nombre + ", correo=" + correo + "]";
}






}
