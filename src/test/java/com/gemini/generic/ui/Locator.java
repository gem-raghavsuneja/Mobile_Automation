package com.gemini.generic.ui;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class Locator {
    public static By skipBtn = AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/btn_start_skip");
    public static By addNoteBtn = AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/main_btn1");
    public static By textForm= AppiumBy.xpath("//android.widget.ListView/android.widget.LinearLayout[1]");
    public static By chForm= AppiumBy.xpath("//android.widget.ListView/android.widget.LinearLayout[2]");
    public static By textArea = AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/edit_note");
    public static By titleArea = AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/edit_title");
    public static By noteList = AppiumBy.xpath("//android.widget.ListView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]");
    public static By longPressColor = AppiumBy.accessibilityId("Color");
    public static By colorChange = AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/txt5");
    public static By mainMenuDots = AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/main_btn3");
    public static By mainMenuColor = AppiumBy.xpath("//android.widget.ListView/android.widget.LinearLayout[1]");
    public static By blueColorMainMenu = AppiumBy.xpath("//android.widget.GridView/android.widget.LinearLayout[6]/android.widget.FrameLayout/android.widget.TextView");
    public static By leftSwipeMenu = AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/icon_nav");
    public static By settingsbtn = AppiumBy.xpath("//android.widget.ListView/android.widget.LinearLayout[7]/android.widget.TextView");
    public static By textEditorSetting = AppiumBy.xpath("//android.widget.TextView[@text='Text editor']/..");
    public static By colorDictChbx = AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]");
    public static By colorDictSearch = AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/dict_search_btn1");
    public static By pencilEditbtn = AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/edit_btn");
    public static By dialog_box = AppiumBy.id("android:id/message");
    public static By dialog_box_yesBtn = AppiumBy.id("android:id/button1");
    public static By archiveBtn = AppiumBy.accessibilityId("Archive");
    public static By delBtn = AppiumBy.accessibilityId("Delete");
    public static By archiveMenuOpt = AppiumBy.xpath("//android.widget.TextView[@text='Archive']");
    public static By trashMenuOpt = AppiumBy.xpath("//android.widget.TextView[@text='Trash Can']");
    public static By searchMenuOpt = AppiumBy.xpath("//android.widget.TextView[@text='Search']");
    public static By searchMenuInput = AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/edit_search");
    public static By defaultScreenSetting = AppiumBy.xpath("//android.widget.TextView[@text='Default Screen']/..");
    public static By defaultScreenOptions = AppiumBy.className("android.widget.CheckedTextView");
    public static By mainTitle = AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/main_title");
    public static By noteDate = AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/datetime_absolute");
    public static By sortMenu = AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/text_button_center");
    public static String sortOptions = "//android.widget.TextView[@text='<filter>']/..";






}
