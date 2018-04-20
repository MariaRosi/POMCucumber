package utility;

import base.TestBaseClass;

public class TestUtility extends TestBaseClass{ 
	
	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long	IMPLICIT_WAIT = 30;
	
	public void switchToFrame() {
		System.out.println("Prog : TestUtility and Method : switchToFrame");
		driver.switchTo().frame("mainpanel");
	}
	


}
