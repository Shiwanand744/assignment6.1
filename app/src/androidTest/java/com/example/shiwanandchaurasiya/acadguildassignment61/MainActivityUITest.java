package com.example.shiwanandchaurasiya.acadguildassignment61;

import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityUITest {
    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void clickLoginButton(){
        String userEmail = "shiwanand744@gmail.com";
        String pass = "shiwanand";
        onView(withId(R.id.user_email)).perform(typeText(userEmail));
        closeSoftKeyboard();
        onView(withId(R.id.user_pass)).perform(typeText(pass));
        closeSoftKeyboard();
        onView(withId(R.id.logIn_btn)).perform(click());
    }
}