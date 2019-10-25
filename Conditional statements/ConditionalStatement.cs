using System;

namespace conditionalStatements
{
    class Program
    {
        static void Main(string[] args)
        {
            //Task 1
            //If a - even, return a * b, else return a + b

            /*int a = 2; 
              int b = 4; 
              int result = (a % 2 == 0) ? (a * b) : (a + b);
              Console.WriteLine(result);*/


            //Task 2
            //Determine to which quarter belongs to the point with coordinates (x, y)

            /*int x = 0;
              int y = 0;
              if (x > 0 && y > 0){
                  Console.WriteLine(1);
              }
              else if (x < 0 && y > 0){
                  Console.WriteLine(2);
              }
              else if (x < 0 && y < 0){
                  Console.WriteLine(3);
              }
              else if (x > 0 && y < 0){
                  Console.WriteLine(4);
              }
              else if (x == 0 && y != 0){
                 Console.WriteLine("Point lies on the x axis.");
              }
              else if (y == 0 && x != 0){
                 Console.WriteLine("Point lies on the y axis.");
              }
              else if (x == 0 && y == 0){
                 Console.WriteLine("Point lies at zero position.");
              }*/


            //Task 3
            //Determine the sums of only positive from three numbers

            /*int a = 0;
              int b = 6;
              int c = 7;
              if (a > 0 && b > 0 && c > 0){
                  Console.WriteLine(a + b + c);
              }
              else if (a > 0 && b > 0 && c <= 0){
                  Console.WriteLine(a + b);
              }
              else if (a > 0 && c > 0 && b <= 0){
                  Console.WriteLine(a + c);
              }
              else if (b > 0 && c > 0 && a <= 0){
                  Console.WriteLine(b + c);
              }
              else if (a > 0 && b <= 0 && c <= 0){
                  Console.WriteLine(a);
              }
              else if (a <= 0 && b > 0 && c <= 0){
                  Console.WriteLine(b);
              }
              else if (a <= 0 && b <= 0 && c > 0){
                  Console.WriteLine(c);
              }*/


            //Task 4
            //Count expression max((a * b * c),(a + b + c)) + 3

            /*int a = 0;
              int b = 2;
              int c = 3;

              int sum = a + b + c;
              int multi = a * b * c;
              if (sum > multi){
                  Console.WriteLine(sum + 3);
              }
              else{
                  Console.WriteLine(multi + 3);
              }*/

              
            //Task 5
            //Determining grade by rating
              
            /*int rating = 100;
              if(rating >= 0 && rating <= 19){
                  Console.WriteLine("F");
              }else if(rating > 19 && rating <= 39){
                  Console.WriteLine("E");
              }else if(rating > 39 && rating <= 59){
                  Console.WriteLine("D");
              }else if (rating > 59 && rating <= 74){
                  Console.WriteLine("C");
              }else if (rating > 74 && rating <= 89){
                  Console.WriteLine("B");
              }else if (rating > 90 && rating <= 100){
                  Console.WriteLine("A");
              }*/
        }
    }
}
