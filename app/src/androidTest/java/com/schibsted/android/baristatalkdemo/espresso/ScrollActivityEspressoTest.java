package com.schibsted.android.baristatalkdemo.espresso;

import android.support.test.rule.ActivityTestRule;
import com.schibsted.android.baristatalkdemo.R;
import com.schibsted.android.baristatalkdemo.ScrollActivity;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class ScrollActivityEspressoTest {
  @Rule
  public ActivityTestRule<ScrollActivity> activityRule = new ActivityTestRule<>(ScrollActivity.class, true, false);

  @Test
  public void click_cancel() throws Exception {
    activityRule.launchActivity(null);

    onView(withId(R.id.button_cancel))
        .perform(click());
  }

  @Test
  public void click_ok_2() throws Exception {
    activityRule.launchActivity(null);

    onView(withId(R.id.button_ok))
        .perform(scrollTo(), click());
  }
}
