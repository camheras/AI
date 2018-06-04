package neural_net;

public class Connexion {

	public Node n1;
	public Node target;
	public double weight;

	public Connexion(Node n1, Node target, double weight) {
		this.n1 = n1;
		this.target = target;
		this.weight = weight;
		calc();
	}
	
	public void calc(){
		target.setValue(n1.getValue() * weight);
	}
}
