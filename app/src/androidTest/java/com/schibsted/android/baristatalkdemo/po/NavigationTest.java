package com.schibsted.android.baristatalkdemo.po;

import com.schibsted.android.baristatalkdemo.MainActivity;
import com.schibsted.spain.barista.BaristaRule;
import org.junit.Rule;
import org.junit.Test;

public class NavigationTest {

  @Rule
  public BaristaRule<MainActivity> activityRule = BaristaRule.create(MainActivity.class);

  @Test
  public void click_on_simple() throws Exception {
    activityRule.launchActivity();

    new MainActivityPageObject()
        .clickSimple()
        .clickMe();
  }
}
