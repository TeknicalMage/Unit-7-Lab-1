//Name Here
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args)
	{
		main();
	
	}
	
	public static void main() {	
		ArrayList<Country> CountryList = new ArrayList<Country>();
		Scanner infile = null;
	     try{
	        infile = new Scanner(new File("CountryData.txt")); 
	     }
	     catch(FileNotFoundException e){
	        //System.out.println("Error: MatrixValues.txt not found. Exiting program.");
	        System.exit(0);
	       
	     }
	     while(infile.hasNextLine()) {
	    	 
//Method for Adding Strings	    		 
	    			 String name = infile.nextLine();
	    			 String capital = infile.nextLine();
	    			 int population = infile.nextInt();
	    			 infile.nextLine();
	    			 CountryList.add(new Country(name, capital, population));
	    			 	    		 
	     }
	     //System.out.println(CountryList);
	     
	}
	//Insertion Sort
	public static void insertionSort(int[] CountryList)
	{
	     for (int x=1; x< CountryList.length; x++)
	     {
	          int key = CountryList[x];
	          int j = x - 1;      			
	          while (j>=0 && CountryList[j] > key)  	
	           {
	        	  CountryList[j+1] = CountryList[j];       		
	                    j -- ;
	          }				
	          CountryList[j+1] = key;		
	     }
	}

	
	
}




