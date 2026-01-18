// Измененная версия, для изначальной смотреть прошлый коммит !!!!
package task_3;

import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] ages = {10, 30, 121};

        for (int age : ages) {
            try {
                checkAge(age);
            } catch (CustomAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void checkAge(int age) {
        if (age < 0 || age > 120) {
            try {
                List<String> log = Arrays.asList(
                    "Некорректный возраст: " + String.valueOf(age)
                );

                Files.write(Path.of("log.txt"), log);
                throw new CustomAgeException();
            
            } catch (NoSuchFileException e) {
                System.out.println("File not found");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Возраст коректный");
    }
}