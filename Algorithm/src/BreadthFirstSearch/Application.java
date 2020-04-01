package BreadthFirstSearch;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFS bfs = new BFS();
		Vertex index1 = new Vertex(1);
		Vertex index2 = new Vertex(2);
		Vertex index3 = new Vertex(3);
		Vertex index4 = new Vertex(4);
		index1.addAdjacentIndex(index2);
		index1.addAdjacentIndex(index3);
		index2.addAdjacentIndex(index4);
		bfs.bfs(index1);
	}

}
