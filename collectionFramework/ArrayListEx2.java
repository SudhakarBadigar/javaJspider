package collectionFramework;

import java.util.ArrayList;

public class ArrayListEx2 {

	    public static void main(String[] args) {
	        ArrayList<Integer> list = new ArrayList<>();

	        System.out.println("Initial Capacity: " + getCapacity(list));  // Output: Initial Capacity: 10

	        for (int i = 0; i < 15; i++) {
	            list.add(i);
	        }

	        System.out.println("Size: " + list.size());                    // Output: Size: 15
	        System.out.println("Final Capacity: " + getCapacity(list));    // Output: Final Capacity: 20
	    }

	    private static int getCapacity(ArrayList<?> list) {
	        try {
	            java.lang.reflect.Field field = ArrayList.class.getDeclaredField("elementData");
	            field.setAccessible(true);
	            return ((Object[]) field.get(list)).length;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return -1;
	        }
	    }
	}

	



