/**

Selection Sort :-	

class Demo{
	public static void main(String[]args){
		int[] arr = {7,3,5,2,6};
		int n = arr.length;

		for(int i = 0; i < n-1; i++){

		int minIndex = i;

			for(int j = i+1; j < n; j++){
	
				if(arr[j] < arr[minIndex]){
					minIndex = j;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;	
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] +" ");
		}
	}
}


class Demo{
	public static void main(String[]args){
		int[] arr = {13,44,27,57,29,7};
		int n = arr.length;

		for(int i = 0; i < n-1; i++){

		int minIndex = i;

			for(int j = i+1; j < n; j++){
	
				if(arr[j] < arr[minIndex]){
					minIndex = j;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;	
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] +" ");
		}
	}
}

Bubble Sort :-
*/

import java.util.*;
class Demo{
	public static void main(String[]args){
		int[] arr = {13,44,27,57,29,7};
		int n = arr.length;

		for(int i = 0; i < n-1; i++){
			for(int j = 0; j < n-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}			
		}
		System.out.println(Arrays.toString(arr));	
	}
}

