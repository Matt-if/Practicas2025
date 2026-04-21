package objetos2.ej8_ToDoItem;

public interface ItemState {

	public void handleStart(ToDoItem it);
	public void handleTogglePause(ToDoItem it);
	public void handleFinish(ToDoItem it);
}
