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



import java.util.*;
class Demo{
	public static void main(String[]args){
		int[] arr = {2,4,9,1,7,3};
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


import java.util.*;
class Demo{
	public static void main(String[]args){
		int[] arr = {3,5,7,2,6};
		int n = arr.length;

		for(int i = 0; i < n; i++){
			int currentElement = arr[i];
			int left = i-1;

			while(left >= 0 && arr[left] > currentElement){
				arr[left+1] = arr[left];
				left --;
			}
		
			arr[left+1] = currentElement;			
		}
		
		System.out.println(Arrays.toString(arr));	
	}
}



Merge Sort :-



import java.util.*;
class Demo {
    public static void main(String[] args) {
        int arr[] = {8, 3, 5, 2};
        
        f(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        
    }

    static void f(int arr[], int low, int high) {
	
        if(low >= high) {
		return;
	}
        int mid = (low + high) / 2;

           
        f(arr, low, mid);
        f(arr, mid + 1, high);

        merge(arr, low, mid, high);
        
    }

    static void merge(int arr[], int low, int mid, int high) {
        int[] merged = new int[high - low +1]; 

        int blue = low;
        int green = mid +1;
	int red = 0;

        

        while(blue <= mid && green <= high) {
            if(arr[blue] <= arr[green]) {
                merged[red] = arr[blue];
                red++;
		blue++; 
            } 
	    else {
                merged[red] = arr[green];
                red++;
		green++;
            }
            
        }

        
        while(blue <= mid) {
            merged[red] = arr[blue];
            red++;
	    blue++;
        }

        while(green <= high) {
            merged[red] = arr[green];
            red++;
	    green++;
        }

	for(int i = 0; i < merged.length; i++){
		arr[low + i] = merged[i];
	}

    }
}




Quick Sort :-
*/

import java.util.*;

class Demo {
    public static void main(String[] args) {
        int[] arr = {42, 56, 12, 67, 34};

        f(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void f(int[] arr, int low, int high) {
        if (low >= high) return;

        int pivotIndex = pivotfinder(arr, low, high);

        f(arr, low, pivotIndex - 1);
        f(arr, pivotIndex + 1, high);
    }

    static int pivotfinder(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {

            while (i <= high - 1 && arr[i] <= pivot) {
                i++;
            }

            while (j >= low + 1 && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}