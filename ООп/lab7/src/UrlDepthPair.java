import java.net. *;
public class UrlDepthPair {

    /* Поля для представления текущего URL и текущей глубины */
    private final int currentDepth;
    private final String currentURL;

    /* Конструктор, который устанавливает для ввода текущий URL-адрес и глубину*/
    public UrlDepthPair(String URL, int depth) {
        currentDepth = depth;
        currentURL = URL;
    }

    /* Метод, возвращающий текущий URL */
    public String getURL() {return currentURL;}

    /* Метод, возвращающий текущую глубину */
    public int getDepth() {return currentDepth;}

    /* Метод, отображающий текущий URL и текущую глубину в строковом формате */
        public String toString() {
            String stringDepth = Integer.toString(currentDepth);
            return stringDepth + '\t' + currentURL;
    }

    /* Метод, который возвращает docPath текущего URL */
        public String getDocPath() {

            try {
                URL url = new URL(currentURL);
                return url.getPath();
            }

            catch (MalformedURLException e) {
                System.err.println("MalformedURLException:\n\t" + e.getMessage());//если адрес не начинается с http://, выдается исключение
                return null;
        }

    }

    /*  Метод, который возвращает webHost текущего URL */
        public String getWebHost() {

             try {
                 URL url = new URL(currentURL);
                 return url.getHost();
            }

            catch (MalformedURLException exception) {
                 System.err.println("MalformedURLException:\n\t" + exception.getMessage());
                return null;
        }

    }





}

