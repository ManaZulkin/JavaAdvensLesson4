package task2;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deshifrator {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Taras\\Documents\\GitHub\\JavaAdvens\\JavaAdvensLesson4\\src\\task2\\text.txt");
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f,true)));
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)))) {
            Pattern pattern = Pattern.compile("\\s|^[а-яА-ЯІіЇї]{1,3}\\s+");
            while (br.readLine() != null) {
                String text = br.readLine();
                System.out.println(text);
                Matcher matcher = pattern.matcher(text);
                text =  matcher.replaceAll("-Java-");
                System.out.println(text);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
