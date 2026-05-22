package objetos.dos.ej21_genealogiaSalvaje;

import java.time.LocalDate;

public class NullMamifero implements MamiferoInterface {

	@Override
	public Mamifero getPadre() {
		return null;
	}
	
	@Override
	public Mamifero getMadre() {
		return null;
	}

	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdentificador(String identificador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getEspecie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEspecie(String especie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LocalDate getFechaNacimiento() {
		// TODO Auto-generated method stub
		return null;
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
	public Mamifero getAbueloMaterno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mamifero getAbueloPaterno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mamifero getAbuelaMaterna() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mamifero getAbuelaPaterna() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean tieneComoAncestroA(Mamifero unMamifero) {
		// TODO Auto-generated method stub
		return null;
	}

}
