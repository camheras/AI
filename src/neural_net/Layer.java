package neural_net;

public class Layer {
	private int nbNode;
	private double[] weights;

	public Layer(double[] weights) {
		this.nbNode = weights.length
				;
		this.weights = weights;
	}
}
