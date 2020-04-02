package DepthFirstSearchTopologySort;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopologySort topologySort = new TopologySort();
		Vertex index0 = new Vertex(0);
		Vertex index1 = new Vertex(1);
		Vertex index2 = new Vertex(2);
		Vertex index3 = new Vertex(3);
		Vertex index4 = new Vertex(4);
		Vertex index5 = new Vertex(5);
		List<Vertex> list = new ArrayList<Vertex>();
		index2.addAdjacentIndex(index3);
		index3.addAdjacentIndex(index1);
		index4.addAdjacentIndex(index0);
		index4.addAdjacentIndex(index1);
		index5.addAdjacentIndex(index0);
		index5.addAdjacentIndex(index2);
		list.add(index0);
		list.add(index1);
		list.add(index2);
		list.add(index3);
		list.add(index4);
		list.add(index5);
		for(int i =0;i<list.size();i++) {
				if(!list.get(i).isVisitedNode()) {
					topologySort.dfs(list.get(i));
				}
		}
		Stack<Vertex> stack = topologySort.getStack();
		for(int i =0;i<list.size();i++) {
			Vertex v = stack.pop();
			System.out.print(v.getVertexData()+" ");
		}
		
	}

}
