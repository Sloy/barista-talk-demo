package com.schibsted.android.baristatalkdemo.espresso;

import android.support.test.rule.ActivityTestRule;
import com.schibsted.android.baristatalkdemo.DetailActivity;
import com.schibsted.android.baristatalkdemo.R;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class DetailActivityEspressoTest {

  @Rule
  public ActivityTestRule<DetailActivity> activityRule = new ActivityTestRule<>(DetailActivity.class, true, false);

  @Test
  public void rafa_name_is_displayed() throws Exception {
    activityRule.launchActivity(null);

    onView(withText("Rafa")).check(matches(isDisplayed()));
  }

  /*




























   */
  @Test
  public void rafa_name_is_displayed_2() throws Exception {
    activityRule.launchActivity(null);

    onView(allOf(withText("Rafa"), withId(R.id.name_label)))
        .check(matches(isDisplayed()));

    //onView(withId(R.id.name_label)).check(matches(isDisplayed()));
    //onView(withId(R.id.name_label)).check(matches(withText("Rafa")));
  }
}
