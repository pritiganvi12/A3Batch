package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.BaseClass;

public class BasePage extends BaseClass {
	@FindBy(partialLinkText = "Register")
	private   WebElement registerLink;
	
	@FindBy(partialLinkText = "Log in")
	private WebElement  loginLink;
	
	@FindBy(partialLinkText = "Shopping cart")
	private  WebElement   shoppingCartLink;
	
	@FindBy(partialLinkText = "Wishlist")
	private WebElement  wishlistLinkList;
	
	@FindBy(partialLinkText = "BOOKS")
	private  WebElement  booksLink ;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement  computersLink ;
	
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement  electronicsLink ;
	
	@FindBy(partialLinkText = "APPAREL & SHOES")
	private WebElement  apparelAndShoesLink ;
	
	@FindBy(partialLinkText = "DIGITAL DOWNLOAD")
	private WebElement  digitalDownloadsLink ;
	
	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftCarrdsLink  ;
	/**
	 * Getters
	
	*/
	/**
	 * this method is used to access register link
	 * @return WebElement
	 */
	
	public WebElement getRegisterLink() {
		return registerLink;
	}


	public WebElement getLoginLink() {
		return loginLink;
	}


	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}


	public WebElement getWishlistLinkList() {
		return wishlistLinkList;
	}


	public WebElement getBooksLink() {
		return booksLink;
	}


	public WebElement getComputersLink() {
		return computersLink;
	}


	public WebElement getElectronicsLink() {
		return electronicsLink;
	}


	public WebElement getApparelAndShoesLink() {
		return apparelAndShoesLink;
	}


	public WebElement getDigitalDownloadsLink() {
		return digitalDownloadsLink;
	}


	public WebElement getGiftCarrdsLink() {
		return giftCarrdsLink;
	}


	public WebElement getSearchBox() {
		return searchBox;
	}


	public WebElement getSearchButton() {
		return searchButton;
	}


	@FindBy(id = "small-searchterms")
	 public WebElement searchBox  ;
	
	@FindBy(xpath = "//input[@value='Search']")
	public WebElement searchButton;
	
	
	public BasePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	

}
