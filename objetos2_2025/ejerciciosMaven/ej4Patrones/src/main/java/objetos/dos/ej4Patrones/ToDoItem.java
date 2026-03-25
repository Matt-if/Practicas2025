package objetos.dos.ej4Patrones;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

public class ToDoItem {
	private String name;
	private List<String> comentarios;
	private State state; //private StateInterface state;
	private LocalDate inicio, fin;
	
	/* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.*/
	public ToDoItem(String name) {
		this.name = name;
		this.state = new PendingState();
	}

	/* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea pending. 
	 * Si se encuentra en otro estado, no hace nada.*/
	public void start() {
		this.state = this.state.handleStart(this.inicio);
	}

	/* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
	* estado es paused. Caso contrario (pending o finished) genera un error
	* informando la causa específica del mismo.
	*/
	public void togglePause() {
		 this.state = this.state.handleTogglePause();
	}
	 
	 /* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea in-progress o paused. 
	  Si se encuentra en otro estado, no hace nada. */
	public void finish() {
		 this.state = this.state.handleFinish(this.fin);
	}

	 /* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
	 * hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
	 * haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
	 * genera un error informando la causa específica del mismo. */
	public Duration workedTime() {
		return this.state.handleWorkedTime(this.inicio, this.fin); 
	}

	 /* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso contrario no hace nada." */
	public void addComment(String comment) {
		if (this.state.canComment()) comentarios.add(comment);
	}
}
