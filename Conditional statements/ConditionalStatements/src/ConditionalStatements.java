public class ConditionalStatements {

    public static void main(String[] args) {

        //Task 1
        //If a - even, return a * b, else return a + b

           /* int a = 2;
              int b = 4;
              int result = (a % 2 == 0) ? (a * b) : (a + b);
              System.out.println(result);*/


        //Task 2
        //Determine to which quarter belongs to the point with coordinates (x, y)

       /* int x = 0;
        int y = 0;
        if (x > 0 && y > 0){
            System.out.println(1);
        }
        else if (x < 0 && y > 0){
            System.out.println(2);
        }
        else if (x < 0 && y < 0){
            System.out.println(3);
        }
        else if (x > 0 && y < 0){
            System.out.println(4);
        }
        else if (x == 0 && y != 0){
            System.out.println("Point lies on the x axis.");
        }
        else if (y == 0 && x != 0){
            System.out.println("Point lies on the y axis.");
        }
        else if (x == 0 && y == 0){
            System.out.println("Point lies at zero position.");
        }*/


        //Task 3
        //Determine the sums of only positive from three numbers

            /*int a = 0;
              int b = 6;
              int c = 7;
              if (a > 0 && b > 0 && c > 0){
                  System.out.println(a + b + c);
              }
              else if (a > 0 && b > 0 && c <= 0){
                  System.out.println(a + b);
              }
              else if (a > 0 && c > 0 && b <= 0){
                  System.out.println(a + c);
              }
              else if (b > 0 && c > 0 && a <= 0){
                  System.out.println(b + c);
              }
              else if (a > 0 && b <= 0 && c <= 0){
                  System.out.println(a);
              }
              else if (a <= 0 && b > 0 && c <= 0){
                  System.out.println(b);
              }
              else if (a <= 0 && b <= 0 && c > 0){
                  System.out.println(c);
              }*/


        //Task 4
        //Count expression max((a * b * c),(a + b + c)) + 3

            /*int a = 0;
              int b = 2;
              int c = 3;

              int sum = a + b + c;
              int multi = a * b * c;
              if (sum > multi){
                  System.out.println(sum + 3);
              }
              else{
                  System.out.println(multi + 3);
              }*/


        //Task 5
        //Determining grade by rating

            /*int rating = 100;
              if(rating >= 0 && rating <= 19){
                  System.out.println("F");
              }else if(rating > 19 && rating <= 39){
                  System.out.println("E");
              }else if(rating > 39 && rating <= 59){
                  System.out.println("D");
              }else if (rating > 59 && rating <= 74){
                  System.out.println("C");
              }else if (rating > 74 && rating <= 89){
                  System.out.println("B");
              }else if (rating > 90 && rating <= 100){
                  System.out.println("A");
              }*/

    }

}
