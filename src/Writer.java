import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public void write (User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(user.lastName + ".txt", true));) {
            writer.write(user.toString());
            System.out.println("Данные успешно записаны в файл.");
        } catch (IOException e) {
            throw new RuntimeException("нет подключения к файлу");
        }
    }
}