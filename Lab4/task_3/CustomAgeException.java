package task_3;

public class CustomAgeException extends RuntimeException {
    public CustomAgeException() {
        super("Возраст некоректный");
    }
}