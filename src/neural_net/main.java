package neural_net;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<Node> nodes;
		nodes = new ArrayList<Node>();
		double[] val_node1 = { 0.5 };
		double[] val_node2 = { 1 };
		double[] val_node3 = { 0 };
		double weight_node1 = 3;
		double weight_node2 = 2;
		double weight_node3 = 1;

		Node node1 = new Node();
		Node node2 = new Node(weight_node1, val_node1, node1);
		Node node3 = new Node(weight_node2, val_node2, node1);
		Node node4 = new Node(weight_node3, val_node3, node1);

		nodes.add(node1);
		nodes.add(node2);
		nodes.add(node3);
		nodes.add(node4);

		for (int i = 0; i < nodes.size(); i++) {
			if (nodes.get(i).getConnexion() != null) {
				System.out.println("lol");
			}
		}

		System.out.println(calculateSums(nodes));
	}

	public static double sigmoid(double value) {
		return 1 / (1 + Math.exp(-value));
		
	}

	public static double[] calculateSums(ArrayList<Node> nodes) {
		double[] results = null;
		double[] calcWeights = null;
		for (int i = 0; i < nodes.size(); i++) {

			if (nodes.get(i).getWeight() != null) {
				for (int j = 0; j < nodes.get(i).getWeight().length; j++) {
					if (nodes.get(i).getWeight() != null && nodes.get(i).getValue() != 0) {
						System.out.println("i : " + i + " j : " + j);
						System.out.println(
								"weight : " + nodes.get(i).getWeight()[j] + " value : " + nodes.get(i).getValue());
 						calcWeights[j] = nodes.get(i).getWeight()[j]*nodes.get(i).getValue();

					}
				}
				//results[i] = calcWeights[i];
			}else {
				System.out.println("pas de tableau");
			}

			
		}

		return calcWeights;

	}

}
