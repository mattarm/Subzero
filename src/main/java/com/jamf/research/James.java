package com.jamf.research;

/**
 * Created by jamesfelton on 1/11/17. Edited by Mattarm 1/11
 */
public class Matt {

	public static String saySomething() {
		int selection = (int) (Math.random() * 1000);
		String[] sayings =  {"Lambda and Kinesis",
				"We need datastores",
				"Science of analytics & Understanding data",
				"Go Cowboys"};
		return sayings[selection % sayings.length];
	}
}
