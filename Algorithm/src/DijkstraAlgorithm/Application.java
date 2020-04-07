package DijkstraAlgorithm;

import java.util.ArrayList;
import java.util.List;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vertex index0 = new Vertex("A");
		Vertex index1 = new Vertex("B");
		Vertex index2 = new Vertex("C");
		List<Vertex> list = new ArrayList<Vertex>();
		index0.addNeighbour(new Edge(1,index0,index1));
		index0.addNeighbour(new Edge(2,index0,index2));
		index1.addNeighbour(new Edge(3,index1,index2));
		list.add(index0);
		list.add(index1);
		list.add(index2);
		DijkstraAlgorithm dj = new DijkstraAlgorithm();
		dj.compareVertex(index0);
		System.out.println(dj.getShortestPath(index2));
	}

}
