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
          if (d <= 9564) {
            System.out.println("You don't pay any tax");
          }
          // National insurance only - under over 9564 but under 12570
          else if (d <= 12570 && d >= 9564 && d <= 50268){
            double first_ni = (d - 9564) * 0.12;
            double calc_first_ni = d - first_ni;
            System.out.println("Amount: £" + calc_first_ni);
          }
          // NI & Income tax between 12570 & 50268
          else if (d > 12570 && d >= 9564 && d <= 50268){
            double first_ni = (d - 9564) * 0.12;
            double first_income = (d - 12570) * 0.20;
            double calc_final = (d - first_income) - first_ni;
            System.out.println("Amount: £" + calc_final);
          }
          // NI & Income tax between 50269 & 150,000 
          else if (d > 50269 &&  d <= 150000){
            double ni_initial = d - 9567;
            double ni_first = 0.12 * ni_initial;
            double ni_second = (d - ni_first) * 0.02;
            double first_income = (d - 12570) * 0.40;
            double calc_final = (d - first_income) - ni_second;
            System.out.println("Amount: £" + first_income);
          }
   
          // Printing the read line
          System.out.println("Amount: £" + d);
    } catch (Exception e) {

    }
  }
}