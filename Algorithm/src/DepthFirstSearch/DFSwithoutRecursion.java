package DepthFirstSearch;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DFSwithoutRecursion {

	private Stack<Vertex> stack;
	
	public DFSwithoutRecursion() {
		this.stack = new Stack<Vertex>();
	}
	
	public void dfs(List<Vertex> vertexList) {
		for(Vertex vertexOneByOne : vertexList) {
			if(!vertexOneByOne.isVisitedNode()) {
				vertexOneByOne.setVisitedNode(true);
				dfswithstack(vertexOneByOne);
			}
		}
	}

	
	public void dfswithstack(Vertex root) {
		this.stack.add(root);
		root.setVisitedNode(true);
		while(!this.stack.isEmpty()) {
			Vertex rootVertex = this.stack.pop();
			System.out.print(rootVertex.getVertexData()+" ");
			for(Vertex VertexOneByOneNeighbor : rootVertex.getAdjacentIndex()) {
				if(!VertexOneByOneNeighbor.isVisitedNode()) {
					VertexOneByOneNeighbor.setVisitedNode(true);
					this.stack.push(VertexOneByOneNeighbor);
				}
			}
		}
	}
}
