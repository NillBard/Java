import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите URL и глубину поиска: ");
        String[] arg = in.nextLine().split(" ");
        Crawlers.main(arg);
    }
}
