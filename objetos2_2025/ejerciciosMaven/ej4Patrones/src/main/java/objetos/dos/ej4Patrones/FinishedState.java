package objetos.dos.ej4Patrones;

import java.time.LocalDate;

public class FinishedState extends State{
	
	public State handleStart(LocalDate f) {
		return this;
	}
	
	public State handleTogglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	public State handleFinish(LocalDate fechaFin) { 
		fechaFin = LocalDate.now();
		return this;
	}
	
	@Override
	public boolean canComment() {
		return false;
	}
}
