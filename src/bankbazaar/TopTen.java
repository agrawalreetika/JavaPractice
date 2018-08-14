package bankbazaar;

import java.util.Scanner;

public class TopTen{
    static int capacity=10;
    static int array[]=new int[capacity];
    static int count=0;
   
    public static void display(){
       System.out.println("Top element present-Max will be 10 numbers");
       for(int i=0;i<count;i++){
           System.out.println(array[i]);
       }
    }
    
    public static void swap(int i1,int i2){
        int temp=array[i1];
        array[i1]=array[i2];
        array[i2]=temp;
    }
    
    public static void heapify(int index){
        int parentIndex=(index-1)/2;
        //System.out.println("parentIndex::"+parentIndex);
        if(array[parentIndex]<array[index]){
            swap(index,parentIndex);
            heapify(parentIndex);
        }
    }
    
    public static void insertHeap(int num){
        if(count==0){
        	//System.out.println("In 1::"+count);
        	count++;
            array[0]=num;
        }
        else if(count==10){
            if(array[9]<num){
            	//System.out.println("In 2::"+count);
                array[9]=num;
                /*heapify*/
                heapify(9);
            }
        }
        else{
        	//System.out.println("In 3::"+count);
            int size=array.length;
            array[count]=num;
            /*hapify*/
            //System.out.println("In 3::"+count);
            heapify(count);
            count++;
        }
    }
    
    public static void main(String [] args){
    	/*
    	for(int i=0;i<capacity;i++){
    	    	array[i]=-1;
    	}
    	*/
    	while(true){
    		System.out.println("Enter a number to Insert into List:");
    		Scanner in=new Scanner(System.in);
    		int input=in.nextInt();
    		insertHeap(input);
    		display();
    	}
    }
}

