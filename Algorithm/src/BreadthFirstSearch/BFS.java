package BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public void bfs(Vertex vertexIndex) {
		Queue<Vertex> queuebfs = new LinkedList<>();
		queuebfs.add(vertexIndex);
		vertexIndex.setVisitedNode(true);
		System.out.println(vertexIndex.getVertexData()+" Root");
		while(!queuebfs.isEmpty()) {
			Vertex rootVertex = queuebfs.remove();
			for(Vertex neighbor : rootVertex.getAdjacentIndex()) {
				if(!neighbor.isVisitedNode()) {
					neighbor.setVisitedNode(true);
					queuebfs.add(neighbor);
					System.out.print(neighbor.getVertexData()+" ");
				}
				
			}
			System.out.println("");
		}
	}

}
