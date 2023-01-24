package com.gemini.generic.stepDefinition;
import com.gemini.generic.steps.Stepss;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class StepDefinition {
    @Steps
    Stepss step;

    @Given("Application is launched")
    public void appL(){
        step.app();
    }

    @Then("Add and Validate {string} notes and {string} notes")
    public void addAndValidateNotesAndNotes(String text, String check) {
        step.addNote(text,check);
        step.valNote();
    }

    @Then("Add Note with {string} text notes and {string} notes")
    public void addNoteWithTextNotesAndNotes(String text, String check) {
        step.addNote(text,check);
    }
    @Then("change color")
    public void changeColor() {
        step.colorChange();

    }
    @Then("validate color dict")
    public void colorDict() {
        step.colorDict();

    }

    @Then("transfer note to {string} and validate")
    public void transferNoteToAndValidate(String option) {
        step.archiveTrash(option);
    }

    @Then("Validate through search button")
    public void validateThroughSearchButton() {
        step.validateNoteThroughSearch();
    }

    @Then("Go to Settings and change layout to {string}")
    public void goToSettingsAndChangeLayoutTo(String type) {
        step.changeLayout(type);
    }

    @Then("validate {string} on homepage")
    public void validateOnHomepage(String type) {
        step.validateTypeOnHomepage(type);
    }

    @Then("Validate Notes {string}")
    public void validateNotesBy(String filter) {
        step.validateSort(filter);
    }
}
