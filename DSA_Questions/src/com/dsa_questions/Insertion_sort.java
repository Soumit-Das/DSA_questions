package com.dsa_questions;

public class Insertion_sort {

	public static void main(String[] args) {
		
		int[] arr = {10,9,8,7,6,5,4,3,2,1};
		
		int n = arr.length;
		
		for(int i=1;i<n;i++){
			 
	         for(int j=i;j>0;j--){
	            
	            if(arr[j] < arr[j-1]){
	                int temp = arr[j];
	                arr[j] = arr[j-1];
	                arr[j-1] = temp;
	            }else{
	                break;
	            }
	             
	         }
	         
	     }
		
		for(int i = 0;i<n;i++) {
			
			System.out.print(arr[i]+" ");
			
		}
		
	}
	
}
