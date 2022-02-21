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

          // no income tax or national insurance
          double d = Double.parseDouble(name);
          if (d <= 12570 && d < 9564) {
            System.out.println("You don't pay any tax");
          }
          else if (d <= 12570 && d >= 9564 && d <= 50268){
            double first_ni = (d - 9564) * 0.12;
            double calc_first_ni = d - first_ni;
            System.out.println("Amount: £" + calc_first_ni);
          }
          else if (d > 12570 || d < 50270){
            double calc20 = (d - 12570) * 0.2;
            double calc20f = d - calc20;
            System.out.println("Amount: £" + calc20f);

          }
   
          // Printing the read line
          System.out.println("Amount: £" + d);
    } catch (Exception e) {

    }
  }
}