package com.schibsted.android.baristatalkdemo.barista;

import com.schibsted.android.baristatalkdemo.DetailActivity;
import com.schibsted.spain.barista.BaristaRule;
import org.junit.Rule;
import org.junit.Test;

import static com.schibsted.spain.barista.BaristaAssertions.assertDisplayed;

public class DetailActivityBaristaTest {

  @Rule
  public BaristaRule<DetailActivity> activityRule = BaristaRule.create(DetailActivity.class);

  @Test
  public void rafa_name_is_displayed() throws Exception {
    activityRule.launchActivity();

    assertDisplayed("Rafa");
  }
}