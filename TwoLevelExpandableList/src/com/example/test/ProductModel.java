package com.example.test;

/*
 * Model which consists of the data which can be used and processed by Container to display on View.
 */
public class ProductModel {

	
	public static final String[] getProductCategory() {
		String[] mProductCategoryList = { "Electronics",
				"Home & Kitchen Needs", "Books & Media" };

		return mProductCategoryList;
	}

	public static final String[][] getProductType() {
		String[][] mProductTypeList = { { "Mobiles", "Laptops", "Television" },
				{ "Kitchen & dining", "LED & CFL Bulbs" },
				{ "Books", "Music", "Gaming" } };

		return mProductTypeList;
	}

	public static final String[][][] getProductItem() {
		String[][][] mProductItemList = {
				{ { "Motorola", "Samsung", "Htc" } },
				{ { "HP", "Lenovo", "Compaq" } },
				{ { "Lg", "Sansui", "Micromax", "Panasonic", "Sony", "Philips" } },
				{ { "Pressure Cookers", "Lunch Boxes", "Tupperware" } },
				{ { "Eveready", "Wipro", "Syska", "Osram" } },
				{ { "New Releases & Pre-Order", "BestSellers",
						"Academics & professional", "Self Help" } },
				{ { "Pre-Order", "Bollywood Music", "Devotional" } },
				{ { "New Releases", "PS3 Games" } } };

		return mProductItemList;
	}

}
