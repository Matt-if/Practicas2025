package objetos.dos.ej21_genealogiaSalvaje;

import java.time.LocalDate;
import java.util.Optional;

public class NullMamifero implements MamiferoInterface {

	@Override
	public NullMamifero getPadre() {
		return this;
	}
	
	@Override
	public NullMamifero  getMadre() {
		return this;
	}

	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void setIdentificador(String identificador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getEspecie() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void setEspecie(String especie) {
		// TODO Auto-generated method stub
		
	}

	// Aca lo mas profesional seria que el metodo de la interfaz defina que el tipo devuelto sea Optional<LocalDate>, 
	// entonces aca seria "return Optional.empty(); "
	@Override
	public LocalDate getFechaNacimiento() {
		// TODO Auto-generated method stub
		return LocalDate.MAX;
	}

	@Override
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPadre(Mamifero padre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMadre(Mamifero madre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NullMamifero getAbueloMaterno() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public NullMamifero getAbueloPaterno() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public NullMamifero getAbuelaMaterna() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public NullMamifero getAbuelaPaterna() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Boolean tieneComoAncestroA(Mamifero unMamifero) {
		// TODO Auto-generated method stub
		return false;
	}

}
