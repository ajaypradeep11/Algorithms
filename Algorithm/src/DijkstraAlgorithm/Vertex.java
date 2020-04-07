package DijkstraAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex>{
	
	private String name;
	private List<Edge> adjacentNodes;
	private boolean visited;
	private Vertex predecessor;
	private double distance = Double.MAX_VALUE;
	
	public Vertex(String name) {
		this.name = name;
		this.adjacentNodes = new ArrayList<Edge>();
	}
	
	public void addNeighbour(Edge edge) {
		this.adjacentNodes.add(edge);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Edge> getAdjacentNodes() {
		return adjacentNodes;
	}

	public void setAdjacentNodes(List<Edge> adjacentNodes) {
		this.adjacentNodes = adjacentNodes;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public Vertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	@Override
	public int compareTo(Vertex currentVertex) {
		// TODO Auto-generated method stub
		return Double.compare(this.distance, currentVertex.distance);
	}
	
	

}
