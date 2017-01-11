/**
 * Created by jamesfelton on 1/11/17.
 */
public class James {

	public static void saySomething() {
		int selection = (int) (Math.random() * 1000);
		String[] sayings =  {"Just say 'No' to plug-ins!",
				"Serverless code, man! Serverless code.",
				"Did someone say Lambda",
				"Dungeons & Dragons!"};
		System.out.println(sayings[selection % sayings.length]);
	}
}
