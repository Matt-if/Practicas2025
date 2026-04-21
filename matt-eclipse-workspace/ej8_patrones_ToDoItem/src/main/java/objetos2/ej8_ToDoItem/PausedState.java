package objetos2.ej8_ToDoItem;

public class PausedState implements ItemState {

	@Override
	public void handleStart(ToDoItem it) {

	}

	@Override
	public void handleTogglePause(ToDoItem it) {
		it.setState(new InProgressState());

	}

	@Override
	public void handleFinish(ToDoItem it) {
		it.setState(new FinishedState());
	}

}
