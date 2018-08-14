package tictoc;

import java.util.Scanner;

//Player 1 gets "0",Player 2 gets "X"
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3,x,y;
		String arr[][]=new String[n][n];
		Boolean flag;
		
		Scanner in=new Scanner(System.in);
		while(true){
			//For Player 1
			System.out.println("Player 1 chance:");
			System.out.println("Enter (x,y) of your choice");
			
			System.out.println("Enter x:");
			x=in.nextInt();
			System.out.println("Enter y:");
			y=in.nextInt();
			
			if(x>n || y>n){
				System.out.println("Invalid choice");
			}
			
			arr[x-1][y-1]="O";
			flag=checkWin(arr,n);
			if(flag){
				System.out.println("Player 1 wins the game!!");
				displayMetrics(arr,n);
				break;
			}
			
			//For Player 2
			System.out.println("Player 2 chance:");
			System.out.println("Enter (x,y) of your choice");
			
			System.out.println("Enter x:");
			x=in.nextInt();
			System.out.println("Enter y:");
			y=in.nextInt();
			
			if(x>n || y>n){
				System.out.println("Invalid choice");
			}
			
			arr[x-1][y-1]="X";
			flag=checkWin(arr,n);
			if(flag){
				System.out.println("Player 2 wins the game!!");
				displayMetrics(arr,n);
				break;
			}
		}
	
	}

	private static void displayMetrics(String[][] metrics,int size) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				System.out.print(metrics[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
	}

	private static boolean checkWin(String[][] metrics,int size) {
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				
			}
		}
		return false;
	}

}
