package com.home_work_8_Collections_1_pract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class AppCollections_1_pract
{
	public static void main(String[] args) throws IOException
	{

		List<Integer> ll = new LinkedList<Integer>();

		BufferedReader br_1 = new BufferedReader(new InputStreamReader(System.in));

		CreateCollection_pract.CreateValuesList(ll, br_1);
		CreateCollection_pract.showCollection(ll);

		ll = CreateCollection_pract.CollectionKeepPositionsMoreThan(ll, 5);
		CreateCollection_pract.showCollection(ll);

		CreateCollection_pract.CollectionKeepValuesLessThan(ll, 20);
		CreateCollection_pract.showCollection(ll);

		br_1.close();

	}
}