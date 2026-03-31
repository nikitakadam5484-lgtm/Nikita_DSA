/**
Q1. Find First Occurrence
👉 Return index of first occurrence of target
Input: arr = [5,2,3,2,4], target = 2
Output: 1

class Demo{
	public static void main(String[]args){
		int[] arr = {5,2,3,2,4}; 
		int target = 2;
		Demo d = new Demo();
		int occur = d.f(arr,0,target);
		System.out.println(occur);
	}

	int f(int[] arr, int index, int target){
		if(index == arr.length){
			return -1;
		} 
		if(arr[index] == target){
			return index;
		} 
		return f(arr, index+1, target);
	}
}


Q2. Find Last Occurrence
👉 Return index of last occurrence of target
Input: [5,2,3,2,4], target = 2
Output: 3


class Demo{
	public static void main(String[]args){
		int[] arr = {5,2,3,2,4}; 
		int target = 2;
		Demo d = new Demo();
		int occur = d.f(arr,0,target);
		System.out.println(occur);
	}

	int f(int[] arr, int index, int target){
		if(index == arr.length){
			return -1;
		} 

		int right = f(arr, index+1, target);
		
		if(right != -1){
			return right;
		}	
	
		if(arr[index] == target){
			return index;
		} 
		return -1;
	}
}


Q3. Count Occurrences
👉 Count how many times target appears
Input: [1,2,2,3,2], target = 2
Output: 3


class Demo{
	public static void main(String[]args){
		int[] arr = {1,2,2,3,2}; 
		int target = 2;
		Demo d = new Demo();
		int count = d.f(arr,0,target,0);
		System.out.println(count);
	}

	int f(int[] arr, int index, int target, int count){
		if(index == arr.length){
			return count;
		} 	
	
		if(arr[index] == target){
			count ++;
		} 
		return f(arr, index+1, target, count);
	}
}



Q4. Check if Array is Sorted
👉 Return true if sorted in ascending order
Input: [1,2,3,4]
Output: true


class Demo{
	public static void main(String[]args){
		int[] arr = {1,2,3,4}; 
		
		Demo d = new Demo();
		boolean sort = d.f(arr,0);
		System.out.println(sort);
	}

	boolean f(int[] arr, int index){
		if(index == arr.length - 1){
			return true;
		} 	
	
		if(arr[index] > arr[index + 1]){
			return false;
		} 
		return f(arr, index+1);
	}
}


Q5. Check if All Elements are Even
👉 Return true if all elements are even
Input: [2,4,6]
Output: true


class Demo{
	public static void main(String[]args){
		int[] arr = {2,4,6}; 
		
		Demo d = new Demo();
		boolean even = d.f(arr,0);
		System.out.println(even);
	}

	boolean f(int[] arr, int index){
		if(index == arr.length){
			return true;
		} 	
	
		if(arr[index] % 2 != 0){
			return false;
		} 
		return f(arr, index+1);
	}
}


Q6. Check if Any Element is Negative
👉 Return true if at least one negative exists
Input: [1,2,-3,4]
Output: true


class Demo{
	public static void main(String[]args){
		int[] arr = {1,2,-3,4}; 
		
		Demo d = new Demo();
		boolean negative = d.f(arr,0);
		System.out.println(negative);
	}

	boolean f(int[] arr, int index){
		if(index == arr.length){
			return false;
		} 	
	
		if(arr[index] < 0){
			return true;
		} 
		return f(arr, index+1);
	}
}


Q7. Find Maximum Element
👉 Return maximum value in array
Input: [3,9,1,7]
Output: 9


class Demo{
	public static void main(String[]args){
		int[] arr = {3,9,1,7}; 
		
		Demo d = new Demo();
		int max = d.f(arr,0,0);
		System.out.println(max);
	}

	int f(int[] arr, int index, int max){
		if(index == arr.length){
			return max;
		} 	
	
		if(max < arr[index]){
			max = arr[index];
		} 
		return f(arr, index+1, max);
	}
}


Q8. Find Minimum Element
👉 Return minimum value
Input: [3,9,1,7]
Output: 1


class Demo{
	public static void main(String[]args){
		int[] arr = {3,9,1,7}; 
		
		Demo d = new Demo();
		int min = d.f(arr,1,arr[0]);
		System.out.println(min);
	}

	int f(int[] arr, int index, int min){
		if(index == arr.length){
			return min;
		} 	
	
		if(min > arr[index]){
			min = arr[index];
		} 
		return f(arr, index+1, min);
	}
}


Q9. Sum of Elements at Odd Index
👉 Return sum of elements at index 1,3,5...
Input: [10,20,30,40,50]
Output: 20 + 40 = 60


class Demo{
	public static void main(String[]args){
		int[] arr = {10,20,30,40,50}; 
		
		Demo d = new Demo();
		int sum = d.f(arr,0,0);
		System.out.println(sum);
	}

	int f(int[] arr, int index, int sum){
		if(index == arr.length){
			return sum;
		} 	
	
		if(index % 2 != 0){
			sum = sum + arr[index];
		} 
		return f(arr, index+1, sum);
	}
}

Q10. Check Palindrome Array
👉 Return true if array is palindrome
Input: [1,2,3,2,1]
Output: true


class Demo{
	public static void main(String[]args){
		int[] arr = {1,2,3,2,1}; 
		
		Demo d = new Demo();
		boolean palindrome = d.f(arr,0,arr.length-1);
		System.out.println(palindrome);
	}

	boolean f(int[] arr, int index, int palindrome){
		if(index == arr.length){
			return true;
		} 	
	
		if(arr[index] != arr[palindrome]){
			return false;		
		} 
		palindrome --;
		return f(arr, index+1, palindrome);
	}
}

Q13. Count Elements Greater Than X
👉 Return count of elements greater than given value
Input: arr = [1,5,3,7,2], x = 3
Output: 2


class Demo{
	public static void main(String[]args){
		int[] arr = {1,5,3,7,2}; 
		int target = 3;
		Demo d = new Demo();
		int count = d.f(arr,0,0,target);
		System.out.println(count);
	}

	int f(int[] arr, int index, int count, int target){
		if(index == arr.length){
			return count;
		} 	
	
		if(arr[index] > target){
			count ++;		
		} 
		
		return f(arr, index+1, count, target);
	}
}


Q14. Check if Array Contains Target
👉 Return true if target exists
Input: [1,2,3,4], target = 3
Output: true


class Demo{
	public static void main(String[]args){
		int[] arr = {1,2,3,4}; 
		int target = 3;
		Demo d = new Demo();
		boolean contain = d.f(arr,0,target);
		System.out.println(contain);
	}

	boolean f(int[] arr, int index, int target){
		if(index == arr.length){
			return false;
		} 	
	
		if(arr[index] == target){
			return true;		
		} 
		
		return f(arr, index+1, target);
	}
}

Q15. Find Sum of All Negative Numbers
👉 Return sum of all negative elements
Input: [1,-2,3,-4,5]
Output: -6


class Demo{
	public static void main(String[]args){
		int[] arr = {1,-2,3,-4,5}; 
		
		Demo d = new Demo();
		int sum = d.f(arr,0,0);
		System.out.println(sum);
	}

	int f(int[] arr, int index, int sum){
		if(index == arr.length){
			return sum;
		} 	
	
		if(arr[index] < 0){
			sum = sum + arr[index];		
		} 
		
		return f(arr, index+1, sum);
	}
}


Q16. Find Index of Smallest Element
👉 Return index of minimum element
Input: [5,2,8,1,3]
Output: 3


class Demo{
	public static void main(String[]args){
		int[] arr = {5,2,8,1,3}; 
		
		Demo d = new Demo();
		int index = d.f(arr,0,arr[0]);
		System.out.println(index);
	}

	int f(int[] arr, int index, int min){
		if(index == arr.length){
			return -1;
		} 	
	
		if(min > arr[index]){
			min = arr[index];
			return index;		
		} 
		
		return f(arr, index+1, min);
	}
}


Q17. Count Elements Divisible by K
👉 Return count of elements divisible by k
Input: [2,4,5,6,9], k = 2
Output: 3


class Demo{
	public static void main(String[]args){
		int[] arr = {2,4,5,6,9}; 
		int k = 2;
		Demo d = new Demo();
		int count = d.f(arr,0,k,0);
		System.out.println(count);
	}

	int f(int[] arr, int index, int k, int count){
		if(index == arr.length){
			return count;
		} 	
	
		if(arr[index] % k == 0){
			count ++;		
		} 
		
		return f(arr, index+1, k, count);
	}
}


Q18. Check if All Elements are Unique
👉 Return true if no duplicates exist
Input: [1,2,3,4]
Output: true

class Demo{
	public static void main(String[]args){
		int[] arr = {1,2,3,4}; 
		
		Demo d = new Demo();
		boolean unique = d.f(arr,0);
		System.out.println(unique);
	}

	boolean f(int[] arr, int index){
		if(index == arr.length-1){
			return false;
		} 	
	
		if(arr[index] != arr[index+1]){
			return true;		
		} 
		
		return f(arr, index+1);
	}
}


Q19. Find Sum of Digits of All Elements
👉 Each element is a number → sum all digits recursively
Input: [12, 34, 5]


class Demo{
	public static void main(String[]args){
		int[] arr = {12, 34, 5}; 
		
		Demo d = new Demo();
		int sum = d.f(arr,0,0);
		System.out.println(sum);
	}

	int f(int[] arr, int index, int sum){
		if(index == arr.length){
			return sum;
		} 	
	
		while(arr[index] > 0){
			int rem = arr[index] % 10;
			sum = sum + rem;
			arr[index] = arr[index] / 10;
		}
		
		return f(arr, index+1, sum);
	}
}
*/

