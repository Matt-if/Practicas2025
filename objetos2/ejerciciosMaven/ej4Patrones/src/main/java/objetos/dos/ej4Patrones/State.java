package objetos.dos.ej4Patrones;

import java.time.Duration;
import java.time.LocalDate;

public abstract class State{
	
	public abstract State handleStart(LocalDate f);
	public abstract State handleTogglePause();
	public abstract State handleFinish(LocalDate f);
	
	public Duration handleWorkedTime(LocalDate inicio, LocalDate fin) {
		if (fin == null) fin = LocalDate.now();
		
		return Duration.between(inicio, fin);
	}
	
	public boolean canComment() {
		return true;
	}
	
}
