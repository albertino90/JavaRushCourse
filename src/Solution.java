import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
        /*Считать с консоли URL-ссылку.
        Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
        URL содержит минимум 1 параметр.
        Если присутствует параметр obj, то передать его значение в нужный метод alert.
        alert(double value) - для чисел (дробные числа разделяются точкой)
        alert(String value) - для строк
        Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.
        */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
        ArrayList<String> list = new ArrayList<>();
        String x = "http://javarush.ru/alpha/index.html?obj=view&name=Amigo";
        int y = x.indexOf("?")+1;
        String m = x.substring(y);
        for(String dd : m.split("&")){
            list.add(dd);

            if(dd.contains("=")){
                y = dd.indexOf("=");
                System.out.print(dd.substring(0,y)+" ");
            }else System.out.print(dd+" ");
        }
        System.out.println();

        for(String ss : list){
            if (ss.contains("obj")){
                try {
                    alert(Double.parseDouble(ss.substring(ss.indexOf("=")+1)));

                }catch (Exception e){alert(ss.substring(ss.indexOf("=")+1));}
            }}




    }



    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}

