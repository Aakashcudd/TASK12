package COLLECTIONS;

	import java.util.Map;
	import java.util.TreeMap;

	public class TreeMapExample {
	    public static void main(String[] args) {
	        // Create a TreeMap to store employee IDs and names
	        Map<Integer, String> employeeMap = new TreeMap<>();

	        // Add employee ID and name pairs to the TreeMap
	        employeeMap.put(101, "AAKASH");
	        employeeMap.put(102, "BALA");
	        employeeMap.put(103, "CHANDRU");
	        employeeMap.put(104, "DINESH");
	        employeeMap.put(105, "VIVEK");

	        // Print the names of all employees in alphabetical order
	        System.out.println("Names of all employees in alphabetical order:");
	        for (String name : employeeMap.values()) {
	            System.out.println(name);
	        }
	    }
	}

