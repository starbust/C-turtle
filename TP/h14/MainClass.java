package org.elsys.manyToOne;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args){
		ManyToOne<String, Integer> mto = new ManyToOne<String, Integer>();
		mto.connect("test", 1);
		mto.connect("test", 1);
		mto.connect("fghj", 1);
		mto.connect("shits", 4);
		mto.connect("fucksGiven", 0);
		
		ArrayList<String> test = (ArrayList<String>)mto.getSources(1);
		for(String s : test){
			System.out.println(s);
		}
	}
}
