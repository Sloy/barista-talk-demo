package com.schibsted.android.baristatalkdemo.barista;

import com.schibsted.android.baristatalkdemo.R;
import com.schibsted.android.baristatalkdemo.SimpleActivity;
import com.schibsted.spain.barista.BaristaRule;
import org.junit.Rule;
import org.junit.Test;

import static com.schibsted.spain.barista.BaristaAssertions.assertDisplayed;
import static com.schibsted.spain.barista.BaristaClickActions.click;

public class SimpleActivityBaristaTest {

  @Rule
  public BaristaRule<SimpleActivity> activityRule = BaristaRule.create(SimpleActivity.class);

  @Test
  public void clicking_shows_thanks() throws Exception {
    activityRule.launchActivity();

    click(R.id.click_me_button);

    assertDisplayed("Thanks!");
  }
}
