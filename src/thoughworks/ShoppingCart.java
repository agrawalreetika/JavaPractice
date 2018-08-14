package thoughworks;

import java.util.*;

public class ShoppingCart {
	
	int[] m1price={15,60,40};
	int[] m2price={10,62,41};
	 
	static int total_item=3;
	
	static String items[]={"Bread","Sugar","Rice"};
	static int total_s1[]=new int[total_item];
	static int total_s2[]=new int[total_item];
	
	int final_total_s1=0;
	int final_total_s2=0;
	
	int servicetax_s1=0;
	int servicetax_s2=0;
	
	public void supermarket1(int s1b,int s1r,int s1s){
		
		total_s1[0]=s1b*m1price[0]+((s1b*m1price[0]*servicetax_s1)/100);
		total_s1[1]=s1r*m1price[1]+((s1r*m1price[1]*servicetax_s1)/100);
	    total_s1[2]=s1s*m1price[2]+((s1s*m1price[2]*servicetax_s1)/100);
	}
	public void supermarket2(int s2b,int s2r,int s2s){
		total_s2[0]=s2b*m2price[0]+((s2b*m2price[0]*servicetax_s2)/100);
		total_s2[1]=s2r*m2price[1]+((s2r*m2price[1]*servicetax_s2)/100);
	    total_s2[2]=s2s*m2price[2]+((s2s*m2price[2]*servicetax_s2)/100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bread,rice,sugar;
		
		System.out.println("Enter Count of Items in your shopping cart::");
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter number of bread you want to buy::");
		bread=in.nextInt();
		
		System.out.println("Enter number of Rice you want to buy::");
		rice=in.nextInt();
		
		System.out.println("Enter number of Sugar you want to buy::");
		sugar=in.nextInt();
		
		ShoppingCart obj=new ShoppingCart();
		obj.supermarket1(bread,rice,sugar);
		obj.supermarket2(bread,rice,sugar);
		
		System.out.println("\nFor Cheapest Shopping Please Buy product from below Supermarket");
		
		for(int i=0;i<total_item;i++){
			System.out.print(items[i]+" From::");
			
			if(total_s2[i]<total_s1[i]){
				System.out.println("Supermarket 2");
			}
			else{
				System.out.println("Supermarket 1");
			}
			
		}
		
		System.out.print("\nTotal cost of products if you buy all from Supermarket1 will be::");
		for(int j=0;j<total_item;j++){
			obj.final_total_s1=obj.final_total_s1+total_s1[j];
		}
		System.out.println(obj.final_total_s1);
		
		System.out.print("\nTotal cost of products if you buy all from Supermarket2 will be::");
		for(int k=0;k<total_item;k++){
			obj.final_total_s2=obj.final_total_s2+total_s2[k];
		}
		System.out.println(obj.final_total_s2);
	}

}
