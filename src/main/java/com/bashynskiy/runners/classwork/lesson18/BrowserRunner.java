package com.bashynskiy.runners.classwork.lesson18;

import com.bashynskiy.app.classwork.lesson18.Browser;

/**
 * Created by testu on 5/23/2017.
 */
public class BrowserRunner {
    public static void main(String[] args) {
        Browser browser = new Browser();
        browser.invoke("Chrome");
        browser.invoke("Opera", 10);
    }
}
