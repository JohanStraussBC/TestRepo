package BusinessLayer;
import java.io.*;


public class Main 
{

    public static void main(String[] args) 
    
    {
            try 
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\tegue\\Desktop\\Test\\output.txt"));
            bw.write("Karen");
            bw.write("Chad");
            bw.write("Peter");

            bw.close();

            System.out.println("Printed to file: ");
        } 
        
        catch (Exception ex) 
        {
            return;
        }
    }


}


    









