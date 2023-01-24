package com.gemini.generic.steps;

import net.thucydides.core.annotations.Step;
import com.gemini.generic.ui.NotePad;

public class Stepss {
    NotePad note;
    @Step("App launch")
    public void app(){
        note.appLaunch();
    }

    @Step("Add note")
    public void addNote(String textNote, String checkNote){
//        note.addAndValidateFile(textNote,checkNote);
        note.addNote(textNote,checkNote);
    }

    @Step("Validate note")
    public void valNote(){
        note.validate();
    }

    @Step("Change Color")
    public void colorChange(){
        note.colorchange();
    }
    @Step("Color Dict")
    public void colorDict(){
        note.colorDict();
    }

    public void archiveTrash(String option) {
        note.archiveTrash(option);
    }

    public void validateNoteThroughSearch() {
        note.validateNoteThroughSearch();
    }

    public void changeLayout(String type) {
        note.changeLayout(type);
    }

    public void validateTypeOnHomepage(String type) {
        note.validateType(type);
    }

    public void validateSort(String filter) {
        note.validateSort(filter);
    }
}
