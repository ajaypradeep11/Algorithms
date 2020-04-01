package DepthFirstSearchRecursion;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DFSwithRecursion {

	private Stack<Vertex> stack;
	
	public DFSwithRecursion() {
		this.stack = new Stack<Vertex>();
	}
	
	public void dfs(List<Vertex> vertexList) {
		for(Vertex vertexOneByOne : vertexList) {
			if(!vertexOneByOne.isVisitedNode()) {
				vertexOneByOne.setVisitedNode(true);
				dfswithRecursion(vertexOneByOne);
			}
		}
	}

	
	private void dfswithRecursion(Vertex vertexOneByOne) {
		System.out.print(vertexOneByOne.getVertexData()+" ");
		for(Vertex rootVertex : vertexOneByOne.getAdjacentIndex()) {
			if(!rootVertex.isVisitedNode()) {
				rootVertex.setVisitedNode(true);
				dfswithRecursion(rootVertex);
			}
		}
	}

}
