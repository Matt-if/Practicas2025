package objetos2.ej8_ToDoItem;

public class FinishedState implements ItemState {

	@Override
	public void handleStart(ToDoItem it) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleTogglePause(ToDoItem it) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}

	@Override
	public void handleFinish(ToDoItem it) {
	}

}
