import java.util.ArrayList;
import java.util.*;
public class Tasks3 {

//1
//Квадратное уравнение ax2 + bx + c = 0 имеет либо 0, либо 1, либо 2 различных
//решения для действительных значений x. учитывая a, b и c, вы должны вернуть
//число решений в уравнение.

    public static int solutions(int a, int b, int c){
        int result = 0;
        int disk = b*b-4*a*c;
        if (disk == 0) result = 1;
            else if (disk > 0) result = 2;
                else result = 0;
        return result;
    }

//2
//Напишите функцию, которая возвращает позицию второго вхождения " zip " в строку,
//или -1, если оно не происходит по крайней мере дважды.
//Ваш код должен быть достаточно общим, чтобы передать все возможные случаи,
//когда "zip" может произойти в строке.

    public static int findZip(String string){
        int res = 0;
        if(string.indexOf("zip") == -1) res = -1;
        res = string.replaceFirst("zip", "123").indexOf("zip");

        return res;
    }

//3
//Создайте функцию, которая проверяет, является ли целое число совершенным
//числом или нет. Совершенное число - это число, которое можно записать как
//сумму его множителей, исключая само число.
//Например, 6-это идеальное число, так как 1 + 2 + 3 = 6, где 1, 2 и 3-Все коэффициенты 6.
//Точно так же 28-это совершенное число, так как 1 + 2 + 4 + 7 + 14 = 28.

    public static boolean checkPerfect(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){
            if (num%i == 0){
                sum +=i;
            }
        }
        if (num == sum) return true;
            else return false;
    }

//4
//Создайте функцию, которая принимает строку и возвращает новую строку с
//заменой ее первого и последнего символов, за исключением трех условий:
//– Если длина строки меньше двух, верните "несовместимо".".
//– Если первый и последний символы совпадают, верните "два-это пара.".

   public static String flipEndChars(String str){
        if (str.length()<2) return "Incompatible";
            else if (str.charAt(0) == str.charAt(str.length()-1)) return "Two's a pair.";
                else {
                   return str.charAt(str.length()-1) + str.substring(1,str.length()-1)+str.charAt(0);
        }
   }

//5
//Создайте функцию, которая определяет, является ли строка допустимым шестнадцатеричным кодом.
//Шестнадцатеричный код должен начинаться с фунтового ключа # и иметь длину ровно 6
//символов. Каждый символ должен быть цифрой от 0-9 или буквенным символом от A-F.
//все буквенные символы могут быть прописными или строчными.

   public static boolean isValidHexCode(String str){
        if ((str.length() > 7) && (str.length()<=6)) return false;
           else if(str.charAt(0)  != '#' ) return false;
                else if(str.matches("#[a-fA-F0-9]+")) return true;
                    else return false;
   }

//6
//Напишите функцию, которая возвращает true, если два массива имеют одинаковое
//количество уникальных элементов, и false в противном случае.

   public static boolean same(int[] arr1, int[] arr2){
        int unicSum1 = 0;
        int unicSum2 = 0;
        for (int i = 0; i < arr1.length-1; i++){
            int k = 1;
                for(int j = 0;j < arr1.length-1; j++){
                    if(arr1[i]==arr1[j]) k = -1;
                }
                if( k == 1 ) unicSum1++;
        }
       for (int i = 0; i < arr2.length-1; i++){
            int k = 1;
                for(int j = 0;j < arr2.length-1; j++){
                    if(arr2[i]==arr2[j]) k = -1;
                }
                if( k == 1 ) unicSum2++;
       }
       if(unicSum1==unicSum2) return true;
            else return false;
   }

//7
//Число Капрекара-это положительное целое число, которое после возведения в
//квадрат и разбиения на две лексикографические части равно сумме двух
//полученных новых чисел:
//– Если количество цифр квадратного числа четное, то левая и правая части будут иметь
//одинаковую длину.
//– Если количество цифр квадратного числа нечетно, то правая часть будет самой длинной
//половиной, а левая-самой маленькой или равной нулю, если количество цифр равно 1.
//– Учитывая положительное целое число n, реализуйте функцию, которая возвращает true,
//если это число Капрекара, и false, если это не так.

   public static boolean isKaprekar(int n){
        int c = n*n;
        String str = String.valueOf(c);
        if(str.length() == 1) return n==c;
            else {
                int x = Integer.parseInt(str.substring(0, str.length()/2)); //
                int y = Integer.parseInt(str.substring(str.length()/2)); //
                return x+y == n;
        }
    }

//8
//Напишите функцию, которая возвращает самую длинную последовательность
//последовательных нулей в двоичной строке.

   public static String longestZero (String str){
        String count = "";
        String newStr = "";
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i)=='0'){
                newStr += str.charAt(i);
            }
                else {
                  if (count.length() < newStr.length()){
                      count = newStr;
                  }
                newStr = "";
            }
        }
        if(count.length()<newStr.length()) count =newStr;
        return count;
   }

//9
//Если задано целое число, создайте функцию,
//которая возвращает следующее простое число. Если число простое, верните само число.

    public static int nextPrime(int num){
        boolean bool = true;
        boolean check = true;
        for(int i = 2; i <= num/i; i++) {
            if(num%i == 0) bool = false;
        }
        if (bool) return num;
            else{
                while (check){
                    num+=1;
                    bool = true;
                    for(int i = 2; i <= num/i; i++) {
                        if(num%i == 0) bool = false;
                    }
                    if(bool) check = false;
                }
            return num;
        }
    }

//10
//Учитывая три числа, x, y и z, определите, являются ли они ребрами прямоугольного треугольника.

    public static boolean rightTriangle (int x, int y, int z){
        if (x == 0 || y == 0 || z == 0) return false;
            else return ((x*x == y*y+z*z) || (y*y == x*x+z*z) || (z*z == y*y +x*x));
    }

    public static void main(String[] args){
        System.out.println(solutions(1,5,2));
        System.out.println(findZip("zip is not zip"));
        System.out.println(checkPerfect(6));
        System.out.println(flipEndChars("good job"));
        System.out.println(isValidHexCode("567AT1"));
        int[]array1 = {1,2,3,3,3};
        int[]array2 = {5,6,7,8};
        System.out.println(same(array1, array2));
        System.out.println(isKaprekar(297));
        System.out.println(longestZero("100111000001010000000"));
        System.out.println(nextPrime(12));
        System.out.println(rightTriangle(4,3,5));
    }
}
