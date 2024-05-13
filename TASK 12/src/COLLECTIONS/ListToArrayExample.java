package COLLECTIONS;

	import java.util.ArrayList;
	import java.util.List;

	public class ListToArrayExample {
	    public static void main(String[] args) {
	        // Create a List of integers
	        List<Integer> list = new ArrayList<>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);

	        // Convert List to an array of integers
	        Integer[] array = list.toArray(new Integer[0]);

	        // Print the elements of the array
	        System.out.println("Array elements:");
	        for (Integer num : array) {
	            System.out.println(num);
	        }
	    }
	}

