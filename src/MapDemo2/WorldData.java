package MapDemo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class WorldData {
	
	public static void main(String[] args) {
		
		WorldData obj = new WorldData();
		obj.StoreWorldData();
		
	}
	
	void StoreWorldData() {
		
		ArrayList<String> maharashtra = new ArrayList<String>();
		maharashtra.add("Pune");
		maharashtra.add("Mumbai");
		
		ArrayList<String> karnataka = new ArrayList<String>();
		karnataka.add("Banglore");
		karnataka.add("Maisur");
		
		HashMap<String, ArrayList<String>> india = new HashMap<String, ArrayList<String>>();
		india.put("Maharashtra", maharashtra);
		india.put("Karnataka", karnataka);
		
		ArrayList<String> usstate1 = new ArrayList<String>();
		usstate1.add("State1-City1");
		usstate1.add("State1-City2");
		
		ArrayList<String> usstate2 = new ArrayList<String>();
		usstate2.add("State2-City1");
		usstate2.add("State2-City2");
		
		HashMap<String, ArrayList<String>> us = new HashMap<String, ArrayList<String>>();
		us.put("US-State1", usstate1);
		us.put("Us-State2", usstate2);
		
		HashMap<String, HashMap<String, ArrayList<String>>> world = new HashMap<String, HashMap<String, ArrayList<String>>>();
		world.put("India", india);
		world.put("Us", us);
		
		GetWorldData(world);
		
	}
	
	void GetWorldData(HashMap<String, HashMap<String, ArrayList<String>>> world) {
		
		Set<String> countrykey = world.keySet();
		
		for (String countryName : countrykey) {
			
			System.out.println(countryName);
			
			HashMap<String, ArrayList<String>> countrymap = world.get(countryName);
			
			Set<String> statekey = countrymap.keySet();
			
			for (String stateName : statekey) {
				
				System.out.println(stateName);
				
				ArrayList<String> allState = countrymap.get(stateName);
				
				for (String state : allState) {
					
					System.out.println(state);
					
				}
			}
			
		}
		
	}

}
