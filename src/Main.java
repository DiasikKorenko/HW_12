import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Здраствуйте!!!Заполните пожалуйста анкету для сайта знакомств!");
        Person person = new Person();
        person.writeName();
        person.writeAge();
        person.writePhone();
        person.writepol();
        System.out.println("Регистрация завершена успешно.Спасибо,что вы с нами!");
        person.showAll();
    }
}