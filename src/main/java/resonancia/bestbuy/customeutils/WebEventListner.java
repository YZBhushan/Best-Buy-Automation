package resonancia.bestbuy.customeutils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import resonancia.bestbuy.maindata.TestBase;

public class WebEventListner extends TestBase implements WebDriverEventListener {

	@Override
	public void beforeAlertAccept(WebDriver driver) {
		log.info("Try to accept alert");
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {
		log.info("Alert accepted");
		
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		log.info("Alert dismissed");
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		log.info("Try to dismiss alert");
		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		log.info("Try to navigate "+url+" url");
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		log.info("Navigate to "+url+" url");
		
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		log.info("Try to navigate backward");
		
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		log.info("Navigated to backward");
		
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		log.info("Try to navigate forward");
		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		log.info("Navigated to forward");
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		log.info("Try to refresh the DOM");
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		log.info("DOM refreshed");
		
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		if(element==null) {
			 log.info("Just before finding element: " + by.toString() + " on browser: " + driver.toString() );
		}else {
            log.info("Just before finding element: " + by.toString() + " inside " + element.toString() + " Web element on browser: " + driver.toString());
		}
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		if(element==null) {
			 log.info("Just after finding element: " + by.toString() + " on browser: " + driver.toString() );
		}else {
           log.info("Just after finding element: " + by.toString() + " inside " + element.toString() + " Web element on browser: " + driver.toString());
		}
		
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		log.info("Trying to click on "+element.getText()+" "+element.getTagName());		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
	//	log.info("Clicked on "+element.getText()+" "+element.getTagName());
				
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		log.info("Inside the beforeChangeValueOf method");
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}

}
