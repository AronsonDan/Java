package homework20161228;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// Create few Animal objects
	Animal a1 = new Cat("Cat1", 10);
	Animal a2 = new Cat("Cat2", 15);
	Animal a3 = new Dog("Dog1", 20);
	Animal a4 = new Dog("Dog2", 25);
	Animal a5 = new Rabbit("Rabbit1", 5);

	// Create an ArrayList collection of the Animal objects
	ArrayList<Animal> animalArray = new ArrayList<Animal>();

	// Add the objects to the collection
	animalArray.add(a1);
	animalArray.add(a2);
	animalArray.add(a3);
	animalArray.add(a4);
	animalArray.add(a5);
	System.out.println(animalArray);
	
	animalArray.sort(null);
	// Print the collection
	System.out.println(animalArray);

	// Create an ArrayList collection of the Animal objects
	Map<String, Animal> animalHashMap = new HashMap<String, Animal>();

	// Add the objects to the collection
	animalHashMap.put(a1.getName(), a1);
	animalHashMap.put(a2.getName(), a2);
	animalHashMap.put(a3.getName(), a3);
	animalHashMap.put(a4.getName(), a4);
	animalHashMap.put(a5.getName(), a5);

	// Print the collection	
//	System.out.println(animalHashMap);
	
	// Create an ArrayList collection of the Animal objects
	Map<Animal, String> animalHashMap2 = new HashMap<Animal, String>();

	// Add the objects to the collection
	animalHashMap2.put(a1, "Description");
	animalHashMap2.put(a2, "Description");
	animalHashMap2.put(a3, "Description");
	animalHashMap2.put(a4, "Description");
	animalHashMap2.put(a5, "Description");

	// Print the collection	
//	System.out.println(animalHashMap2);
	
	// Create an ArrayList collection of the Animal objects
	Set<Animal> animalSet = new HashSet<Animal>();

	// Add the objects to the collection
	animalSet.add(a1);
	animalSet.add(a1);
	
	// Print the collection	
//	System.out.println(animalSet);
    }

}
