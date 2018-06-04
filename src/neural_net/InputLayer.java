package neural_net;

public class InputLayer extends Layer {
	private double[] values;

	public InputLayer(double[] values,double[] weights) {
		super(weights);
		this.values = values;
	}
	
	

}
