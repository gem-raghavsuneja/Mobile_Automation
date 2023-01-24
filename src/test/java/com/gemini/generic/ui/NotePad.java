package com.gemini.generic.ui;

import com.gemini.generic.MobileAction;
import com.gemini.generic.MobileDriverManager;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NotePad extends PageObject {
    public AppiumDriver driver = MobileDriverManager.getAppiumDriver();


    public void appLaunch() {
        System.out.println("Application launched");
        MobileAction.click(Locator.skipBtn);

    }

    public void validate() {

        List<WebElement> noteList = driver.findElements(Locator.noteList);
        List<String> notes = new ArrayList<>();
        for (WebElement webElement : noteList) {
            notes.add(webElement.getText());
        }
        for (int i = 0; i < notes.size(); i++) {
            if (!notes.contains("form" + Integer.parseInt(String.valueOf(i + 1))))
                System.out.println("form" + Integer.parseInt(String.valueOf(i + 1)) + " not found");

        }

    }

    public void addNote(String text, String check) {
        int numText = Integer.parseInt(text);
        int numCheck = Integer.parseInt(check);
        int count = numCheck + numText;
        for (int i = 1; i <= count; i++) {
            MobileAction.click(Locator.addNoteBtn);
            if (numText > 0) {
                MobileAction.click(Locator.textForm);
                numText--;
            } else if (numCheck > 0) {
                MobileAction.click(Locator.chForm);
                numCheck--;
            }
            MobileAction.typeText(Locator.titleArea, "form" + i);
            driver.navigate().back();
            driver.navigate().back();
            driver.navigate().back();
        }
    }

    public void colorchange() {
        List<WebElement> noteList = driver.findElements(Locator.noteList);
        String firstElement = noteList.get(0).getText();
        LongPressOptions longpress = new LongPressOptions();
        TouchAction ac = new TouchAction((PerformsTouchActions) driver);
        longpress.withDuration(Duration.ofSeconds(1)).withElement(ElementOption.element(noteList.get(0)));
        ac.longPress(longpress).release().perform();

        MobileAction.click(Locator.longPressColor);
        MobileAction.click(Locator.colorChange);
        MobileAction.click(Locator.mainMenuDots);
        MobileAction.click(Locator.mainMenuColor);
        MobileAction.click(Locator.blueColorMainMenu);
        noteList = driver.findElements(Locator.noteList);
        List<String> notes = new ArrayList<>();
        for (WebElement webElement : noteList) {
            notes.add(webElement.getText());
        }
        if (notes.contains(firstElement))
            System.out.println("Element Present");
        else
            System.out.println("Not Present");
        MobileAction.waitSec(5);
    }

    public void colorDict() {
        MobileAction.click(Locator.leftSwipeMenu);
        MobileAction.click(Locator.settingsbtn);
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Text editor\"));"));
        MobileAction.click(Locator.textEditorSetting);
        MobileAction.click(Locator.colorDictChbx);
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        List<WebElement> noteList = driver.findElements(Locator.noteList);
        MobileAction.click(noteList.get(0));
        MobileAction.click(Locator.pencilEditbtn);
        MobileAction.click(Locator.colorDictSearch);
        MobileAction.waitSec(1);
        String text = MobileAction.getElementText(Locator.dialog_box);
        System.out.println(text);
        if (text.contains("Download ColorDict"))
            System.out.println("Message verified successfully");
        else System.out.println("Message not Found: " + text);
        MobileAction.waitSec(5);
    }

    public void archiveTrash(String option) {
        List<WebElement> noteList = driver.findElements(Locator.noteList);
        String element = noteList.get(0).getText();
        LongPressOptions longPress = new LongPressOptions();
        TouchAction ac = new TouchAction((PerformsTouchActions) driver);
        longPress.withDuration(Duration.ofSeconds(1)).withElement(ElementOption.element(noteList.get(0)));
        ac.longPress(longPress).perform().release();
        if (option.equalsIgnoreCase("archive")) {
            MobileAction.click(Locator.archiveBtn);
        } else {
            MobileAction.click(Locator.delBtn);
        }
        String msg = MobileAction.getElementText(Locator.dialog_box);
        if (msg.contains(option.toLowerCase())) {
            System.out.println("Message Verified Successfully");
            MobileAction.click(Locator.dialog_box_yesBtn);
            MobileAction.click(Locator.leftSwipeMenu);
            if (option.equalsIgnoreCase("archive"))
                MobileAction.click(Locator.archiveMenuOpt);
            else
                MobileAction.click(Locator.trashMenuOpt);
            noteList = driver.findElements(Locator.noteList);
            for (WebElement elements : noteList)
                if (elements.getText().equals(element))
                    System.out.println("Element found: " + element);
        } else
            System.out.println("Wrong Message print : " + msg);


    }

    public void validateNoteThroughSearch() {
        List<WebElement> noteListMain = driver.findElements(Locator.noteList);
        List<String> noteListmain = new ArrayList<>();
        MobileAction.click(Locator.leftSwipeMenu);
        MobileAction.click(Locator.searchMenuOpt);
        for (WebElement note : noteListMain)
            noteListmain.add(note.getText());
        for (String note : noteListmain) {
            MobileAction.typeText(Locator.searchMenuInput, note);
            List<WebElement> noteListSearch = driver.findElements(Locator.noteList);
            for (WebElement noteSearch : noteListSearch) {
                if (noteSearch.getText().equals(note))
                    System.out.println("Note Found: " + note);
            }
            MobileAction.clearText(Locator.searchMenuInput);
        }


    }

    public void changeLayout(String type) {
        MobileAction.click(Locator.leftSwipeMenu);
        MobileAction.click(Locator.settingsbtn);
        MobileAction.scrollToElement("Default Screen", false);
        MobileAction.click(Locator.defaultScreenSetting);
        List<WebElement> defaultScreenOpt = driver.findElements(Locator.defaultScreenOptions);
        for (WebElement option : defaultScreenOpt) {
            if (option.getText().equalsIgnoreCase(type)) {
                MobileAction.click(option);
                break;
            }
        }

    }

    public void validateType(String type) {
        MobileAction.navigateBack();
        MobileAction.navigateBack();
        ((AndroidDriver) driver).closeApp();
        try {
            ((AndroidDriver) driver).runAppInBackground(Duration.ofSeconds(5));
        } catch (Exception e) {
        }

        ((AndroidDriver) driver).activateApp("com.socialnmobile.dictapps.notepad.color.note");
        String title = MobileAction.getElementText(Locator.mainTitle);
        if (title.equalsIgnoreCase(type))
            System.out.println("Successfully verified title: " + title);
    }

    public void validateSort(String filter) {
        List<WebElement> noteList = driver.findElements(Locator.noteList);
        List<String> noteName = new ArrayList<>();
        for (WebElement note : noteList) {
            noteName.add(note.getText());
        }
        if (filter.equalsIgnoreCase("alphabetically")) {
            MobileAction.click(Locator.sortMenu);
            MobileAction.click(AppiumBy.xpath(Locator.sortOptions.replace("<filter>",filter)));
            Collections.sort(noteName);
            noteList = driver.findElements(Locator.noteList);
            for(int i = 0; i< noteList.size();i++){
                if(!noteList.get(i).getText().equalsIgnoreCase(noteName.get(i))){
                    System.out.println("Element don't match: "+ noteList.get(i)+"--"+noteName.get(i));
                }
            }
        }

    }
}
