package objetos.dos.ej21_genealogiaSalvaje;

import java.time.LocalDate;

public interface MamiferoInterface {

	public String getIdentificador();
	
	public void setIdentificador(String identificador);
	
	public String getEspecie();
	
	public void setEspecie(String especie);
	
	public LocalDate getFechaNacimiento();
	
	public void setFechaNacimiento(LocalDate fechaNacimiento);
	
	public MamiferoInterface getPadre();
	
	public void setPadre(Mamifero padre);
	
	public MamiferoInterface getMadre();
	
	public void setMadre(Mamifero madre);
	
	public MamiferoInterface getAbueloMaterno ();
	
	public MamiferoInterface getAbueloPaterno();
	
	public MamiferoInterface getAbuelaMaterna();
	
	public MamiferoInterface getAbuelaPaterna();
	
	public Boolean tieneComoAncestroA (Mamifero unMamifero);

}

