package blackbuck;

public class Blackbuck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp [] ={1,2,2,3,4};
		checkArray(temp,5);
	}
	public static void checkArray(int [] arr,int n){
	    int mid=n/2;            //mid = 4
	    int num=arr[mid];        // num = 1
	    int left,right;
	    left=mid/2;            // left = 2
	    right=mid+(mid/2);     // right = 6
	    
	    int rightnew,leftnew;
	        
	    while(true){
	       
	        if(arr[left]!=num && arr[right]!=num){
	            System.out.println("Not exist");
	            break;
	        }
	        
	        if(arr[left]==arr[right]){
	            if((right-left+1)>n/2){
	                System.out.println("Number is:"+num);
	                break;
	            }
	            else{
	                System.out.println("Not exist");
	                break;
	            }
	        }
	        
	        if(arr[left]!=num){  
	            right=right+(n-right)/2;
	            leftnew=left+(mid-left)/2;
	            mid=left;
	            if(leftnew==left){
	                System.out.println("Not exist");
	                break;
	            }
	            left=leftnew;
	        }
	        
	        if(arr[right]!=num){
	            left=left/2;               
	            rightnew=mid+(right-mid)/2;      //rightNew = 5
	            mid=left+(rightnew-left)/2;                       //mid = 2+1=3
	               
	            if(rightnew==right){
	                System.out.println("Not exist");
	                break;
	            }
	            right=rightnew;     
	        }
	        
	        
	    }
	}

}
