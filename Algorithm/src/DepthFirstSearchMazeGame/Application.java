package DepthFirstSearchMazeGame;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("src/DepthFirstSearchMazeGame/Map.txt",6,8);
		fr.parseFile();
		MazeSolver maze = new MazeSolver(fr.getMap(),fr.getStartRow(),fr.getStartCol());
		maze.solveMaze();
		
	}

}
