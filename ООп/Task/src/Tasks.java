public class Tasks {
    //Первое задание
    // функция, возвращающая остаток от деления
    public static int reminder (int firstNum, int secondNum){
        return firstNum%secondNum;
    }

    //Второе задание
    //функция, принимающая высоту и длину основания и возвращающая площадь
    public static double square(int height, int lenght){
        return 0.5*(height*lenght);
    }

    //Третье задание
    //функция, подсчитвающая количество ног у каждого вида животных и возвращающая сумму всех ног
    public static int animalsLeg (int chikensLeg, int pigsLeg, int cowsLeg){
        return  chikensLeg+pigsLeg+cowsLeg;
    }

    //Четвёртое задание
   public static boolean profittableGamble(double prob, int prize,int pay ){
        boolean check;
        check= (prob * prize) > pay;
        return check;
    }

    //Пятое задание
    public static String operation(int a, int b, int N){
        String answer="";
        if (N == a+b) answer="added";
            else if (N == a*b ) answer="multiply";
                else if ((N == a-b)||(N==b-a)) answer = "subtracted";
                    else if ((N==a/b)||(N==b/a)) answer = "split";
                        else answer = "none";
                    return answer;
    }
    //Шестое задание
    public static int ctoa (char a){
        char character = 'a';
        int ascii = (int) character;
        System.out.println("6 " + ascii);
        return ascii;
    }

    //Седьмое задание
    public static int addUpTo(int n){
        int sum=0;
        for(int i = 0; i<=n; i++){
            sum+=i;
        }
    System.out.println("7 " +sum);
    return sum;
    }

    //Восьмое задание
    public static int nextEdge(int a, int b){
        int side = a+b-1;
        System.out.println("8 " +side);
        return side;
    }

    //Девятое задание
    public static int  sumOfCubes(int[] a){
        int sum = 0;
        for (int i = 0; i< a.length; i++){
            sum+= Math.pow(a[i],3);
        }
        System.out.println("9 " +sum);
        return sum;
    }

    //Десятое задание
    public static boolean abcMath(int a, int b, int c){
        boolean result = true;
        for (int i=0; i<b; i++){
            a+=a;
        }
        if (a%c == 0) result = true;
            else result = false;
        System.out.println("10 " +result);
        return result;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3};
        System.out.println("1 " + reminder(5,6));
        System.out.println("2 " + square(5,6));
        System.out.println("3 " + animalsLeg(6,8,16));
        System.out.println("4 "+ profittableGamble(0.2, 50, 9));
        System.out.println("5 " + operation(15,11,11));
        ctoa('a');
        addUpTo(5);
        nextEdge(7,8);
        sumOfCubes(array);
        abcMath(1,2,3);
    }
}




