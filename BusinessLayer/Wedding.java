package BusinessLayer;
import java.util.*;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.io.*;


public class Wedding implements Event

{
    String eventType = "Wedding";
    String eventDateandTime;
    String eventAddress;
    int eventNumPeople;
    
    //menu
    String starters;
    String mainCourse;
    String Desert;



	@Override

	public void getEventDetails() 
    
    {
		
        Scanner scn = new Scanner(System.in);
        System.out.println("When(Date & Time)");
        eventDateandTime = scn.nextLine();

        System.out.println("WhereAddress)");
        eventAddress = scn.nextLine();

        System.out.println("How many people?");
        eventNumPeople = scn.nextInt();


        System.out.println("==================================Menu:=============================");
        System.out.println("What starters would you like?");
        starters = scn.nextLine();

        System.out.println("What would you like for the main course?");
        mainCourse = scn.nextLine();

        System.out.println("What would you like for desert?");
        Desert = scn.nextLine();

        try 
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\tegue\\Desktop\\Test\\output.txt"));
            bw.write("Karen");
            bw.write("Chad");
            bw.write("Peter");

            bw.close();
        } 
        
        catch (Exception ex) 
        {
            return;
        }
        
      

		
	}
}
