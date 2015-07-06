package com.example.test;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class ProductCategory extends BaseExpandableListAdapter {

	private Context context;

	private static final String[] mProductCategoryList = ProductModel.getProductCategory();
	private static final String[][] mProductTypeList = ProductModel.getProductType();

	public ProductCategory(Context context) {
		// TODO Auto-generated constructor stub
		this.context = context;
	}

	// Gets the number of groups.
	@Override
	public int getGroupCount() {
		// TODO Auto-generated method stub
		return mProductCategoryList.length; // returns the length of ProductCategory 
	}

	// Gets the number of children in a specified group
	@Override
	public int getChildrenCount(int groupPosition) {
		// TODO Auto-generated method stub
		return mProductTypeList[groupPosition].length; // returns the length of ProductType in a ProductCategory
	}

	// Gets the data associated with the given group.
	@Override
	public Object getGroup(int groupPosition) {
		// TODO Auto-generated method stub
		return groupPosition;
	}

	//Gets the data associated with the given child within the given group.
	@Override
	public Object getChild(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return childPosition;
	}

	//Gets the ID for the group at the given position.
	@Override
	public long getGroupId(int groupPosition) {
		// TODO Auto-generated method stub
		return groupPosition;
	}

	//Gets the ID for the given child within the given group.
	@Override
	public long getChildId(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return 0;
	}

	//Indicates whether the child and group IDs are stable across changes to the underlying data.
	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	//Gets a View that displays the given group.
	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		TextView mProductCategoryTextView = new TextView(context);
		mProductCategoryTextView.setText(mProductCategoryList[groupPosition]);	
		
		mProductCategoryTextView.setPadding(40, 0, 0, 0);
		
		return mProductCategoryTextView;
	}

	//Gets a View that displays the data for the given child within the given group.
	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		TextView mProductTypeTextView = new TextView(context);
		mProductTypeTextView.setText(mProductTypeList[groupPosition][childPosition]);	
		mProductTypeTextView.setPadding(60, 0, 0, 0); // Set padding for child view
		
		return mProductTypeTextView;
	}

	//Whether the child at the specified position is selectable.
	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return true;
	}

}
