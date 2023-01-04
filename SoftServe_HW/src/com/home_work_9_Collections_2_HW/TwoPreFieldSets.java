package com.home_work_9_Collections_2_HW;

import java.util.Set;

public class TwoPreFieldSets
{
	protected static Set<String> UnionTwoSets(Set<String> Set1, Set<String> Set2)
	{
		Set1.addAll(Set2);
		return Set1;
		
	}
	
	protected static Set<String> IntersectionTwoSets(Set<String> Set1, Set<String> Set2)
	{
		Set1.retainAll(Set2);
		return Set1;
		
	}
}