import java.util.*;

public class Main {
    //Task 1
    //Get day name by day number
    /*public static String [] days = { "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье" };
    public static String day = "";
    public static String GetDay(int dayNumber){
        for (int i = 0; i <= days.length; i++){
            if (i == dayNumber){
                day = days[i - 1];
            }
            else {
                continue;
            }
        }
        return day;
    }*/


    //Task 4
    //Get distance between 2 points on cartesian coordinate system
     /* public static double distance(int x1, int x2, int y1, int y2){
        int firstKat = Math.abs(x1 - x2);
        int secondKat = Math.abs(y1 - y2);
        double dist = Math.sqrt((firstKat * firstKat) + (secondKat * secondKat));
        double roundOff = Math.round(dist * 100.0) / 100.0;
        return roundOff;
    }*/

    //Task 3-6
    //Get number by words

    /*public static String b = "пять миллиардов сто двадцать один миллион четыреста пятьдесят одна тысяча два";

    public static long getNumber(String str, HashMap <String, Integer> numbers) {
        String[] strlist = str.split(" ");
        ArrayList arr = new ArrayList();
        long sum = 0;
        long sum1 = 0;

        for (int i = 0; i < strlist.length; i++) {
            arr.add(strlist[i]);
            //System.out.println( arr.get(i));
            if (!((arr.get(i)).toString().indexOf("милли") == 0 || (arr.get(i)).toString().indexOf("тысяч") == 0)) {
                sum += numbers.get(arr.get(i));
            } else {
                sum *= numbers.get(arr.get(i));
                sum1 += sum;
                sum = 0;
            }
        }
        sum1 += sum;
        return sum1;

    }*/

    //Task 2-5
    //Get number in words


    //Вернуть массив трёхзначных чисел
    /*public static List<Long> disch(Long k, List <Long> arr){
        while (k > 0){
            long a = k % 1000;
            arr.add(a);
            k = k / 1000;
        }
        Collections.reverse(arr);
        return arr;
    }

    //Вернуть трёхзначное число прописью
    public static String num(Long n, String [][] nums){
        if (n == 0) return " ноль";
        String str = "";
        int c = (int) (n % 10);
        int b = (int) (((n - c) / 10)   % 10);
        int a = (int) ((n - (c + b)) / 100);
        str = nums[3][a] + ((b == 1) ? nums[1][c] : nums[2][b] + nums[0][c]);
        return str;
    }

    //Добавить разряд числа, обработка "одна", "две"
    public static List<String> str2(List<Long> arr, List<String> str1, String [][] discharge, String[][] nums) {
        for (int i = arr.size() - 1, j = 0; i >= 0; i--, j++){
            if (i != arr.size() - 2){
                str1.add(num(arr.get(i), nums) + discharge[0][j]);
            }
            else{
                long a = (arr.get(arr.size() - 2));
                long a2 = a % 10;
                long a1 = (a - a2) / 10 % 10;
                long a0 = (a - (a%100))/100;
                if (a1 != 1 && a2 == 1) {
                    String l = nums[3][(int)a0] + (a1 == 0 ? nums[4][1] : nums[2][(int)(a1)] + nums[4][1]);
                    str1.add(l + discharge[0][j]);
                }else if (a1 != 1 && a2 == 2){
                    String l = nums[3][(int)a0] + (a1 == 0 ? nums[4][2] : nums[2][(int)a1] + nums[4][2]);
                    str1.add(l + discharge[0][j]);
                }else {
                    str1.add(num(arr.get(i), nums) + discharge[0][j]);
                }
            }
        }
        Collections.reverse(str1);
        return str1;
    }

    //Добавление суфиксов
    public static String sufx(List<Long> arr, String [][] discharge, int [] suf, List<String> str3, List<String> str1) {
        Collections.reverse(arr);
        long a;
        String res = "";
        for (int i = str1.size() - 1; i >= 0; i--){
            if (i == 1){
                a = arr.get(i) % 10;
                str3.add(discharge[1][suf[(int)a]]);
            }else if (i == 0) {
                str3.add(discharge[2][0]);
            }else{
                a = arr.get(i) % 10;
                str3.add(discharge[2][suf[(int)a]]);
            }
        }
        for (int i = 0; i < str1.size(); i++){
            res += str1.get(i) + str3.get(i);
        }

        return res;
    }*/

