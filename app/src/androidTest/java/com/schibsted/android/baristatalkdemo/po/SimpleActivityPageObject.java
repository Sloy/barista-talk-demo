package com.schibsted.android.baristatalkdemo.po;

import com.schibsted.android.baristatalkdemo.R;

import static com.schibsted.spain.barista.BaristaClickActions.click;

public class SimpleActivityPageObject {

  public SimpleActivityPageObject clickMe() {
    click(R.id.click_me_button);
    return this;
  }
}
