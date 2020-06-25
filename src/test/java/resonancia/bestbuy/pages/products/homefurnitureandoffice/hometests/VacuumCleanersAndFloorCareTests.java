package resonancia.bestbuy.pages.products.homefurnitureandoffice.hometests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import resonancia.bestbuy.customeutils.DataPrviderClass;
import resonancia.bestbuy.maindata.TestBase;
import resonancia.bestbuy.pages.products.homefurnitureandoffice.home.VacuumCleanersAndFloorCare;

public class VacuumCleanersAndFloorCareTests extends TestBase {

	VacuumCleanersAndFloorCare object;

	public VacuumCleanersAndFloorCareTests() {
		super();
	}

	@BeforeClass
	public void initmethod() {
		initBrowser();
		selectCountryOnStartup();		
		closeStartupPopup();
		object = new VacuumCleanersAndFloorCare();
	}

	@Test(dataProvider = "VacuumCleanersAndFloorCare_DataProvider", dataProviderClass = DataPrviderClass.class)
	public void verifyAllProductList(String ParentOfVaccume, String VaccumeName) {
		object.clickOn("productslist");
		object.clickOn("homefurnitureandofficebtn");
		object.clickOn("home");
		object.clickOn(ParentOfVaccume.toLowerCase().replace(" ", "").replace("&", "and"));
		object.clickOn(VaccumeName.toLowerCase().replace(" ", "").replace("&", "and"));
		Assert.assertEquals(object.gettotalitemscount(), object.getactualelementdisplayedcount(),"Incorrect number of items displayed");
	}

	@AfterClass
	public void quitmethod() {
			driver.quit();
	}

}
