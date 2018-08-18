 package dfs_java;

import bfs_java.BfsOperations;

public class DFS {

	public static void main(String[] args) {
		DfsOperations obj = new DfsOperations(4);
		obj.addEdge(0, 1);
	    obj.addEdge(0, 2);
	    obj.addEdge(1, 2);
	    obj.addEdge(2, 0);
	    obj.addEdge(2, 3);
	    obj.addEdge(3, 3);
		
		obj.dfstrack(2);
	}

}
