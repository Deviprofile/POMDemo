package testScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.SearchResultPage;
import base.TestBase;


public class PlaceOrderTest extends TestBase {
	HomePage homePage;
	
	@BeforeTest
	public void setup() {
		Initialize();
	}
	@Test(priority=1)
	public void searchItemTest(){
		homePage=new HomePage();
		resultpage=homePage.searchItem("Parry Hotter");
		resultpage.viewItemDetail();
	}
	@Test(priority=2)
	public void addItemTest() {
		resultpage=new SearchResultPage;
		resultpage.addItem;
			
		
	}

}
