package resonancia.bestbuy.customeutils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resonancia.bestbuy.maindata.TestBase;

public class WaitUntil extends TestBase {
	public static WebDriverWait wait;
	/**
	 * An expectation for checking the title of a page.
	 *
	 * @param title the expected title, which must be an exact match
	 */
	public WaitUntil() {
		wait = new WebDriverWait(driver, 30);
	}
	public static void titleIs(final String title) {
		wait.until(ExpectedConditions.titleIs(title));
		
	}

	/**
	 * An expectation for checking that the title contains a case-sensitive
	 * substring
	 *
	 * @param title the fragment of title expected
	 */
	public static void titleContains(String title) {
		wait.until(ExpectedConditions.titleContains(title));
	}

	/**
	 * An expectation for the URL of the current page to be a specific url.
	 *
	 * @param url the url that the page should be on
	 */
	public static void urlToBe(String url) {
		wait.until(ExpectedConditions.urlToBe(url));
	}

	/**
	 * An expectation for the URL of the current page to contain specific text.
	 *
	 * @param partialurl the fraction of the url that the page should be on
	 */
	public static void urlContains(String partialurl) {
		wait.until(ExpectedConditions.urlContains(partialurl));
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that is greater than 0.
	 *
	 * @param elementname used to find the element
	 */
	public static void visibilityOf(WebElement elementname) {
		wait.until(ExpectedConditions.visibilityOf(elementname));
	}

	/**
	 * An expectation for checking the element to be invisible
	 *
	 * @param elementname used to check its invisibility
	 */
	public static void invisibilityOf(WebElement elementname) {
		wait.until(ExpectedConditions.invisibilityOf(elementname));
	}

	public static void alertIsPresent() {
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public static void timeInSeconds(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			System.err.println("timeInSeconds wait not work");
			e.printStackTrace();
		}
	}
}
