package DepthFirstSearchCycleDetection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CycleDetection cycleDetection = new CycleDetection();
		Vertex index1 = new Vertex(1);
		Vertex index2 = new Vertex(2);
		Vertex index3 = new Vertex(3);
		Vertex index4 = new Vertex(4);
		Vertex index5 = new Vertex(5);
		Vertex index6 = new Vertex(6);
		List<Vertex> list = new ArrayList<Vertex>();
		index1.addAdjacentIndex(index2);
		index1.addAdjacentIndex(index3);
		index2.addAdjacentIndex(index3);
		index4.addAdjacentIndex(index1);
		index4.addAdjacentIndex(index5);
		index5.addAdjacentIndex(index6);
		index6.addAdjacentIndex(index4);
		list.add(index1);
		list.add(index2);
		list.add(index3);
		list.add(index4);
		list.add(index5);
		list.add(index6);
		cycleDetection.dfs(list);
		Stack<Vertex> stack = cycleDetection.getStack();
		for(int i =0;i<stack.size();i++) {
			Vertex v = stack.pop();
			System.out.print(v.getVertexData()+" ");
		}
	}
}
