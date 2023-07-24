package automationFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertion {
	@Test
	public void softAssert() {
		SoftAssert softAssertion = new SoftAssert();
		System.out.println("softAssert Method Was Started");
		softAssertion.assertTrue(false);
		// Soft Assert doesn't throw an Exception when an assert statement fails.
		System.out.println("softAssert Method Was Executed");
	}
	@Test
	public void hardAssert() {
		System.out.println("hardAssert Method Was Started");
		Assert.assertTrue(false);
		// Hard Assert throws an AssertException when an assert statement fails.
		System.out.println("hardAssert Method Was Executed");
	}

}
