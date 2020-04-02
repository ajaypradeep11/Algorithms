package DepthFirstSearchCycleDetection;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class CycleDetection {

	private Stack<Vertex> stack;
	
	public CycleDetection() {
		this.stack = new Stack<Vertex>();
	}
	
	
	public void dfs(List<Vertex> vertexOneByOne) {
		for(Vertex rootVertex : vertexOneByOne) {
			if(!rootVertex.isVisitedNode()) {
				dfsCycle(rootVertex);
			}
		}
		
	}
	
	private void dfsCycle(Vertex rootVertex) {
		// TODO Auto-generated method stub
		System.out.println("Inside DFS Vertex :" + rootVertex.getVertexData());
		rootVertex.setBeingVisitedNode(true);
		for(Vertex child : rootVertex.getAdjacentIndex()) {
			System.out.println("Visiting Neighbour Cycle :" + child.getVertexData());
			if(child.isBeingVisitedNode()) {
				System.out.println("Cycle found");
				break;
			}
			if(!child.isVisitedNode()) {
				System.out.println("Visiting Neighbour Cycle recursively :" + child.getVertexData());
				child.setVisitedNode(true);
				dfsCycle(child);
			}
		}
		
		System.out.println("Setting root vertex false :" + rootVertex.getVertexData());
		rootVertex.setBeingVisitedNode(false);
		rootVertex.setVisitedNode(true);	
	}

	public Stack<Vertex> getStack(){
		return this.stack;
	}

}
