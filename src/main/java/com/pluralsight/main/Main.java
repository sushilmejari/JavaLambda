package com.pluralsight.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.pluralsight.domain.Dog;

public class Main {

	public static void main(String[] args) {
		Comparator<Dog> cmpName = (d1, d2) ->  d1.getName().compareTo(d2.getName());
		Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");
		Dog puppy = Dog.called("Puppy").ofBreed("Labrador").andOfColour("Black");
		Dog tommy = Dog.called("tommy").ofBreed("Labrador").andOfColour("Black");
		List<Dog> list = new ArrayList<Dog>();
		
		list.add(puppy);
		list.add(tommy);
		list.add(fido);
		Collections.sort(list,cmpName);
		list.forEach( p -> System.out.print(p.getName()));
		
		
		
		

		
	
	
	}

}
