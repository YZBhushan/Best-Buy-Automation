package resonancia.bestbuy.pages.products.homefurnitureandoffice.home;
import resonancia.bestbuy.customeutils.WaitUntil;
import resonancia.bestbuy.maindata.TestBase;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import com.sun.org.apache.bcel.internal.generic.GOTO;

public class VacuumCleanersAndFloorCare extends TestBase{

	@FindBy(xpath="//button[contains(text(),'Products')]")
	WebElement productslist;
	
	@FindBy(xpath="//button[contains(text(),'Home, Furniture & Office')]")
	WebElement homefurnitureandofficebtn;
	
	@FindBy(xpath="//div[contains(text(),'Home')]")
	WebElement home;
	
	@FindBy(xpath="//li[contains(@class,'item-child-menu')]//a[contains(text(),'Vacuum Cleaners & Floor Care')]")
	WebElement vacuumcleanersandfloorcare;
	
	@FindBy(xpath="//a[contains(text(),'All Vacuums & Floor Care')]")
	WebElement allvacuumsandfloorcare;
	@FindBy(xpath="//a[contains(text(),'Upright Vacuums')]")
	WebElement uprightvacuums;
	@FindBy(xpath="//a[contains(text(),'Canister Vacuums')]")
	WebElement canistervacuums;
	@FindBy(xpath="//a[contains(text(),'Cordless Vacuums')]")
	WebElement cordlessvacuums;
	@FindBy(xpath="//a[contains(text(),'Handheld & Stick Vacuums')]")
	WebElement handheldandstickvacuums;
	@FindBy(xpath="//a[contains(text(),'Robot Vacuums & Mops')]")
	WebElement robotvacuumsandmops;
	@FindBy(xpath="//a[contains(text(),'Pet Vacuums')]")
	WebElement petvacuums;
	@FindBy(xpath="//a[contains(text(),'Commercial & Garage Vacuums')]")
	WebElement commercialandgaragevacuums;
	@FindBy(xpath="//a[contains(text(),'Steam Mops')]")
	WebElement steammops;
	@FindBy(xpath="//a[contains(text(),'Carpet Cleaners')]")
	WebElement carpetcleaners;
	@FindBy(xpath="//a[contains(text(),'Vacuum & Floor Care Accessories')]")
	WebElement vacuumandfloorcareaccessories;
	
	@FindBy(xpath="//span[@class='item-count']")
	WebElement totalitemscount;
	@FindBy(xpath="//div[@class='left-side']//span")
	WebElement expcount;
	
	public VacuumCleanersAndFloorCare() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOn(String elementname) {
		switch (elementname) {
		case "productslist": productslist.click(); break;
		case "homefurnitureandofficebtn" :  homefurnitureandofficebtn.click();break;
		case "home": home.click(); break;
		case "vacuumcleanersandfloorcare": vacuumcleanersandfloorcare.click();break;
		case "uprightvacuums": uprightvacuums.click();break;
		case "canistervacuums": canistervacuums.click(); break;
		case "cordlessvacuums": cordlessvacuums.click();break;
		case "handheldandstickvacuums" : handheldandstickvacuums.click();break;
		case "robotvacuumsandmops" : robotvacuumsandmops.click();break;
		case "petvacuums" : petvacuums.click();break;
		case "commercialandgaragevacuums" : commercialandgaragevacuums.click();break;
		case "steammops" : steammops.click();break;
		case "carpetcleaners" : carpetcleaners.click();break;
		case "vacuumandfloorcareaccessories" : vacuumandfloorcareaccessories.click();break;
		case "allvacuumsandfloorcare": allvacuumsandfloorcare.click();break;
		
		default:
			break;
		}		
	}
	
	public int gettotalitemscount() {
		int count=0;
		try {
			count=((Number)NumberFormat.getInstance().parse(totalitemscount.getText())).intValue();
		} catch (ParseException e) {
			System.err.println("Unable to convert item count into number");
			e.printStackTrace();
		}
		return count;
	}
	
	public int getactualelementdisplayedcount() {
		int count=0;
		//List<WebElement> listOfLiTags = driver.findElement(By.xpath("//ol[@class='sku-item-list']")).findElements(By.tagName("li"));
		//for(WebElement li : listOfLiTags) count++;
		
		String separator ="of";
		int sepPos = expcount.getText().indexOf(separator);
		try {
			count=(int) ((Number)NumberFormat.getInstance().parse(expcount.getText().substring(sepPos + separator.length()+1)).intValue());
		} catch (ParseException e) {
			System.err.println("Unable to convert Expected item count into number");
			e.printStackTrace();
		}
		return count;
	}
	
	
}
