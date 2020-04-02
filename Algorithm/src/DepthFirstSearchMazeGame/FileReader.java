package DepthFirstSearchMazeGame;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
	
	private int[][] map;
	private String fileName;
	private int numberofRows;
	private int numberofCols;
	private int startPos;
	private int endPos;
	
	
	public FileReader(String fileName,int numberofRows,int numberofCols) {
		this.fileName = fileName;
		this.numberofCols = numberofCols;
		this.numberofRows = numberofRows;
		this.map = new int[numberofRows][numberofCols];
		
	}
	
	public void parseFile() {
		try {
			Scanner scanner = new Scanner(new File(this.fileName));
			for(int i=0;i<this.numberofRows;i++) {
				for(int j=0;j<this.numberofCols;j++) {
					map[i][j] = scanner.nextInt();
					if(map[i][j] == 2) {
						startPos =i;
						endPos = j;
					}
				}	
			}
			scanner.close();
		} catch(Exception e) {
			
		}
	}

	public int[][] getMap() {
		// TODO Auto-generated method stub
		return map;
	}

	public int getStartRow() {
		// TODO Auto-generated method stub
		return startPos;
	}
	
	public int getStartCol() {
		// TODO Auto-generated method stub
		return endPos;
	}

}
