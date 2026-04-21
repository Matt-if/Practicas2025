package objetos2.ej8_ToDoItem;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private String name;
	private Instant startTime, endTime;   // save end time
	private ItemState state;
	private List<String> comments;
	
	public ToDoItem(String name) {
		this.name = name;
		this.state = new PendingState();
		this.comments = new ArrayList<String>();
	}

	public void start() {
		this.state.handleStart(this);
		this.startTime = Instant.now();
	}
	
	public void togglePause() {
		this.state.handleTogglePause(this);
	}
	
	public void finish() {
		this.state.handleFinish(this);
		this.endTime = Instant.now(); 
	}
	
	public Duration workedTime() {
		if (startTime != null && endTime == null)
			return Duration.between(startTime, Instant.now());
		else {
			if (startTime == null)
				throw new RuntimeException("La tarea aun no inicio");
			
			return Duration.between(startTime, endTime);
		}
	}
	
	public void addComment(String comment) {
		if (this.endTime != null)
			this.comments.add(comment);
	}
	
	public void setState(ItemState state) {
		this.state = state;
	}
}
