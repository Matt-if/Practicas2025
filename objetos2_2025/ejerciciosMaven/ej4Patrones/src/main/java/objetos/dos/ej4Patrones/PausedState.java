package objetos.dos.ej4Patrones;

import java.time.LocalDate;

public class PausedState extends State{
	
	public State handleStart(LocalDate f) {
		return this;
	}
	
	public State handleTogglePause() {
		return new InProgressState();
	}
	
	public State handleFinish(LocalDate f) {
		return new FinishedState();
	}

}
