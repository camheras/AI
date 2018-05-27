package neural_net;

public class InputNode extends Node {
	private double value;
	private Node[] connexion;
	private double[] weights;

	public InputNode(double value, double[] weights, Node... a) {
		this.value = value;
		this.connexion = a;
		this.weights = weights;
	}

	public double getValue() {
		return value;
	}

	public double[] getWeights() {
		return weights ;
	}
	
	public void setValue(double value) {
		this.value = value;
	}

	
	
}
