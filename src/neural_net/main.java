package neural_net;

import java.lang.reflect.Array;
import java.util.ArrayList;

import grph.Grph;
import grph.in_memory.InMemoryGrph;

public class main {

	public static void main(String[] args) {
		ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);
		
		ArrayList<Node> nodes;
		nodes = new ArrayList<Node>();
		double w1 = 0.5;
		double w2 = 1;
		double w3 = 0;

		double val1 = 3;
		double val2 = 2;
		double val3 = 1;

		Node node1 = new Node();
		Node node2 = new Node(val1);
		Node node3 = new Node(val2);
		Node node4 = new Node(val3);
		
		double[] t = { 7.3 ,43 };
		
		OutputLayer l = new OutputLayer(t);
		l.displayFinalValues();
		
		Connexion c1 = new Connexion(node2, node1, w1);
		Connexion c2 = new Connexion(node3, node1, w1);
		Connexion c3 = new Connexion(node4, node1, w1);

		nodes.add(node1);
		nodes.add(node2);
		nodes.add(node3);
		nodes.add(node4);

		Grph g = new InMemoryGrph();
		g.addVertex((int)node1.getValue());
		g.addVertex((int)node2.getValue());
		g.addVertex((int)node3.getValue());
		g.addVertex((int)node4.getValue());
		g.addSimpleEdge((int)node1.getValue(), (int)node2.getValue(), false);
		g.addSimpleEdge((int)node1.getValue(), (int)node3.getValue(), false);
		g.addSimpleEdge((int)node1.getValue(), (int)node4.getValue(), false);
		g.display();
		//System.out.println(calculateSums(nodes));
	}

	public static double sigmoid(double value) {
		return 1 / (1 + Math.exp(-value));

	}

	public static double[] calculateSums(ArrayList<Node> nodes) {
		double[] results = null;
		double[] calcWeights = null;
		for (int i = 0; i < nodes.size(); i++) {

			/*if (nodes.get(i).getWeight() != null) {
				for (int j = 0; j < nodes.get(i).getWeight().length; j++) {
					if (nodes.get(i).getWeight() != null && nodes.get(i).getValue() != 0) {
						System.out.println("i : " + i + " j : " + j);
						System.out.println(
								"weight : " + nodes.get(i).getWeight()[j] + " value : " + nodes.get(i).getValue());
						calcWeights[j] = nodes.get(i).getWeight()[j] * nodes.get(i).getValue();

					}
				}
				// results[i] = calcWeights[i];
			} else {
				System.out.println("pas de tableau");
			}*/

		}

		return calcWeights;

	}

}
