package com.vm.session.collectionassignment;

import java.util.Collections;
import java.util.LinkedList;

public class ScoreAnalyzer 
{
	LinkedList<Integer> runsData;

	public ScoreAnalyzer(LinkedList<Integer> runsData) {
		super();
		this.runsData = runsData;
	}
	
	public void addRunsToList(int runs)
	{
		runsData.add(runs);
	}
	
	public int lowestRuns(int runs)
	{
		Collections.sort(runsData);
		return runsData.get(0);
	}
	public LinkedList<Integer> displayRuns()
	{
		return runsData;
	}
	
	public double CalcRunRateOfTeam(int runs)
	{
		double runrate=0;
		int truns=0;
		int overs=50;
		for(Integer i:runsData)
		{
			truns=truns+i;
		}
		runrate=truns/overs;
		return runrate;
	}


}
