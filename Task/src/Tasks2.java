public class Tasks2 {

// Первое задание
// Повторить каждый символ в строке n раз
    public static String repeat(String word, int n){
        String newWord = " ";
        for (int i = 0; i< word.length() ; i++){
            for (int j = 0; j<n; j++){
                newWord+= word.charAt(i);
            }
        }
        return newWord;
    }

// Второе задание
// Создать функцию, которая принимает массив и возвращает разницу между самым большим и самым маленьким числом
    public static int differenceMaxMin(int [] mass){
        int max = -99999;
        int min = 999999;
        for (int i= 0; i< mass.length; i++ ) {
            if (mass[i] < min ){
                min =mass[i];
            }
        for (int j = 0; j< mass.length;j++ )
            if (mass[i] > max){
            max = mass[i];
            }
        }
        return max - min;
    }

//Третье задание
//Создайте функцию, которая принимает массив в качестве аргумента и возвращает
//true или false в зависимости от того, является ли среднее значение всех элементов
//массива целым числом или нет.

    public static boolean isAvgWhole(int mass[]){
        double sum=0;
        boolean result = false;
        for (int i = 0; i< mass.length; i++) {
            sum += mass[i];
        }
        if (sum%mass.length == 0) result = true;
        return result;
    }


//Четвёртое задание
//Создайте метод, который берет массив целых чисел и возвращает массив, в
//котором каждое целое число является суммой самого себя + всех предыдущих
//чисел в массиве.

    public static int[] cumulativeSum( int [] mass){
        int[] result = new int[mass.length];
        for(int j = 0; j< mass.length;j++){
            if(j == 0){
                result[j]=mass[0];
            }
            else result[j]=0;
        }
        for (int i = 1; i < mass.length; i++){
           result[i]  = mass[i] + mass[i-1];
        }
        return result;
    }


//Пятое задание
//Создайте функцию, которая возвращает число десятичных знаков, которое имеет
//число (заданное в виде строки). Любые нули после десятичной точки
//отсчитываются в сторону количества десятичных знаков.

    public static int getDecimalPlaces(String number){
        if (number.indexOf('.')!=0){
            return number.length()-number.indexOf('.')-1;
        }
        else
            return 0;
    }

//Шестое задание
//Создайте функцию, которая при заданном числе возвращает соответствующее
//число Фибоначчи.

    public static int Fibonacci (int n){
        switch (n) {
            case 0:
            case 1:
                return 1;
            default:
                return Fibonacci(n - 2) + Fibonacci(n - 1);
        }
    }


//Седьмое задание
//Почтовые индексы состоят из 5 последовательных цифр. Учитывая строку,
//напишите функцию, чтобы определить, является ли вход действительным
//почтовым индексом. Действительный почтовый индекс выглядит следующим
//образом:
//– Должно содержать только цифры (не допускается использование нецифровых цифр).
//– Не должно содержать никаких пробелов.
//– Длина не должна превышать 5 цифр.

    public static boolean isValid(String index){
        int buf = 0;
        for (int i = 0; i < index.length(); i++) {
            if (!Character.isDigit(index.charAt(i)))
                buf++;
                else if (index.charAt(i) == ' ')
                   buf++;
                    else if (index.length() != 5)
                      buf++;
        }
        return buf == 0;
    }


//Восьмое задание
//Пара строк образует странную пару, если оба из следующих условий истинны:
//– Первая буква 1-й строки = последняя буква 2-й строки.
//– Последняя буква 1-й строки = первая буква 2-й строки.
//– Создайте функцию, которая возвращает true, если пара строк представляет собой
//странную пару, и false в противном случае.

    public static boolean isStrangePair (String word1, String word2){
        return word1.charAt(0) == word2.charAt(word2.length() - 1) &&
                word2.charAt(0) == word2.charAt(word1.length() - 1);
    }

//Девятое задание
//Создайте две функции: isPrefix(word, prefix-) и isSuffix (word, -suffix).
//– isPrefix должен возвращать true, если он начинается с префиксного аргумента.
//– isSuffix должен возвращать true, если он заканчивается аргументом суффикса.
//– В противном случае верните false.

    public static boolean isPrefix(String word, String pref){
        pref =  pref.substring(0,  pref.length()-1);
        return word.startsWith(pref);
    }
    public static boolean isSuffix(String word, String suf){
        suf = suf.substring(1);
        return word.endsWith(suf);
    }


//Десятое задание
//Создайте функцию, которая принимает число (шаг) в качестве аргумента и
//возвращает количество полей на этом шаге последовательности.
//Шаг 0: начните с 0
//Шаг 1: Добавьте 3
//Шаг 2: Вычтите 1
//Повторите Шаги 1 И 2 ...

    public static int boxSeq(int shag){
        if (shag == 0) return 0;
        int count = 0;
        for (int i = 0; i < shag; i++) {
            if (i % 2 != 0) count+=3;
                else count--;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(repeat("Hello", 3));
        int[] array = {-10,5,9,25,13};
        int[] mass = {1,3,5,7,10};
        System.out.println(differenceMaxMin(array));
        System.out.println(isAvgWhole(array));
        for(int i: cumulativeSum(mass)){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(getDecimalPlaces("123.5002"));
        System.out.println(Fibonacci(5));
        System.out.println(isValid("12345"));
        System.out.println(isStrangePair("Hello", "olleH"));
        System.out.println(isPrefix("Monday", "M"));
        System.out.println(isSuffix("Study", "y"));
        System.out.println(boxSeq(5));
    }
}
