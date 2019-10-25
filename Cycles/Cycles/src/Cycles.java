public class Cycles {

    public static void main(String[] args) {

        //Task 1
        //Find sum of even numbers and their quantity in the range from 1 to 99

            /*int evenSum = 0;
              int quantity = 0;
              for (int i = 2; i < 100; i++){
                  if (i % 2 == 0){
                      evenSum += i;
                      quantity++;
                  }
              }
        System.out.println("Sum: " + evenSum + " Quantity: " + quantity);*/


        //Task 2
        //Verify number if prime

           /* int n = 97;
                int i = 2;
                int a = 0;
                int b = 0;

            while (i < n){
                if (n % i != 0){
                    a++;
                }
                else if (n % i == 0){
                    b++;
                }
                i++;
            }
              String result = (b == 0) ? "Number " + n + " is prime." : "Number " + n + " is compound.";
              System.out.println(result);*/


        //Task 3
        //Find the sqrt of a natural number up to an integer

            /*int x = 8;
            int num = 1;
            int rez = 0;

            while (x > 0){
                 x -= num;
                 num += 2;
                 rez += (x < 0) ? 0 : 1;
            }
            System.out.println("Nearby integer to radix is " + rez);*/


        //Task 4
        //Calculate factorial of a number

             /* int n = 5;
              int result = 1;
              for (int i = 1; i <= n; i++){
                result = result * i;
              }
        System.out.println("Factorial of number " + n + " is " + result);*/


        //Task 5
        //Calculate sum of digits of given number

            /*int n = 1234;
                int sum = 0;
                int tmp;
                while (n!=0){
                    tmp = n % 10;
                    n = (n - tmp) / 10;
                    sum += tmp;
              }
             System.out.println("Sum of digits is " + sum);*/


        //Task 6
        //Reverse number
              /*int n = 1234;
              String reverse = "";
              int tmp;
              while (n!=0){
                  tmp = n % 10;
                  n = (n - tmp) / 10;
                  reverse += tmp;
              }

              System.out.println(reverse);*/

    }
}