    public static void main(String[] args) {
        //Task 1
        //Get day name by day number
         //System.out.println(GetDay(5));


        //Task 4
        //Get distance between 2 points on cartesian coordinate system
        //System.out.println(distance(1, 5, 4, 2));


        //Task 3-6
        //Get number by words

       /* HashMap<String, Integer> numbers = new HashMap<String, Integer>();
        numbers.put("ноль", 0);numbers.put("один", 1);numbers.put("одна", 1);numbers.put("два", 2);numbers.put("две", 2);numbers.put("три", 3);numbers.put("четыре", 4);numbers.put("пять", 5);
        numbers.put("шесть", 6);numbers.put("семб", 7);numbers.put("восемь", 8);numbers.put("девять", 9);numbers.put("десять", 10);numbers.put("одинадцать", 11);numbers.put("двенадцать", 12);
        numbers.put("тринадцать", 13);numbers.put("четырнадцать", 14);numbers.put("пятнадцать", 15);numbers.put("шестнадцать", 16);numbers.put("семнадцать", 17);numbers.put("восемнадцать", 18);
        numbers.put("девятнадцать", 19);numbers.put("двадцать", 20);numbers.put("тридцать", 30);numbers.put("сорок", 40);numbers.put("пятьдесят", 50);numbers.put("шестьдесят", 60);
        numbers.put("семдесят", 70);numbers.put("восемьдесят", 80);numbers.put("девяносто", 90);numbers.put("сто", 100);numbers.put("двесте", 200);numbers.put("триста", 300);
        numbers.put("четыреста", 400);numbers.put("пятьсот", 500);numbers.put("шестьсот", 600);numbers.put("семьсот", 700);numbers.put("восемьсот", 800);numbers.put("девятсот", 900);
        numbers.put("тысяча", 1000);numbers.put("тысячи", 1000);numbers.put("тысяч", 1000);numbers.put("миллион", 1000000);numbers.put("миллионов", 1000000);numbers.put("миллиона", 1000000);
        numbers.put("миллиард", 1000000000);numbers.put("миллиарда", 1000000000);numbers.put("миллиардов", 1000000000);

        System.out.println(getNumber(b, numbers));*/


       //Task 2-5
        // Get number in words

        /*Long e = 987654321089L;
        List<Long> arr = new LinkedList<Long>();
        List<String> str1 = new LinkedList<String>();
        List<String> str3 = new LinkedList<String>();

        String [][] nums = {{ "", " один", " два", " три", " четыре", " пять", " шесть", " семь", " восемь", " девять" },
                { " десять", " одиннадцать", " двенадцать", " тринадцать", " четырнадцать", " пятнадцать", " шестнадцать", " семнадцать", " восемнадцать", " девятнадцать" },
                { "", "", " двадцать", " тридцать", " сорок", " пятьдесят", " шестьдесят", " семьдесят", " восемьдесят", " девяносто" },
                { "", " сто", " двести", " триста", " четыреста", " пятьсот", " шестьсот", " семьсот", " восемьсот", " девятьсот" },
                { "", " одна", " две" }
        };

        String[][] discharge = {{ "", " тысяч", " миллион", " миллиард", " триллион", " квадриллион", " квинтиллион", " секстиллион", " септиллион", " октиллион", " нониллион", " дециллион" },
                { "а", "и", "" },
                { "", "а", "ов" }
        };

        int [] suf = { 2, 0, 1, 1, 1, 2, 2, 2, 2, 2, };

        disch(e, arr);
        str2(arr, str1, discharge, nums);

        //Убрать лишний пробел, сделать первую букву заглавной
        String res = sufx(arr, discharge, suf, str3, str1).trim();
        String result = res.substring(0, 1).toUpperCase() + res.substring(1);

        System.out.println(result);*/

    }

}