package Collection2;

import java.util.HashMap;
import java.util.Iterator;

public class UseBike {
	public static void main(String[] args) {

		Bike bike1 = new Bike("yamaha", 200000, "black", "R15", 150, "TN 31 R15");

		Bike bike2 = new Bike("Tvs", 150000, "yellow", "apache", 120, "TN91 q12");

		Bike bike3 = new Bike("RC", 300000, "green", "Ktm", 390, "TN48 f12");

		Bike bike4 = new Bike("RE", 250000, "white", "thunderBird", 300, "TN01 g34");

		Bike bike5 = new Bike("bajaj", 170000, "red", "pulsar", 150, "TN02 b32");

		Bike bike6 = new Bike("BMW", 350000, "blue", "BMWxrt", 400, "TN06 v43");

		HashMap<String, Bike> bikes = new HashMap<>();

		HashMap<String, Bike> bikes1 = new HashMap<>();

		HashMap<String, Bike> localBike = new HashMap<>();

		bikes.put(bike1.getNoPlate(), bike1);

		bikes.put(bike2.getNoPlate(), bike2);

		bikes.put(bike3.getNoPlate(), bike3);

		bikes.put(bike4.getNoPlate(), bike4);

		bikes.put(bike5.getNoPlate(), bike5);

		bikes.put(bike6.getNoPlate(), bike6);
		

//		for (String val : bikes.keySet()) {
//
//			System.out.println(bikes.get(val));
//
//		}
//		
//		System.out.println();
//		for(Bike vals : bikes.values()) {
//			System.out.println(vals + " " + bikes.get(vals));
//		}

		System.out.println();
		
		
		 
		bikes.values().forEach(y ->{
			if(y.getPrice() > 20000) {
				System.out.println( "Bike NumberPlate = " + y.getNoPlate()   + ", Bike = "+ y.getBrand());
			}
		});

//		bikes.keySet().forEach((x) -> {
//			if (bikes.get(x).getPrice() > 200000) {
//
//				bikes1.put(x, bikes.get(x));
//
//			}
//		});
//
//		for (String c : bikes1.keySet()) {
//
//			System.out.println(bikes1.get(c));
//
//		}
//
//		for (String c : bikes.keySet()) {
//			if (bikes.get(c).getColor().equalsIgnoreCase("black")) {
//				bikes.remove(c);
//			}
//		}
//		System.out.println(bikes);
//
//		Iterator<Bike> x = bikes.values().iterator();
//
//		while (x.hasNext()) {
//			if (x.next().getColor().equalsIgnoreCase("black")) {
//				x.remove();
//			}
//			;
//		}
//		System.out.println(bikes);

		Iterator<String> y = bikes.keySet().iterator();

		while (y.hasNext()) { // no get method
			if (bikes.get(y.next()).getColor().equalsIgnoreCase("white")) { // get method
				y.remove();
			}

		}
		System.out.println(bikes);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		for (String xx : bikes.keySet()) {
			if (bikes.get(xx).getBrand().length() % 2 != 0) {

				localBike.put(xx, bikes.get(xx));
			}
		}

		localBike.keySet().forEach(yy -> {
			System.out.println(localBike.get(yy));
			System.out.println();
		});

	}

}
