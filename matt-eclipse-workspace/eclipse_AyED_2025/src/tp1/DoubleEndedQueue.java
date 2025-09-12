package tp1;

public class DoubleEndedQueue <T> extends Queue <T>{

	public void enqueueFirst(T d) {
		data.add(0, d);
	}
}
