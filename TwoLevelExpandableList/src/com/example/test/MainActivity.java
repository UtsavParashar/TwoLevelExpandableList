package com.example.test;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupExpandListener;

/*
 * Class to start the activity and set adapter over the ExpandableListView.
 * Creating 2 Level list because it the right use of it.
 * http://developer.android.com/reference/android/widget/ExpandableListView.html 
 * (A view that shows items in a vertically scrolling two-level list).
 */
public class MainActivity extends ActionBarActivity {

	private ExpandableListView mExpandableListView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mExpandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
		mExpandableListView.setAdapter(new ProductCategory(this));
		mExpandableListView
				.setOnGroupExpandListener(new OnGroupExpandListener() {
					int previousGroup = -1;

					@Override
					public void onGroupExpand(int groupPosition) {
						// TODO Auto-generated method stub
						if (groupPosition != previousGroup)
							mExpandableListView.collapseGroup(previousGroup);
						previousGroup = groupPosition;
					}
				});
	}

}
