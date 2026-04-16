/**
Q1. Second Highest Frequency Element
Find element with second maximum frequency
Example:
[1,2,2,3,3,3,4,4]
→ Output: 2 or 4

For Loop Approach :-

class Demo{
	public static void main(String[]args){

		int[] arr = {1,2,2,3,3,3,4,4}; 
		int max = 0;
		int secMax = 0;

		for(int i = 0; i < arr.length; i++){

			int count = 0;

			for(int j = 0; j < arr.length; j++){
				if(arr[i] == arr[j]){
					count ++;								
				}
			} 

			if(count > max){
				secMax = max;
				max = count;
			}
			else if (count > secMax && count < max){
				secMax = count;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
            		int count = 0;

            		for(int j = 0; j < arr.length; j++) {
                		if(arr[i] == arr[j]) {
                    			count++;
                		}
            		}

            		if(count == secMax) {
                		System.out.println(arr[i]);	
            		}
       		 }
	}
}

Frequency Approach :-

class Demo {
    public static void main(String[] args) {

        int[] arr = {1,2,2,3,3,3,4,4}; 
        int max = 0;

        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        int[] freq = new int[max + 1];

      
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        
        int fmax = 0, secMax = 0;

        
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > fmax){
                secMax = fmax;
                fmax = freq[i];
            }
            else if(freq[i] > secMax && freq[i] < fmax){
                secMax = freq[i];
            }
        }

    
        for(int i = 0; i < freq.length; i++){
            if(freq[i] == secMax){
                System.out.println(i);
            }
        }
    }
}


HashMap Approach :-


import java.util.HashMap;
class Demo{
	public static void main(String[]args){
		
		int[] arr = {1,2,2,3,3,3,4,4}; 
		

		HashMap<Integer,Integer> hm = new HashMap<>();

		for(int i = 0; i < arr.length; i++){
			if(hm.containsKey(arr[i])){
				hm.put(arr[i], hm.getOrDefault(arr[i],1)+1);
			}
			else{
				hm.put(arr[i],1);
			}
		}
		int max = 0;
		int secMax = 0;
		for(int key : hm.keySet()){
			if(hm.get(key) > max){
				secMax = max;
				max = hm.get(key);
			}
		}
		System.out.println(secMax);
	}
}


Q2. Frequency Greater Than K
Print all elements whose frequency is greater than K
Example:
arr = [1,1,2,2,2,3], K = 2
→ Output: 2

For Loop Approach :-

class Demo{
	public static void main(String[]args){

		int[] arr = {1,1,2,2,2,3}; 
		int k = 2;

		for(int i = 0; i < arr.length; i++){

			int count = 0;

			for(int j = 0; j < arr.length; j++){
				if(arr[i] == arr[j]){
					count ++;								
				}
			} 

			if(count > k){
				System.out.println(arr[i]);
			}

		} 
	}
}

Frequency Approach :-

class Demo{
	public static void main(String[]args){

		int[] arr = {1,1,2,2,2,3}; 
		int max = 0;
		int k = 2;

		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		int[] freq = new int [max+1];

		for(int i = 0; i < arr.length; i++){
			freq[arr[i]] ++;
		}
		
		for(int i = 0; i < freq.length; i++){
			if(freq[i] > k){
				System.out.println(i);
			}
		}	
	}
}


HashMap Approach :-

import java.util.HashMap;
class Demo{
	public static void main(String[]args){
		
		int[] arr = {1,1,2,2,2,3}; 
		int k = 2;

		HashMap<Integer,Integer> hm = new HashMap<>();

		for(int i = 0; i < arr.length; i++){
			if(hm.containsKey(arr[i])){
				hm.put(arr[i], hm.getOrDefault(arr[i],1)+1);
			}
			else{
				hm.put(arr[i],1);
			}
		}

		for(int key : hm.keySet()){
			if(hm.get(key) > k){
				System.out.println(key);
			}
		}
	}
}


Q3. Exactly K Frequency Elements
Print elements that appear exactly K times
Example:
arr = [1,1,2,2,2,3], K = 2
→ Output: 1


For Loop Approach :-

class Demo{
	public static void main(String[]args){

		int[] arr = {1,1,2,2,2,3}; 
		int k = 2;

		for(int i = 0; i < arr.length; i++){

			int count = 0;

			for(int j = 0; j < arr.length; j++){
				if(arr[i] == arr[j]){
					count ++;								
				}
			} 

			if(count == k){
				System.out.println(arr[i]);
			}

		} 
	}
}


Frequency Approach :-

class Demo{
	public static void main(String[]args){

		int[] arr = {1,1,2,2,2,3}; 
		int max = 0;
		int k = 2;

		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		int[] freq = new int [max+1];

		for(int i = 0; i < arr.length; i++){
			freq[arr[i]] ++;
		}
		
		for(int i = 0; i < freq.length; i++){
			if(freq[i] == k){
				System.out.println(i);
			}
		}	
	}
}


HashMap Approach :-

import java.util.HashMap;
class Demo{
	public static void main(String[]args){
		
		int[] arr = {1,1,2,2,2,3}; 
		int k = 2;

		HashMap<Integer,Integer> hm = new HashMap<>();

		for(int i = 0; i < arr.length; i++){
			if(hm.containsKey(arr[i])){
				hm.put(arr[i], hm.getOrDefault(arr[i],1)+1);
			}
			else{
				hm.put(arr[i],1);
			}
		}

		for(int key : hm.keySet()){
			if(hm.get(key) == k){
				System.out.println(key);
			}
		}
	}
}


Q4. Elements Appearing Only Once
Print all unique (non-repeating) elements
Example:
arr = [1,1,2,2,2,3]
→ Output: 3


For Loop Approach :-

class Demo{
	public static void main(String[]args){

		int[] arr = {1,1,2,2,2,3}; 

		for(int i = 0; i < arr.length; i++){

			int count = 0;

			for(int j = 0; j < arr.length; j++){
				if(arr[i] == arr[j]){
					count ++;								
				}
			} 

			if(count == 1){
				System.out.println(arr[i]);
			}

		} 
	}
}


Frequency Approach :-

class Demo{
	public static void main(String[]args){

		int[] arr = {1,1,2,2,2,3}; 
		int max = 0;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		int[] freq = new int [max+1];

		for(int i = 0; i < arr.length; i++){
			freq[arr[i]] ++;
		}
		
		for(int i = 0; i < freq.length; i++){
			if(freq[i] == 1){
				System.out.println(i);
			}
		}	
	}
}


HashMap Approach :-

import java.util.HashMap;
class Demo{
	public static void main(String[]args){
		
		int[] arr = {1,1,2,2,2,3}; 

		HashMap<Integer,Integer> hm = new HashMap<>();

		for(int i = 0; i < arr.length; i++){
			if(hm.containsKey(arr[i])){
				hm.put(arr[i], hm.getOrDefault(arr[i],1)+1);
			}
			else{
				hm.put(arr[i],1);
			}
		}

		for(int key : hm.keySet()){
			if(hm.get(key) == 1){
				System.out.println(key);
			}
		}
	}
}


Q5. Remove Duplicates from Array
Return array with only distinct elements
Example:
arr = [1,2,2,2,3]
→ Output: [1,3]


For Loop Approach :-

import java.util.*;
class Demo {
    public static void main(String[] args) {

        int[] arr = {1,2,2,2,3};
        int unique = 0; 

        for(int i = 0; i < arr.length; i++){
            int count = 0;

            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            } 

            if(count == 1){
                unique++;
            }
        } 

        int[] freq = new int[unique];
        int index = 0;

        for(int i = 0; i < arr.length; i++){

            int count = 0;

            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            } 

            if(count == 1){
                freq[index] = arr[i];
                index++;
            }
        } 
        
        System.out.println(Arrays.toString(freq));
    }
}

Frequency Approach :-

import java.util.*;
class Demo{
	public static void main(String[]args){

		int[] arr = {1,2,2,2,3}; 
		int max = 0;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		int[] freq = new int [max+1];

		for(int i = 0; i < arr.length; i++){
			freq[arr[i]] ++;
		}
		int count = 0;
		for(int i = 0; i < freq.length; i++){
			if(freq[i] == 1){
				count ++;
			}
		}
		int[] unique = new int [count];
		int index =0;
		for(int i = 0; i < freq.length; i++){
			if(freq[i] == 1){
				unique[index] = i;	
				index ++;
			}
		}
		System.out.println(Arrays.toString(unique));	
	}
}


HashMap Approach :-


import java.util.HashMap;
class Demo{
	public static void main(String[]args){
		
		int[] arr = {1,2,2,2,3}; 
		
		HashMap<Integer,Integer> hm = new HashMap<>();

		for(int i = 0; i < arr.length; i++){
			if(hm.containsKey(arr[i])){
				hm.put(arr[i], hm.getOrDefault(arr[i],1)+1);
			}
			else{
				hm.put(arr[i],1);
			}
		}

		for(int key : hm.keySet()){
			if(hm.get(key) == 1){
				System.out.print(key +" ");
			}
		}
	}
}

Q6. Most Frequent Character in String
Return most frequent character in the string
Example:
String str = “apple”
→ Output: ‘a’

class Demo {
    public static void main(String[] args) {
        String str = "apple";

        int max = 0;
        char ch =  ' ';

        for(int i = 0; i < str.length(); i++) {
            int count = 0;

            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if(count > max) {
                max = count;
                ch = str.charAt(i);
            }
        }

        System.out.println(ch);
    }
}


HashMap Approach :-

*/

import java.util.HashMap;
class Demo{
	public static void main(String[]args){
		
		String str = "apple"; 
		
		HashMap<String,Integer> hm = new HashMap<>();

		for(int i = 0; i < str.length; i++){
			if(hm.containsKey(str.charAt(i))){
				hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i),1)+1);
			}
			else{
				hm.put(str.charAt(i),1);
			}
		}

		for(int key : hm.keySet()){
			if(hm.get(key) == 1){
				System.out.print(key +" ");
			}
		}
	}
}

