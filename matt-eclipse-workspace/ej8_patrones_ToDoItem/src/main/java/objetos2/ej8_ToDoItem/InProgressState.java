package objetos2.ej8_ToDoItem;

public class InProgressState implements ItemState {

	@Override
	public void handleStart(ToDoItem it) {

	}

	@Override
	public void handleTogglePause(ToDoItem it) {
		it.setState(new PausedState());

	}

	@Override
	public void handleFinish(ToDoItem it) {
		it.setState(new FinishedState());

	}

}
