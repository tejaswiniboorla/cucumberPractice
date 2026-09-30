package hooks;

import io.cucumber.java.*;

public class HookExample {
	@Before
	public void setUpA()
	{
		System.out.println("i will run first");
	}
	@After
	public void tearDown()
	{
		System.out.println("i will run in the end");
	}

}
