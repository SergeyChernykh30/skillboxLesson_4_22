public class Main {
    public static void main(String[] args) {
        String name1 = "Vasilii";
        String name2 = "Dmitrii";

        System.out.println(name1.equals(name2)); //true or false
        System.out.println(name1.compareTo(name2)); //если name1 стоит в алфавите позже чем name2, то число положительное

        StringBuilder builder = new StringBuilder();
        builder.append(name1);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++)
        {
            builder.append(name2);
        }
        long end = System.currentTimeMillis();

        System.out.println("Duration: " + (end - start) + " ms");
        System.out.println(builder.length());

        String text = "Дмитрий Петрович ждёт вас.    Выходите через 5 минут!";

        String [] sentences = text.split("\\.\\s+"); //"\\." - экранируем точку "\\s+" - s пробел + сколько угодно пробелов

        for (int i = 0; i < sentences.length; i++)
        {
            System.out.println(sentences[i]);
        }
    }
}