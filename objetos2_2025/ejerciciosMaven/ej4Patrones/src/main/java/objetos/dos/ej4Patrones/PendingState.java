package objetos.dos.ej4Patrones;

import java.time.Duration;
import java.time.LocalDate;

public class PendingState extends State{
	
	public State handleStart(LocalDate fechaActual) {
		fechaActual = LocalDate.now();
		return new InProgressState();
	}
	
	public State handleTogglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	@Override
	public Duration handleWorkedTime(LocalDate inicio, LocalDate fin) {
		throw new RuntimeException("ToDoItem no iniciado");
	}
	
	public State handleFinish(LocalDate f) {
		return this;
	}
}
