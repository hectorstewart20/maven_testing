package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Tests {

	@Test
	public void tests() {
		//WebDriver driver = new ChromeDriver();
		HtmlUnitDriver driverhtml = new HtmlUnitDriver();
		driverhtml.get("https://www.google.com/");
		String pageTitle = driverhtml.getTitle();
		System.out.println("El titulo de la pagina es "+ pageTitle);
		assertTrue(pageTitle.equals("Google"));
	}

}
