package DepthFirstSearchMazeGame;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MazeSolver {

	private int[][] map;
	private int startRow;
	private boolean[][] visited;
	private int startCol;
	public MazeSolver(int[][] map, int startRow, int startCol) {
		this.startRow = startRow;
		this.startCol = startCol;
		this.map = map;
		this.visited= new boolean[map.length][map.length];
	}
	
	public void solveMaze() {
		try {
			getMazeAnswer(startRow,startCol);
			System.out.println("No Path found");
		}catch (Exception e) {
			System.out.println("Got The End point");			
		}
		
	}
	
	public void getMazeAnswer(int startRow, int startCol) {
		System.out.println("row "+startRow+" col "+startCol);
		if(map[startRow][startCol] == 3) {
			throw new RuntimeException();
		}
		int endofMap = this.map.length;
		if(visited[startRow][startCol]) {
			return;
		}else if((startRow < 0 ) || (startRow >= endofMap)) {
			return;
		}else if((startCol < 0 ) || (startCol >= endofMap)) {
			return;
		}else if(map[startRow][startCol] == 1) {
			return;
		}else {
			this.visited[startRow][startCol] = true;
			getMazeAnswer(startRow+1,startCol);  //move down
			getMazeAnswer(startRow,startCol+1);  //move right
			getMazeAnswer(startRow,startCol-1);  //move left
			getMazeAnswer(startRow-1,startCol);  //move up
		}
			
	}

}
