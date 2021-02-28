package com.org.ashish;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


        List<String> listOfDronesId = new ArrayList<>();
        listOfDronesId.add("100");
        listOfDronesId.add("100");
        listOfDronesId.add("100");
        listOfDronesId.add("101");
        listOfDronesId.add("101");
        listOfDronesId.add("102");
        listOfDronesId.add("102");
        listOfDronesId.add("102");

        HashMap<String, Integer> dronesCollection = new HashMap<>();
        int count = 1;
        int i;
        int j;
        for (i = 0; i < listOfDronesId.size(); i++) {

            if (!dronesCollection.containsKey(listOfDronesId.get(i))) {
                String droneId = listOfDronesId.get(i);
                for (j = i + 1; j < listOfDronesId.size(); j++) {
                    if (droneId.equals(listOfDronesId.get(j))) {
                        count = count + 1;
                    }
                }
                dronesCollection.put(droneId, count);
            }
            count = 1;
        }
        System.out.println(dronesCollection);


        for (Map.Entry<String, Integer> drones : dronesCollection.entrySet()) {
            if (drones.getValue() % 2 != 0) {
                System.out.println("Drone is missing. Missing drone id is :" + drones.getKey());
            }
        }
    }
}
