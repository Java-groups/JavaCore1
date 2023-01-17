package com.home_work_8_Collections_1_HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class AppCollections_1
{
	public static void main(String[] args) throws IOException
	{
		List<Integer> ll = new LinkedList<Integer>();
		List<Integer> ll_direct = new LinkedList<Integer>();
		List<Integer> ll_reverse = new LinkedList<Integer>();


		try(BufferedReader br_1 = new BufferedReader(new InputStreamReader(System.in)))
		{
			CreateCollection.CreateValuesList(ll, br_1);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		CreateCollection.showCollection(ll);

		CreateCollection.addThreeValuesBeforeNeg(ll);
		CreateCollection.showCollection(ll);

		CreateCollection.insesrtZeroBetweenSign(ll);
		CreateCollection.showCollection(ll);

		System.out.println("Min value: " + CreateCollection.CollectionGetMin(ll) + ";");
		System.out.println("Max value: " + CreateCollection.CollectionGetMax(ll) + ";");

		ll_direct = CreateCollection.copyElements(ll, 10);
		ll_reverse = CreateCollection.copyReverseElements(ll_direct);

		CreateCollection.showCollection(ll_direct);
		CreateCollection.showCollection(ll_reverse);

		CreateCollection.removeLastEvenElement(ll);
		CreateCollection.showCollection(ll);

		CreateCollection.removeFirstMin(ll);
		CreateCollection.showCollection(ll);

	}
}