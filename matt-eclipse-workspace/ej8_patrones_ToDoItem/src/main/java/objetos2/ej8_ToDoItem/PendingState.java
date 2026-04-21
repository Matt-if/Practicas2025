package objetos2.ej8_ToDoItem;

public class PendingState implements ItemState {

	@Override
	public void handleStart(ToDoItem it) {
		it.setState(new InProgressState());
	}

	@Override
	public void handleTogglePause(ToDoItem it) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}

	@Override
	public void handleFinish(ToDoItem it) {
	}

}
