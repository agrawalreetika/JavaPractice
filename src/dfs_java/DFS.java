package dfs_java;

import bfs_java.BfsOperations;

public class DFS {

	public static void main(String[] args) {
		DfsOperations obj = new DfsOperations(5);
		obj.addEdge(1, 2);
		obj.addEdge(1, 5);
		obj.addEdge(2, 3);
		obj.addEdge(3, 4);
		
		obj.dfstrack(1);
	}

}
