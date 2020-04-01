package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFSwithoutRecursion dfs = new DFSwithoutRecursion();
		Vertex index1 = new Vertex(1);
		Vertex index2 = new Vertex(2);
		Vertex index3 = new Vertex(3);
		Vertex index4 = new Vertex(4);
		List<Vertex> list = new ArrayList<Vertex>();
		index1.addAdjacentIndex(index2);
		index1.addAdjacentIndex(index3);
		index2.addAdjacentIndex(index4);
		list.add(index1);
		list.add(index2);
		list.add(index3);
		list.add(index4);
		dfs.dfs(list);
	}

}
