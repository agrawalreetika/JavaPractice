package bfs_java;

public class BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BfsOperations obj = new BfsOperations(5);
		obj.addEdge(1, 2);
		obj.addEdge(1, 5);
		obj.addEdge(2, 3);
		obj.addEdge(3, 4);
		
		obj.bfstrack(1);
	}

}
