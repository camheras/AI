package neural_net;

public class OutputLayer extends Layer {
	private double[] values;
	private int nbNodes;

	public OutputLayer(double[] values) {
		super(null);
		this.values = values;
	}

	public void displayFinalValues() {
		System.out.println("-----------Output Layer----------");
		System.out.print(" [ ");
		for (int i = 0; i < this.values.length; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println("] ");
	}

}
