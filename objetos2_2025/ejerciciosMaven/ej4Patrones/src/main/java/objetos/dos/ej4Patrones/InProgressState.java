package objetos.dos.ej4Patrones;

import java.time.LocalDate;

public class InProgressState extends State{
	
	public State handleStart(LocalDate f) {
		return this;
	}
	
	public State handleTogglePause() {
		return new PausedState();
	}
	
	public State handleFinish(LocalDate f) {
		return new FinishedState();
	}

}
