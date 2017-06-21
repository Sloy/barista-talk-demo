package com.schibsted.android.baristatalkdemo.po;

import com.schibsted.android.baristatalkdemo.R;

import static com.schibsted.spain.barista.BaristaClickActions.click;

public class MainActivityPageObject {

  public SimpleActivityPageObject clickSimple() {
    click(R.id.button_simple);
    return new SimpleActivityPageObject();
  }

  public void clickDetail() {
    click(R.id.button_detail);
  }

  public void clickViewPager() {
    click(R.id.button_viewpager);
  }

  public void clickScroll() {
    click(R.id.button_scroll);
  }
}
