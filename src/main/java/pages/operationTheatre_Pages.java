package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class operationTheatre_Pages extends StartupPage {


	String pageName = this.getClass().getSimpleName();
	public operationTheatre_Pages(WebDriver driver) {
		super(driver);
	}

	/**@Test1
	 * about this method loginTohealthAppByGivenValidCredetial() 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
				return false;
	}

	/**@Test1.2
	 * about this method verifyTitleOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the title of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyTitleOfThePage() throws Exception {
		
		return null;
	}

	/**@Test1.3
	 * about this method verifyURLOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the URL of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyURLOfThePage() throws Exception {
		
		return null;
	}

	/**@Test2
	 * about this method verifyOperationTheatreModuleIsPresentAndGoToOperationTheatreTab() 
	 * @param : null
	 * @description : Verify that OperationTheatre module is present and Go to OperationTheatre Tab.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String goToOperationTheatreModuleVerifyTableHeaderName() throws Exception {

		return null;
	}


	/**@Test3
	 * about this method verifyBookingOTScheduleFormByClickingOnNewOTBookingButton() 
	 * @param : null
	 * @description : verify the button & text 
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyBookingOTScheduleFormByClickingOnNewOTBookingButton() throws Exception {
		
		return null;
	}

	/**@Test6
	 * about this method verifyTexboxIsPresentAndValidateEnteredValue() 
	 * @param : null
	 * @description : verify text box , then send value to that text box and validate the entered value
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyTexboxIsPresentAndValidateEnteredValue(Map<String, String> expectedData) throws Exception {

	
		return null;
	}

	/**@Test5
	 * about this method verifyPlaceholderNameOfTexboxIfTextboxIsEnabled() 
	 * @param : null
	 * @description : verify the placeholder name of text box if text box is enabled
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyPlaceholderNameOfTexboxIfTextboxIsEnabled() throws Exception {
			
		return null;
	}

	/**@Test6
	 * about this method verifyButtonIsPresentAfterSendValueToSurgenNameTextfield() 
	 * @param : null
	 * @description : verify the button is present after send the value to the text box
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyButtonIsPresentAfterSendValueToSurgenNameTextfield(Map<String, String> expectedData) throws Exception {
			
		return null;
	}

	/**@Test7
	 * about this method verifyPlusButtonIsPresentAfterClickOnExternalCheckbox() 
	 * @param : null
	 * @description : click on check box and verify check box is selected or not and verify the + (plus) icon after click on check box
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean verifyPlusButtonIsPresentAfterClickOnExternalCheckbox() throws Exception {

		return false;
	}

	/**@Test8
	 * about this method verifyErrorMessageInAddExternalReferralForms() 
	 * @param : null
	 * @description : verify the error message
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyErrorMessageInAddExternalReferralForms() throws Exception {
		
		return null;
	}

	/**@Test9
	 * about this method verifySuccessNotificationPopupMessage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the URL of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifySuccessNotificationPopupMessage(Map<String, String> expectedData) throws Exception {

		return null;
	}

	/**@Test10
	 * about this method closeBookingOTScheduleNewPatientFormsByUsingJsExecutor() 
	 * @param : null
	 * @description : On the "Booking OT Schedule New Patient" Forms, Close this ""Booking OT Schedule New Patient" Forms by using javaScript.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean closeBookingOTScheduleNewPatientFormsByUsingJsExecutor() throws Exception {
		
		return false;
	}

	/**@Test11
	 * about this method performScrollOperation() 
	 * @param : null
	 * @description : scroll to the bottom of the page and validate the button and text field is present
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean performScrollOperation(Map<String, String> expectedData) throws Exception {

		return false;
	}

	/**@Test12
	 * about this method verifyLocatorsValueOfELement() 
	 * @param : Map<String, String>
	 * @description : verify locators value of text box and send value to the text box and highlight that text box
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyLocatorsValueOfELement(Map<String, String> expectedData) throws Exception {

		return null;
	}

	/**@Test13
	 * about this method performKeyboardOperation() 
	 * @param : Map<String, String>
	 * @description : perform the keyboard operation
	 * @return : String
	 * @author : YAKSHA
	 */
	public String performKeyboardOperation() throws Exception {
		
		return null;
	}
	
	/**@Test14.1
	 * about this method verifyRadioButton() 
	 * @param : null
	 * @description :
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean verifyRadioButton() throws Exception {
		
		return false;
	}
	
	/**@Test14.2
	 * about this method verifyOptionIsSelectedFromDropdown() 
	 * @param : get the data from json file as type Map<String, String> expectedData
	 * @description : it will select the option as per JSON expected data
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyOptionIsSelectedFromDropdown(Map<String, String> expectedData) throws Exception {

		return null;	
	}
	
	/**@Test15
	 * about this method verifyErrorNotificationPopupMessage() 
	 * @param : null
	 * @description : verify the error message using hard assert
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyErrorNotificationPopupMessage() throws Exception {
			
		return null;
	}
}
