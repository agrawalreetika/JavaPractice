package bfs_java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsOperations {
	int[][] mat;
	int vertex;
	
	BfsOperations(int v){
		vertex = v;
		mat = new int[vertex+1][vertex+1];
		for(int i=0;i<=vertex;i++){
			for(int j=0;j<=vertex;j++){
				mat[i][j]=0;
			}
		}
	}
	
	public void addEdge(int v1,int v2){
		mat[v1][v2]=1;
		mat[v2][v1]=1;
	}
	
	public void bfstrack(int start){
		Queue<Integer> q = new LinkedList<>();
		ArrayList<Integer> visited = new ArrayList<>();
		
		q.add(start);
		
		while(q.peek()!=null){
			int num = q.poll();
			
			if(visited.contains(num)){
				continue;
			}
			else{
				System.out.print(num+"->");
				visited.add(num);
			}
			
			for(int i=1;i<vertex;i++){
				if(mat[num][i]==1){
					q.add(i);
				}
			}
		}
	}
}
