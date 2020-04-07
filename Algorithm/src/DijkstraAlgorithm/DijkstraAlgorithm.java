package DijkstraAlgorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {

	public void compareVertex(Vertex givenVertex) {
		givenVertex.setDistance(0);
		PriorityQueue<Vertex> priority = new PriorityQueue<Vertex>();
		priority.add(givenVertex);
		
		while(!priority.isEmpty()) {
			Vertex vertexFromQueue = priority.poll();
				for(Edge edge:vertexFromQueue.getAdjacentNodes()) {
					Vertex v= edge.getTargetVertex();
					double newdistance = vertexFromQueue.getDistance() + edge.getWeight();
					if(newdistance < v.getDistance()) {
						priority.remove(v);
						v.setDistance(newdistance);
						v.setPredecessor(vertexFromQueue);
						priority.add(v);
					}
				}
		}
	}
	

	public List<String> getShortestPath(Vertex targetVertex) {
		List<Vertex> shortestPathTarget = new ArrayList<Vertex>();
		List<String> shortestPathTargetdata = new ArrayList<String>();
		for(Vertex vertex = targetVertex;vertex!=null; vertex = vertex.getPredecessor()) {
			shortestPathTarget.add(vertex);
			shortestPathTargetdata.add(vertex.getName());
		}
		Collections.reverse(shortestPathTarget);
		Collections.reverse(shortestPathTargetdata);
		return shortestPathTargetdata;
	}
}
