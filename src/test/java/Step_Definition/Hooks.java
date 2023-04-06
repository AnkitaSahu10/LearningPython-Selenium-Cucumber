package Step_Definition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	
//Run  before every scenario , prerequisite for every scenariocannot u use with background together
@Before("@SanityTest")
public void beforeValidation() {
	System.out.println("Sanity before hook");
}

@After("@SanityTest")
public void afterValidation() {
	System.out.println("Sanity after hook");
}

}
