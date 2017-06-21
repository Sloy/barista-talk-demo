package com.schibsted.android.baristatalkdemo.barista;

import com.schibsted.android.baristatalkdemo.R;
import com.schibsted.android.baristatalkdemo.ScrollActivity;
import com.schibsted.spain.barista.BaristaAssertions;
import com.schibsted.spain.barista.BaristaRule;
import org.junit.Rule;
import org.junit.Test;

import static com.schibsted.spain.barista.BaristaClickActions.click;

public class ScrollActivityBaristaTest {
  @Rule
  public BaristaRule<ScrollActivity> activityRule = BaristaRule.create(ScrollActivity.class);

  @Test
  public void click_cancel() throws Exception {
    activityRule.launchActivity(null);

    click(R.id.button_cancel);
  }

  @Test
  public void click_ok() throws Exception {
    activityRule.launchActivity(null);
BaristaAssertions.assertEnabled();
    click(R.id.button_ok);
  }
}
