package com.tap-step-files.stepdefinitions;

import com.tap-step-files.utils.ElementUtils;
import org.junit.Assert;
import com.tap-step-files.driverfactory.DriverFactory;
import com.tap-dap227.pages.OpenCreateNewJobOpeningForPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class OpenCreateNewJobOpeningFor extends DriverFactory {
OpenCreateNewJobOpeningForPage jobOpeningPage = new OpenCreateNewJobOpeningForPage(driver);
@Given("the user is on the Job Opening screen")
public void the_user_is_on_the_job_opening_screen() {
jobOpeningPage.navigateToJobOpeningScreen();
}
@When("the user locates the Add Job Opening button")
public void the_user_locates_the_add_job_opening_button() {
jobOpeningPage.locateAddJobOpeningButton();
}
@When("the user clicks on the Add Job Opening button")
public void the_user_clicks_on_the_add_job_opening_button() {
jobOpeningPage.clicksAddJobOpeningButton();
}
@Then("the Create New Job Opening form is displayed")
public void the_create_new_job_opening_form_is_displayed() {
jobOpeningPage.isCreateNewJobOpeningFormDisplayed();
}
@And("the form contains fields for job title, description, requirements, and other relevant information")
public void the_form_contains_fields_for_job_title_description_requirements_and_other_relevant_information() {
jobOpeningPage.areFieldsPresent();
}
@And("the form displays Save and Cancel buttons")
public void the_form_displays_save_and_cancel_buttons() {
jobOpeningPage.areSaveAndCancelButtonsDisplayed();
}
@Given("the user fills in the job title field with {string}")
public void the_user_fills_in_the_job_title_field_with(String jobTitle) {
jobOpeningPage.fillJobTitleField(jobTitle);
}
@Given("the user fills in the job description field with {string}")
public void the_user_fills_in_the_job_description_field_with(String jobDescription) {
jobOpeningPage.fillJobDescriptionField(jobDescription);
}
@Given("the user fills in the job requirements field with {string}")
public void the_user_fills_in_the_job_requirements_field_with(String jobRequirements) {
jobOpeningPage.fillJobRequirementsField(jobRequirements);
}
@Then("the Save button should be enabled")
public void the_save_button_should_be_enabled() {
jobOpeningPage.isSaveButtonEnabled();
}
@Then("the Cancel button should remain enabled")
public void the_cancel_button_should_remain_enabled() {
jobOpeningPage.isCancelButtonEnabled();
}
@When("the user clicks on the Cancel button in the Create New Job Opening form")
public void the_user_clicks_on_the_cancel_button_in_the_create_new_job_opening_form() {
jobOpeningPage.clicksCancelButton();
}
@Then("the Create New Job Opening form is closed")
public void the_create_new_job_opening_form_is_closed() {
jobOpeningPage.isCreateNewJobOpeningFormDisplayed();
}
@Then("the user is returned to the Job Opening screen")
public void the_user_is_returned_to_the_job_opening_screen() {
jobOpeningPage.isOnJobOpeningScreen();
}
@When("I leave the job title field empty")
public void i_leave_the_job_title_field_empty() {
jobOpeningPage.leaveJobTitleFieldEmpty();
}
@When("I leave the job description field empty")
public void i_leave_the_job_description_field_empty() {
jobOpeningPage.leaveJobDescriptionFieldEmpty();
}
@When("I leave the job requirements field empty")
public void i_leave_the_job_requirements_field_empty() {
jobOpeningPage.leaveJobRequirementsFieldEmpty();
}
@When("I click the Save button")
public void i_click_the_save_button() {
jobOpeningPage.clicksSaveButton();
}
@Then("validation messages are displayed for the empty job title field")
public void validation_messages_are_displayed_for_the_empty_job_title_field() {
jobOpeningPage.isJobTitleValidationMessageDisplayed();
}
@Then("validation messages are displayed for the empty job description field")
public void validation_messages_are_displayed_for_the_empty_job_description_field() {
jobOpeningPage.isJobDescriptionValidationMessageDisplayed();
}
@Then("validation messages are displayed for the empty job requirements field")
public void validation_messages_are_displayed_for_the_empty_job_requirements_field() {
jobOpeningPage.isJobRequirementsValidationMessageDisplayed();
}
@Then("the Save button remains disabled")
public void the_save_button_remains_disabled() {
jobOpeningPage.isSaveButtonEnabled();
}
@Given("I fill in the job title field with {string}")
public void i_fill_in_the_job_title_field_with(String jobTitle) {
jobOpeningPage.fillJobTitleField(jobTitle);
}
//    @Given("I leave the job description field empty")
@Given("I fill in the job requirements field with {string}")
public void i_fill_in_the_job_requirements_field_with(String jobRequirements) {
jobOpeningPage.fillJobRequirementsField(jobRequirements);
}
@Then("an error message should be displayed indicating the job title is too short")
public void an_error_message_should_be_displayed_indicating_the_job_title_is_too_short() {
jobOpeningPage.isJobTitleTooShortErrorDisplayed();
}
@Then("the job title field retains the entered value")
public void the_job_title_field_retains_the_entered_value() {
Assert.assertEquals(jobOpeningPage.getJobTitleFieldValue(), jobOpeningPage.getEnteredJobTitle());
}
@Then("the job requirements field retains the entered value")
public void the_job_requirements_field_retains_the_entered_value() {
Assert.assertEquals(jobOpeningPage.getJobRequirementsFieldValue(), jobOpeningPage.getEnteredJobRequirements());
}
@When("the user enters {string} in the job title field")
public void the_user_enters_in_the_job_title_field(String jobTitle) {
jobOpeningPage.fillJobTitleField(jobTitle);
}
@When("the user fills in {string} in the job description field")
public void the_user_fills_in_in_the_job_description_field(String jobDescription) {
jobOpeningPage.fillJobDescriptionField(jobDescription);
}
@When("the user fills in {string} in the requirements field")
public void the_user_fills_in_in_the_requirements_field(String requirements) {
jobOpeningPage.fillJobRequirementsField(requirements);
}
@Then("the form is saved successfully without any validation errors")
public void the_form_is_saved_successfully_without_any_validation_errors() {
jobOpeningPage.isFormSavedSuccessfully();
}
@Then("the job opening is created with the special characters in the title")
public void the_job_opening_is_created_with_the_special_characters_in_the_title() {
jobOpeningPage.isJobOpeningCreatedWithSpecialCharacters();
}
@Then("the job opening is created with numeric values in the requirements")
public void the_job_opening_is_created_with_numeric_values_in_the_requirements() {
jobOpeningPage.isJobOpeningCreatedWithNumericValues();
}
@Then("the job opening is created with all job requirements listed")
public void the_job_opening_is_created_with_all_job_requirements_listed() {
jobOpeningPage.isJobOpeningCreatedWithAllRequirements();
}
@Then("the job opening is created with the optional fields left empty")
public void the_job_opening_is_created_with_the_optional_fields_left_empty() {
jobOpeningPage.isJobOpeningCreatedWithOptionalFieldsLeftEmpty();
}
@Then("the job opening is created with special characters in the description")
public void the_job_opening_is_created_with_special_characters_in_the_description() {
jobOpeningPage.isJobOpeningCreatedWithSpecialCharactersInDescription();
}
@Then("the job opening is created with the job title trimmed of whitespace")
public void the_job_opening_is_created_with_the_job_title_trimmed_of_whitespace() {
jobOpeningPage.isJobOpeningCreatedWithTrimmedJobTitle();
}
@Then("the job opening is created with the email format included in the description")
public void the_job_opening_is_created_with_the_email_format_included_in_the_description() {
jobOpeningPage.isJobOpeningCreatedWithEmailFormatInDescription();
}
@Given("the job title field is empty")
public void the_job_title_field_is_empty() {
jobOpeningPage.leaveJobTitleFieldEmpty();
}
@Then("the Save button should be disabled")
public void the_save_button_should_be_disabled() {
jobOpeningPage.isSaveButtonEnabled();
}
@Then("an error message is displayed indicating the job title already exists")
public void an_error_message_is_displayed_indicating_the_job_title_already_exists() {
jobOpeningPage.isJobTitleAlreadyExistsErrorDisplayed();
}
@Then("an error message is displayed indicating invalid characters in the job title")
public void an_error_message_is_displayed_indicating_invalid_characters_in_the_job_title() {
jobOpeningPage.isInvalidCharactersInJobTitleErrorDisplayed();
}
@Then("an error message is displayed indicating the job title exceeds the character limit")
public void an_error_message_is_displayed_indicating_the_job_title_exceeds_the_character_limit() {
jobOpeningPage.isJobTitleExceedsCharacterLimitErrorDisplayed();
}
@Then("an error message is displayed indicating the job description exceeds the character limit")
public void an_error_message_is_displayed_indicating_the_job_description_exceeds_the_character_limit() {
jobOpeningPage.isJobDescriptionExceedsCharacterLimitErrorDisplayed();
}
@Then("an error message is displayed indicating the job requirements exceed the character limit")
public void an_error_message_is_displayed_indicating_the_job_requirements_exceed_the_character_limit() {
jobOpeningPage.isJobRequirementsExceedsCharacterLimitErrorDisplayed();
}
@Then("validation messages are displayed for all required fields")
public void validation_messages_are_displayed_for_all_required_fields() {
jobOpeningPage.areAllRequiredFieldValidationMessagesDisplayed();
}