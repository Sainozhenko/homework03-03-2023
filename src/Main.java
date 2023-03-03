import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        //Задача 2
        //Есть не пустой текстовый файл такого вида:
        //1
        //2
        //3
        //4
        //5
        //Написать метод, возвращаюший среднее арифметическое всех этих чисел.
        System.out.println(average("file.txt"));
    }
    public static int average(String file) {
        int average = 0;
        String line;
        int count = 0;
        try (
                FileReader fileRead = new FileReader(file);
                BufferedReader br = new BufferedReader(new FileReader(file));
        ) {
            while ((line = br.readLine()) != null) {
                average = average+ Integer.parseInt(line);
                count++;
            }

        } catch (Exception e) {
            e.getMessage();
        }
        return average / count;
    }
}