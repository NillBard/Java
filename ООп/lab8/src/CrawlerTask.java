import java.util.*;

public class CrawlerTask implements Runnable {
    /** Поле для заданной пары глубин */
    public URLDepthPair depthPair;

    /** Поле для пула URL */
    public URLPool myPool;

    public CrawlerTask(URLPool pool) {
        myPool = pool;
    }

    /** Метод для запуска задач CrawlerTask */
    public void run() {
        // Возьмите следующую пару глубины.
        depthPair = myPool.get();

        // Глубина пары глубины.
        int myDepth = depthPair.getDepth();

        //Получение всех ссылок с сайта и сохранение их в новом связанном списке.
        LinkedList<String> linksList = new LinkedList<String>();
        linksList = Crawler.getAllLinks(depthPair);

        // Перебор ссылок со всего сайта
        for (String newURL : linksList) {
            // Создайте новую пару глубины для каждой найденной ссылки и добавьте ее в пул.
            URLDepthPair newDepthPair = new URLDepthPair(newURL, myDepth + 1);
            myPool.put(newDepthPair);
        }
    }
}
