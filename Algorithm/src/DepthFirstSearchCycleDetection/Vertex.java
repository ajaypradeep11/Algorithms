package DepthFirstSearchCycleDetection;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private int vertexData;
	private boolean isBeingVisitedNode;
	private boolean visitedNode;
	public boolean isBeingVisitedNode() {
		return isBeingVisitedNode;
	}

	public void setBeingVisitedNode(boolean isBeingVisitedNode) {
		this.isBeingVisitedNode = isBeingVisitedNode;
	}
	private List<Vertex> adjacentIndex = new ArrayList<Vertex>();
	
	public Vertex(int vertexData) {
		this.vertexData = vertexData;
	}
	
	public int getVertexData() {
		return vertexData;
	}
	public void setVertexData(int vertexData) {
		this.vertexData = vertexData;
	}
	public boolean isVisitedNode() {
		return visitedNode;
	}
	public void setVisitedNode(boolean visitedNode) {
		this.visitedNode = visitedNode;
	}
	public List<Vertex> getAdjacentIndex() {
		return adjacentIndex;
	}
	public void setAdjacentIndex(List<Vertex> adjacentIndex) {
		this.adjacentIndex = adjacentIndex;
	}
	public void addAdjacentIndex(Vertex v) {
		this.adjacentIndex.add(v);
	}
}
