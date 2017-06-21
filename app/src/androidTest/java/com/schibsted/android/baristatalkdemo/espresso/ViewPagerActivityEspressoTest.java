package com.schibsted.android.baristatalkdemo.espresso;

import android.support.test.rule.ActivityTestRule;
import com.schibsted.android.baristatalkdemo.R;
import com.schibsted.android.baristatalkdemo.ViewPagerActivity;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class ViewPagerActivityEspressoTest {
  @Rule
  public ActivityTestRule<ViewPagerActivity> activityRule = new ActivityTestRule<>(ViewPagerActivity.class, true, false);

  @Test
  public void clicking_shows_thanks() throws Exception {
    activityRule.launchActivity(null);

    onView(withId(R.id.click_me_button)).perform(click());

    onView(withText("Thanks!"))
        .check(matches(isDisplayed()));
  }

  /*






















   */
  @Test
  public void clicking_shows_thanks_2() throws Exception {
    activityRule.launchActivity(null);

    onView(allOf(withId(R.id.click_me_button), isDisplayed()))
        .perform(click());

    onView(allOf(withText("Thanks!"), isDisplayed()))
        .check(matches(isDisplayed()));
  }
}
