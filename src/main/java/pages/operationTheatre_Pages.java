package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class operationTheatre_Pages extends StartupPage {
	
	By usernameTextfield = By.id(" ");
	By usernameTextbox = By.xpath(" ");
	By passwordTextbox = By.xpath(" ");
	By signInButton = By.xpath(" ");
	By registeredPatientTextElement = By.xpath(" ");	
	By operationTheatreModule = By.xpath(" ");
	By operationTheatreTab = By.xpath(" ");

	By newOTButtonElement = By.xpath(" ");
	By newOTButtonLink = By.xpath(" ");
	By searchTextBoxElement = By.xpath(" ");
	By bookingOTSchedulePageElement = By.xpath(" ");

	By selectpatientTextboxElement = By.xpath(" ");
	By diagnosisTextboxElement = By.xpath(" ");
	By surgeryTypeTextboxElement = By.xpath(" ");
	By remarkTextboxElement = By.xpath(" ");


	By surgenNameTextFieldElement = By.xpath(" ");
	By anesthetistDoctorTextboxElement = By.xpath(" ");
	By surgenNameFirstButtonElement = By.xpath(" ");

	By externalCheckBoxElement = By.xpath(" ");
	By plusIconButtonElement = By.xpath(" ");

	By referrerNameTextFieldElement = By.xpath(" ");
	By extRefferAddressTextFieldElement = By.xpath(" ");
	By contactNumberTextFieldElement = By.xpath(" ");
	By emailTextFieldElement = By.xpath(" ");
	By isIncentiveApplicableCheckboxElement = By.xpath(" ");
	By addButtonElement = By.xpath(" ");
	By successNotificationPopupMessageElement = By.xpath(" ");

	By successNotificationPopupMessageOneElement = By.xpath(" ");
	By successNotificationPopupMessageTwoElement = By.xpath(" ");

	By hospitalNumberByElement = By.xpath(" ");
	By newOtButtonByElement = By.xpath(" ");
	By bookingOTScheduleFormsTitleNameByElement = By.xpath(" ");
	By remarksTextAreaByElement = By.xpath(" ");
	By addButtonOfAddExternalReferralByElement = By.xpath(" ");
	By errorMessageOfAddExternalReferralFormsByElement = By.xpath(" ");
	By titleOfaddExternalReferralFormsByElement = By.xpath(" ");
	By closeLinkOfBookingOTScheduleNewPatientFormsByElement = By.xpath(" ");

	By billingModuleExpandIconByElement = By.xpath(" ");
	By newOneCounterLinkByElement = By.xpath(" ");

	By handOverSubModuleLinkByElement = By.xpath(" ");
	By remarksTextFieldOfBillingSubModulesByElement = By.xpath(" ");
	By handOverToUserButtonOfBillingSubModuleByElement = By.xpath(" ");

	By vaccinationModuleByElement = By.xpath(" ");
	By vaccinationModulesToggleIconByElement = By.xpath(" ");
	By patientListSubModuleByElement = By.xpath(" ");
	By titleNameOfVaccinationPatientRegisterFormByElement = By.xpath(" ");

	By appointmentModuleByElement = By.xpath(" ");
	By appointmentModulesToggleIconByElement = By.xpath(" ");
	By bookingAppointmentSubModuleByElement = By.xpath(" ");

	By newPatientButtonByElement = By.xpath(" ");

	By monthRadioButtonByElement = By.xpath(" ");
	By daysRadioButtonByElement = By.xpath(" ");

	By selectVisitTypeDropdownByElement = By.xpath(" ");

	By addAppointmentButtonByElement = By.xpath(" ");

	By errorNotificationPopupMessageElement = By.xpath(" ");
	By statusErrorNotificationMessageByElement = By.xpath(" ");
	By mainErrorNotificationMessageByElement = By.xpath(" ");
	By closeLinkOfVaccinationPatientRegisterForm = By.xpath(" ");
	By newOTBookingButtonByElement = By.xpath(" ");

	By selectOTAssistantNameFieldByElement = By.xpath(" ");
	By searchTexboxOfSelectOTAssistantNameFieldByElement = By.xpath(" ");
	By drPoojaMishraCheckBoxByElement = By.xpath(" ");
	By selectOTAssistantNameDropdownByElement = By.xpath(" ");

	By closeLinkByElement = By.xpath(" ");


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

}
