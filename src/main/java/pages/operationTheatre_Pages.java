package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class operationTheatre_Pages extends StartupPage {
	
	//	Locators for TC-1 
	By usernameTextbox = null;
	By passwordTextbox = null;
	By signInButton = null;
	By registeredPatientTextElement = null;
//	Locators for TC-2
	By operationTheatreModule = null;
	By hospitalNumberByElement = null;
//	Locators for TC-3
	By newOtButtonByElement = null;
	By bookingOTScheduleFormsTitleNameByElement = null;
//	Locators for TC-4
	By selectpatientTextboxElement = null;
	By diagnosisTextboxElement = null;
	By surgeryTypeTextboxElement = null;
//	Locators for TC-5
	By remarksTextAreaByElement = null;
//	Locators for TC-6
	By remarkTextboxElement = null;
	By surgenNameTextFieldElement = null;
	By surgenNameFirstButtonElement = null;
//	Locators for TC-7
	By externalCheckBoxElement = null;
//	Locators for TC-8	
	By plusIconButtonElement = null;
	By addButtonOfAddExternalReferralByElement = null;
	By errorMessageOfAddExternalReferralFormsByElement = null;

	String pageName = this.getClass().getSimpleName();
	public operationTheatre_Pages(WebDriver driver) {
		super(driver);
	}

	/**@Test1.1
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

	/**@Test4
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



}
