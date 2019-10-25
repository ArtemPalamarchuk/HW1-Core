using System;
using System.Collections.Generic;

namespace functions
{
    class Functions
    {
        static void Main(string[] args)
        {

            //Task 1
            //Get day name by day number

            /*string [] days = { "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье" };

              string day = "";         
              string GetDay(int dayNumber){
                  for (int i = 0; i <= days.Length; i++){
                    if (i == dayNumber){
                        day = days[i - 1];
                    }
                    else {
                        continue;
                    }   
                  }
                  return day;
              }
              Console.WriteLine(GetDay(5));*/


            //Task 4
            //Get distance between 2 points on cartesian coordinate system  

            /*double distance(int x1, int x2, int y1, int y2){
                  int firstKat = Math.Abs(x1 - x2);
                  int secondKat = Math.Abs(y1 - y2);
                  double dist = Math.Sqrt((firstKat * firstKat) + (secondKat * secondKat));
                  string strNumber = dist.ToString("N2");
                  dist = Convert.ToDouble(strNumber);
                  return dist;
            }

            Console.WriteLine(distance(1, 5, 4, 2));*/


            //Task 3-6
            //Get number by words

            /*Dictionary<string, int> numbers = new Dictionary<string, int>(){
                { "ноль", 0 }, { "один", 1 }, { "одна", 1 }, { "два", 2 }, { "две", 2 }, { "три", 3 }, { "четыре", 4 }, { "пять", 5 }, { "шесть", 6 }, { "семь", 7 }, { "восемь", 8 }, { "девять", 9 },
                { "десять", 10 }, { "одинадцать", 11 }, { "двенадцать", 12 }, { "тринадцать", 13 }, { "четырнадцать", 14 }, { "пятнадцать", 15 },{ "шестнадцать", 16 }, { "семнадцать", 17 },
                { "восемнадцать", 18 }, { "девятнадцать", 19 }, { "двадцать", 20 }, { "тридцать", 30 }, { "сорок", 40 }, { "пятьдесят", 50 }, { "шестьдесят", 60 }, { "семдесят", 70 },
                { "восемьдесят", 80 },{ "девяносто", 90 }, { "сто", 100 }, { "двесте", 200 }, { "триста", 300 }, { "четыреста", 400 }, { "пятьсот", 500 },{ "шесть сот", 600 }, { "семьсот", 700 },
                { "восемьсот", 800 }, { "девятьсот", 900 }, { "тысяч", 1000 }, { "тысяча", 1000 }, { "тысячи", 1000 }, { "миллион", 1000000 }, { "миллиона", 1000000 }, { "миллионов", 1000000 },
                { "миллиард", 1000000000 }, { "миллиарда", 1000000000 }, { "миллиардов", 1000000000 }
            };
            
            long getNumber(string str){
                string[] strlist = str.Split(' ');
                List<string> arr = new List<string>();
                long sum = 0;
                long sum1 = 0;
                
                for (int i = 0; i < strlist.Length; i++){
                    arr.Add(strlist[i]);
                    if (!(arr[i].Contains("милли") || arr[i].Contains("тысяч"))){
                        sum += numbers[arr[i]];
                    }else {
                        sum *= numbers[arr[i]];
                        sum1 += sum;
                        sum = 0;
                    }
                }
                sum1 += sum;
                return sum1;
            } 
            string b = "пять миллиардов сто двадцать один миллион четыреста пятьдесят одна тысяча два";
            Console.WriteLine(getNumber(b));*/


            //Task 2, 5
            //Get number in words by number

           /*  int e = 1234563890;
            List<int> arr = new List<int>();
            List<string> str1 = new List<string>();
            List<string> str3 = new List<string>();

            string[][] nums = new string[5][];
            nums[0] = new string[10] { "", " один", " два", " три", " четыре", " пять", " шесть", " семь", " восемь", " девять" };
            nums[1] = new string[10] { " десять", " одиннадцать", " двенадцать", " тринадцать", " четырнадцать", " пятнадцать", " шестнадцать", " семнадцать", " восемнадцать", " девятнадцать" };
            nums[2] = new string[10] { "", "", " двадцать", " тридцать", " сорок", " пятьдесят", " шестьдесят", " семьдесят", " восемьдесят", " девяносто" };
            nums[3] = new string[10] { "", " сто", " двести", " триста", " четыреста", " пятьсот", " шестьсот", " семьсот", " восемьсот", " девятьсот" };
            nums[4] = new string[3] { "", " одна", " две" };

            string[][] discharge = new string[3][];
            discharge[0] = new string[12] { "", " тысяч", " миллион", " миллиард", " триллион", " квадриллион", " квинтиллион", " секстиллион", " септиллион", " октиллион", " нониллион", " дециллион" };
            discharge[1] = new string[3] { "а", "и", "" };
            discharge[2] = new string[3] { "", "а", "ов" };

            int [] suf = { 2, 0, 1, 1, 1, 2, 2, 2, 2, 2, };

            List<int> disch(int k){//Разбить число на трёхзначные
                while (k > 0){
                    int a = k % 1000;
                    arr.Add(a);
                    k = k / 1000;
                }
                arr.Reverse();
                return arr;
            }

            string num(int n){ //Вернуть трёхзначное число прописью
                if (n == 0) return " ноль";
                string str = "";
                int c = n % 10;
                int b = ((n - c) / 10) % 10;
                int a = (n - (c + b)) / 100;
                str = nums[3][a] + ((b == 1) ? nums[1][c] : nums[2][b] + nums[0][c]);
                return str;
            }

            List<string> str2(List<int> arr1) {//Добавить разряд, обработка "одна", "две"
                for (int i = arr1.Count - 1, j = 0; i >= 0; i--, j++){
                    if (i != arr1.Count - 2){
                        str1.Add(num(arr1[i]) + discharge[0][j]);
                    }
                    else{
                        string a = (arr1[arr1.Count - 2]).ToString();
                        if ((int)(a[1] - '0') != 1 && (int)(a[2] - '0') == 1) {
                            string l = nums[3][(int)(a[0] - '0')] + ((int)(a[1] - '0') == 0 ? nums[4][1] : nums[2][(int)(a[1] - '0')] + nums[4][1]);
                            str1.Add(l + discharge[0][j]);
                        }else if ((int)(a[1] - '0') != 1 && (int)(a[2] - '0') == 2){
                            string l = nums[3][(int)(a[0] - '0')] + ((int)(a[1] - '0') == 0 ? nums[4][2] : nums[2][(int)(a[1] - '0')] + nums[4][2]);
                            str1.Add(l + discharge[0][j]);
                        }else {
                            str1.Add(num(arr1[i]) + discharge[0][j]);
                        }
                    }
                }
                return str1;
            }

            string sufx(List<int> arrr) {//Добавление суфиксов
                arrr.Reverse();
                int a;
                string res = "";
                for (int i = arrr.Count - 1; i >= 0; i--){
                    if (i == 1){
                        a = arrr[i] % 10;
                        str3.Add(discharge[1][suf[a]]);
                    }else if (i == 0) {
                        str3.Add(discharge[2][0]);
                    }else{
                        a = arrr[i] % 10;
                        str3.Add(discharge[2][suf[a]]);
                    }
                }
                for (int i = 0; i < str1.Count; i++){
                    res += str1[i] + str3[i];
                }
                return res;
            }

            disch(e);
            str1 = str2(arr);
            str1.Reverse();

            //Убрать лишний пробел, сделать первую букву заглавной
            string result = sufx(arr).TrimStart();
            result = char.ToUpper(result[0]) + result.Substring(1);

            Console.WriteLine(result); */
        }
    } 
}
