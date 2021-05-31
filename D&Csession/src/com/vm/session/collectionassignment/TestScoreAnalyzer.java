package com.vm.session.collectionassignment;

import java.util.LinkedList;
import java.util.Scanner;

public class TestScoreAnalyzer
{
	private static int runs;

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		ScoreAnalyzer scoreanalyzer=new ScoreAnalyzer(linkedList);
		while(true)
		{
			System.out.println("Enter runs");
			int runs;
			runs=scanner.nextInt();
			if(runs==-1)
			{
				break;
			}
			else
			{
				scoreanalyzer.addRunsToList(runs);
			}
		}
		System.out.println("Runs Scored : "+scoreanalyzer.displayRuns());
		
		//double rr=scoreanalyzer.CalcRunRate(runs);
		System.out.println("Runs Rate : "+scoreanalyzer.CalcRunRateOfTeam(runs));
		
		//int lowest=scoreanalyzer.lowestRunsScored(runs);
		System.out.println("Lowest Runs : "+scoreanalyzer.lowestRuns(0));
		
		System.out.println("Count Of Players Who Batted : "+scoreanalyzer.runsData.size());
		scanner.close();
	}


}
