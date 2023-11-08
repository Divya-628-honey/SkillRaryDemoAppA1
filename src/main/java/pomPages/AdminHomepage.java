package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomepage {
	
	//Declaration
	@FindBy (xpath= "//span[text()='skillRary Admin']")
	private WebElement adminIcon;

	@FindBy (xpath= "//span[text()='Users']")
	private WebElement usersTab;

	@FindBy (xpath= "//span[text()='Courses']")
	private WebElement CoursesTab;
	
	@FindBy (xpath= "//a[text()='Course List']")
	private WebElement CourseListLink;
	
	@FindBy (xpath= "//a[text()='Category']")
	private WebElement CategoryLink;
	
	@FindBy (xpath= "//a[text()='Sign out']")
	private WebElement signOutLink;

//Initialization
public AdminHomepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

//Utilization
public String getAdminIcon() {
	return adminIcon.getText();
}

public void  clickUsersTab() {
	usersTab.click();
}

public void clickCoursesTab() {
	CoursesTab.click();
}

public void clickCourseListLink() {
	CourseListLink.click();
}

public void clickCategoryLink() {
	CategoryLink.click();
}

public void signOutofApp() {
	adminIcon.click();
	signOutLink.click();
   }
}
