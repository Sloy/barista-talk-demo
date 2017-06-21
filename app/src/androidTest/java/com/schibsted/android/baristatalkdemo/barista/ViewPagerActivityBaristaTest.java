package com.schibsted.android.baristatalkdemo.barista;

import com.schibsted.android.baristatalkdemo.R;
import com.schibsted.android.baristatalkdemo.ViewPagerActivity;
import com.schibsted.spain.barista.BaristaRule;
import org.junit.Rule;
import org.junit.Test;

import static com.schibsted.spain.barista.BaristaAssertions.assertDisplayed;
import static com.schibsted.spain.barista.BaristaClickActions.click;

public class ViewPagerActivityBaristaTest {
  @Rule
  public BaristaRule<ViewPagerActivity> activityRule = BaristaRule.create(ViewPagerActivity.class);

  @Test
  public void clicking_shows_thanks() throws Exception {
    activityRule.launchActivity(null);

    click(R.id.click_me_button);

    assertDisplayed("Thanks!");
  }
}
