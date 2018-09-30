// Azizul Hakim    

package week04;
import java.io.*;    
import java.util.*; 

public class BabyNamePopularityRanking 
{
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		Object[] boyNames = new Object[10];
		Object[] girlNames = new Object[10];
		int i;
		
		for(i = 0; i < 10; i++)
			boyNames[i] = new HashMap<String, Integer>();
		
		for(i = 0; i < 10; i++)
			girlNames[i] = new HashMap<String, Integer>();
		

		File file = new File("C:\\temp\\1.txt");
		Scanner fileScanner = new Scanner(file);
		
		HashMap<String, Integer> boyNamesMap = (HashMap<String,Integer>) boyNames[0];
		HashMap<String, Integer> girlNamesMap = (HashMap<String,Integer>) girlNames[0];
		
		
		while(fileScanner.hasNext())
		{
			String line = fileScanner.nextLine();
			String[] words = line.split("\t");
			
			int rank = Integer.parseInt(words[0].trim());
			String boyName = words[1];
			String girlName = words[3].trim();
			
			boyNamesMap.put(boyName, rank);
			girlNamesMap.put(girlName, rank);
					 
		}
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter boy name: ");
		String boyName = input.nextLine();
		
		System.out.println("Enter girl name: ");
		String girlName = input.nextLine();
		
		System.out.println();
		System.out.println("The rank of " + boyName + " is " + boyNamesMap.get(boyName));
		System.out.println("The rank of " + girlName + " is " + girlNamesMap.get(girlName));
			
		fileScanner.close();
	}
		
}
	
