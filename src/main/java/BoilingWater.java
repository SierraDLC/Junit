
import java.util.Scanner;
public class BoilingWater {

    public static void main(String[] args) {

        int Number = inputBoil();
        System.out.println("Enter a number greater than 212: ");
    }

//
//        if(Number > 212){
//            System.out.println("Water is boiling!");
//        } else{
//            System.out.println("Water is not boiling!");
//        }

       public static int inputBoil() {
            Scanner input = new Scanner(System.in);
            return input.nextInt();
        }

        public static String Boiling (int Number) {
            if (Number > 212) {

            }
                return "The water! It boils!!!";
            }
          public  static  String notBoil( int Number) {
              if (Number < 212) {

              }
              return " it's not boiling";
          }
                public static String startBoil(int Number) {

                    if ( Number == 212) {

                    }
                    return "It's starting to boil!";
                }

        }

