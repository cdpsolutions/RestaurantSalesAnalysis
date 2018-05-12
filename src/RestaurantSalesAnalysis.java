//Christine Cullen Week 10 Project 3/8/2018

/*
 * This program reads an input text file that contains weekly sales figures from a restaurant.
 * The program than finds the total sales for each week, the average daily sales, total sales 
 * all weeks, average weekly sales, week of highest sales and week of lowest sales.  All values
 * are printed our to the console.
 */

//import the required packages
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

//define the class
public class RestaurantSalesAnalysis {

	// define the main method
	public static void main(String[] args) {
	
		//declare the variables
		final int WEEKDAYS = 7;
		final int WEEKS = 4;
		Scanner filereader = null;
		File file=null;
		int highestSales;
		int lowestSales;
		int weekSales;
		int totalSales;
		int week = 1;
		int highestSalesWeek = week;
		int lowestSalesWeek = week;
		
		//set text file 
		String fileName = "C:\\Users\\cdpso\\workspace\\RestaurantSalesAnalysis\\SalesData.txt";
		
		//file needs to be open in a try/catch block in case it can't be found or opened
		try
		{
			file = new File (fileName);
			
			//open a scanner object of text file
			filereader = new Scanner(file);
			
			//read text file starting line of sales
			String salesString = filereader.Line();
			
			//split the line with comma as delimiter
			String[] sales = salesString.split(",");
			
			//call getWeekSum() method to get sales
			weekSales = getWeekSum(sales);
			
			//initialize the values
			highestSales = weekSales;
			lowestSales = weekSales;
			totalSales = weekSales;
			
			//print weekly sales
			System.out.printf ("Week %d sales $%,.2f", week, weekSales/100);

			
			//print average weekly sales
			System.out.printf ("Average weekly sales of %d is $%,.2f", week, (weekSales/WEEKS)/100);
			
			//print average daily sales
			System.out.printf ("Average daily sales of %d is $%,.2f", week, (weekSales/WEEKDAYS)/100);
				//run while loop until the end of the file
				while (filereader.hasNextLine())
				{
					week++
					//read dales from text file
					salesString = filereader.nextLine();
					
					//use comma delimiter to split string
					sales = salesString.split(",");
					weekSales = getWeekSum(sales);
					
					//update highest sales and week number
					if(wkkeSales > highesSales)
					{
						highestSalesWeek = week;
						highestSales = weekSales;
					}
					
					//update lowest sales and week number
					if(weekSales)
					{
						LowestSalesWeek = week;
						LowestSales = weekSales;
					}
					
					//sum total sales for all weeks
					totalSales += weekSales;
					
					//print weekly sales
					System.out.printf("Week %d sales $%,.2f", week, weekSales/100);

					
					//print average sales
					System.out.printf("Average sales of week %d is $%,.2f", week, (weekSales/WEEKDAYS)/100);
					
					//print line Separator
					System.out.println ("==============");
				}
				//print total sales
				System.out.printf("Total Sales $%,.2f", totalSales/100);

				
				//print average total sales
				System.out.printf("Total Sales $%,.2f", (totalSales/week)100);
				

				//print highest sales
				System.out.printf("Highest sales week number: %d\n", highestSalesWeek;
				

				//print lowest sales
				System.out.printf("Lowest sales week number: %d\n", lowesttSalesWeek;
					
				}
				catch (FileNotFoundException e)
		{
		System.out.println("File does not exist");	
		}
	}

}
