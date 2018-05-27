package neural_net;

public class Node {

	private Node[] connexion;
	private double[] values;
	private double  value;
	private double[] weights;

	public Node(double[] values, double[] weights, Node... connexion) { // layers
		this.weights = weights;
		this.connexion = connexion;
		this.values = values;
	}

	public Node() { // pour la node de fin
		this.connexion = null;
		this.values = null;
	}

	public double getValue() {
		return this.value;
	}

	public double[] getWeight() {
		return this.weights;
	}
	
	public Node[] getConnexion() {
		return this.connexion;
	}

	private void setValue(double value) {
		this.value = value;
		//marche
	}

}
