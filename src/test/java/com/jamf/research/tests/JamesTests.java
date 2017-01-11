package test.java.com.jamf.research.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import com.jamf.research.James;

/**
 * Created by jamesfelton on 1/11/17.
 */
public class JamesTests {

	@Test
	public void testSaySomething() {
		// arrange
		String[] sayings =  {"Just say 'No' to plug-ins!",
				"Serverless code, man! Serverless code.",
				"Did someone say Lambda",
				"Dungeons & Dragons!"};
		ArrayList<String> sayingsList = new ArrayList<String>();
		for (String saying : sayings) {
			sayingsList.add(saying);
		}

		// act
		String jamesSaid = James.saySomething();

		// assert
		assertEquals(true, sayingsList.contains(jamesSaid));
	}
}
