package com.schibsted.android.baristatalkdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ClickMeFragment extends Fragment {
  private static final String ARG_SECTION_NUMBER = "section_number";

  public ClickMeFragment() {
  }

  public static ClickMeFragment newInstance(int sectionNumber) {
    ClickMeFragment fragment = new ClickMeFragment();
    Bundle args = new Bundle();
    args.putInt(ARG_SECTION_NUMBER, sectionNumber);
    fragment.setArguments(args);
    return fragment;
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    final View rootView = inflater.inflate(R.layout.fragment_view_pager, container, false);
    TextView textView = (TextView) rootView.findViewById(R.id.section_label);
    if (getArguments() != null) {
      textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
    }
    rootView.findViewById(R.id.click_me_button).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        rootView.findViewById(R.id.thanks_label).setVisibility(View.VISIBLE);
      }
    });

    return rootView;
  }
}
