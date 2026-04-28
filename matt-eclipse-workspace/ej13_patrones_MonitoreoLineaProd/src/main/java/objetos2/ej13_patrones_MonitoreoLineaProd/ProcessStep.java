package objetos2.ej13_patrones_MonitoreoLineaProd;

public abstract class ProcessStep {

	private boolean result;
	
	protected abstract boolean basicExecute (MixingTank tank);
	
	public boolean isDone( ) {
		return result;
	}
	
	private void setSuccess() {
		this.result = true;
	}
	
	private void setFailure() {
		this.result = false;
	}
	
	public void execute (MixingTank tank) {
		if (this.basicExecute(tank)) {
			this.setSuccess();
		}
		else this.setFailure();
	}

}
