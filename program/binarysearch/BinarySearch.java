package program.binarysearch;

public class BinarySearch {
	 public static  void main(String[] args){

	        int[] arr = {6,18,23,45,52,60,63,77,88,95,97,99};
	        int key = 45;
	        int arrlength = (arr.length-1); 
	        binarySearch(arr,0,key,arrlength);
	    }

	public static void binarySearch(int[] arr, int start, int key, int length){

	        int midValue = (start+length)/2;       
	        while(start<=length){

	            if(arr[midValue]<key){
	                start = midValue + 1;
	            } else if(arr[midValue]==key){
	                System.out.println("Element is found at index :"+midValue);
	                break;
	            }else {

	                length=midValue-1;
	            }
	            midValue = (start+length)/2;
	        }
	            if(start>length){

	                System.out.println("Element is not found");
	            }      
	    }
}
