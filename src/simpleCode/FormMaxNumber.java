package simpleCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FormMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={3, 30, 34, 5, 9 };
		
		/*
		 * This method fails for {3, 30, 34, 5, 9} input because of 10 and 3 position.
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<arr.length;i++){
			al.add(Integer.toString(arr[i]));
		}
		
		System.out.println("Before::"+al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("After::"+al);
		*/
		
		//Method 2
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<arr.length;i++){
			al.add(Integer.toString(arr[i]));
		}
		System.out.println("Before::"+al);
		Collections.sort(al,new Comparator<String>(){

			@Override
			public int compare(String x, String y) {
				// TODO Auto-generated method stub
				String xy=x+y;
				String yx=y+x;
				
				return xy.compareTo(yx)<0 ? 1 : -1;
			}
		});
		System.out.println("After::"+al);
		
	}

}