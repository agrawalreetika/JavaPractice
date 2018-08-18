package dfs_java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DfsOperations {
	int[][] mat;
	int vertex;

	DfsOperations(int v) {
		vertex = v;
		mat = new int[vertex][vertex];
		for (int i = 0; i < vertex; i++) {
			for (int j = 0; j < vertex; j++) {
				mat[i][j] = 0;
			}
		}
	}

	public void addEdge(int v1, int v2) {
		mat[v1][v2] = 1;
	}

	public void dfstrack(int start) {
		// print matrix
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}

		Stack<Integer> stk = new Stack<>();
		ArrayList<Integer> visited = new ArrayList<>();

		stk.push(start);
		visited.add(start);
		System.out.print(start + "->");
		int flag=-1;
		
		while (!stk.empty()) {
			int num = stk.peek();

			flag=-1;
			for (int i = 0; i < vertex; i++) {
				if (mat[num][i] == 1 && !visited.contains(i)) {
					//System.out.println("pushing:: " + i);
					stk.push(i);
					visited.add(i);
					System.out.print(i + "->");
					flag=0;
					break;
				}
			}
			if(flag==-1){
				stk.pop();
			}
		}
	}
}
