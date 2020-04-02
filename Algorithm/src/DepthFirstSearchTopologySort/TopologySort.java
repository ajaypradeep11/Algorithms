package DepthFirstSearchTopologySort;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class TopologySort {

	private Stack<Vertex> stack;
	
	public TopologySort() {
		this.stack = new Stack<Vertex>();
	}
	
	
	public void dfs(Vertex vertexOneByOne) {
//		System.out.print(vertexOneByOne.getVertexData()+" ");
		vertexOneByOne.setVisitedNode(true);
		for(Vertex rootVertex : vertexOneByOne.getAdjacentIndex()) {
			if(!rootVertex.isVisitedNode()) {
				//rootVertex.setVisitedNode(true);
				dfs(rootVertex);
			}
		}
		stack.push(vertexOneByOne);
	}
	
	public Stack<Vertex> getStack(){
		return this.stack;
	}

}
