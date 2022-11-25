package Collection2;

import java.util.HashMap;

public class Demo {
	public static void main(String[] args) {

		HashMap<Integer, String> names = new HashMap<>();

		names.put(12, "Pandit");

		names.put(13, "Ragul");

		names.put(14, "livya");

		names.put(15, "selvarani");

		names.put(16, "somu");

		names.put(17, "raj");

		names.put(18, "saritha");

		names.put(19, "akash");

//		
//		System.out.println(names.keySet());
//		
//		System.out.println();
//		System.out.println(names.values());
//		System.out.println();
//		System.out.println(names.get(13));
//		System.out.println();
//		System.out.println(names.get(15));
//		System.out.println();

		// names.remove(19);

//		System.out.println(names.remove(19));
//		
//		System.out.println();
//		
//		System.out.println(names);

		// Enhanced for loop
		for (String val : names.values()) {

			System.out.println(val );

		}

		System.out.println();

		// forEach

		names.values().forEach((x) -> {
			System.out.println(x);

		});

		System.out.println();

		// Enhanced for loop
		for (Integer value : names.keySet()) {
			System.out.println(value);
		}

		System.out.println();

		// forEach
		names.keySet().forEach((y) -> {
			System.out.println(y);
		});

		System.out.println();

		System.out.println(names);

		System.out.println();

		for (Integer vals : names.keySet()) {
			if (vals % 2 == 0) {
				System.out.println(vals + " is even number");

			}
		}

		System.out.println();

		for (Integer val1 : names.keySet()) {
			if (val1 % 2 != 0) {
				System.out.println(val1 + " = " + names.get(val1));

			}
		}
		
		for(String val : names.values()) {
			if(val.length() % 2 != 0) {
				System.out.println(val);
				
			}
		}
		
		for(String value : names.values()) {
			if(value.length() % 2!= 0) {
				System.out.println( "key = "  + names + ", values = " + value);
			}
		}

	}

}
