import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  double balance;

  public static void main(String[] args) {
    banking();
    
  }

  static void banking(){

    try {
          // Enter data using BufferReader
            BufferedReader reader = new BufferedReader(
              new InputStreamReader(System.in));
   
          // Reading data using readLine
          System.out.println("Insert number:");
          String name = reader.readLine();

          double d = Double.parseDouble(name);
          double d1 = d + 10;
   
          // Printing the read line
          System.out.println("Copy: " + d1);
    } catch (Exception e) {

    }
  }
}