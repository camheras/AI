package neural_net;

public class Node {

	private double  value;

	public Node(double value) { // layers
		this.value = value;
	}
	
	public Node() {
		
	}

	public double getValue() {
		return this.value;
	}

	public void setValue(double value) {
		this.value = value;

	}

}
