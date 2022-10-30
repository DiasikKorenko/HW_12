import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Person extends Exception {
    private int age;
    private String name;
    private int phoneNumber;
    private String pol;
    Scanner sc = new Scanner(System.in);

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }


    public void writeName() throws IOException {
        boolean check = false;
        while (!check) {
            System.out.print("Введите ваше имя: ");
            try {
                name = sc.nextLine();
                if (Character.isUpperCase(name.charAt(0)) == true) {

                    check = true;

                } else {
                    throw new IOException();
                }
            } catch (IOException e) {
                System.out.println("Неверный ввод,повторите попытку!!! Пример 'Диана'");

            }
        }

    }

    public void writeAge() throws IOException {
        String str;
        boolean check = false;
        while (!check) {
            System.out.print("Введите ваш возраст(18+): ");
            try {
                str = sc.nextLine();
                try {
                    age = Integer.parseInt(str);
                    if (age >= 18) {
                        check = true;
                    } else {
                        throw new IOException();
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Поле на вход принимает только целые числа!!!");
                }
            } catch (IOException e) {
                System.out.println("Неверный ввод,Возраст должен быть больше 18!!!");
            }
        }
    }

    public void writePhone() throws IOException {
        String str;
        boolean check = false;
        while (!check) {
            System.out.print("Введите ваш номер телефона +375: ");

            try {
                str = sc.nextLine();
                try {
                    phoneNumber = Integer.parseInt(str);
                    if (str.length() == 9) {
                        check = true;
                    } else {
                        throw new IOException();
                    }

                } catch (NumberFormatException | IOException e) {
                    System.out.println("Поле на вход принимает только целые числа,номер тел. должен состоять из 9-ти цифр!!!");
                }
            }finally{
                System.out.println(".........................................................................................");
            }
        }
    }


    public void writepol() throws IOException {
        boolean check = false;
        while (!check) {
            System.out.print("Введите ваш пол (Женский/Мужской): ");
            try {
                pol = sc.nextLine();
                if (Character.isUpperCase(pol.charAt(0)) && (pol.equals("Женский") || pol.equals("Мужской"))) {

                    check = true;

                } else {
                    throw new IOException();
                }
            } catch (IOException e) {
                System.out.println("Неверный ввод,повторите попытку!!! Пример 'Женский'");

            } finally {
                System.out.println("Регистрация почти завершена!...");

            }
        }

    }
    public void showAll(){
        System.out.println("             ВАШИ ДАННЫЕ               ");
        System.out.println("_______________________________________");
        System.out.println("   Имя   |"+getName());
        System.out.println(" Возраст |"+getAge());
        System.out.println("Моб. тел.|+375"+getPhoneNumber());
        System.out.println("   Пол   |"+getPol());
        System.out.println("_______________________________________\"");
    }


}
