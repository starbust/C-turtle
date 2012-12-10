package org.elsys.testExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] arg) {
		List<Vehicle> vehicles = generateCars(5);
		printCars(vehicles);
		String[] args;
		while((args = parseArgs()) != null) {
			int plate = Integer.parseInt(args[0]);
			int x = Integer.parseInt(args[1]);
			int y = Integer.parseInt(args[2]);
			int load = Integer.parseInt(args[3]);
			for(Vehicle vehicle : vehicles) {
				if(vehicle.getRegPlate() == plate) {
					Coordinate pos = new Coordinate();
					pos.setX(x);
					pos.setY(y);
					vehicle.setPosition(pos);
				}
			}
			printCars(vehicles);
		}
	}
	
	
	private static List<Vehicle> generateCars(int count) {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		for(int i = 0; i < count; i++) {
			
		}
		return vehicles;
	}
	
	private static void printCars(List<Vehicle> vehicles) {
		for(Vehicle vehicle : vehicles) {
			vehicle.print();
		}
	}
	
	private static String[] parseArgs() {
		String s;
		try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            s = br.readLine();
    		return s.split(",");
        } catch (IOException e) {
            e.printStackTrace();
        }
		return null;
	}
}
