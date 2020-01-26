import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Сканер сразу для всех задач
        Scanner sc = new Scanner(System.in);

        //Задание 1 - оклад с подоходным налогом

        System.out.println("Введите оклад: ");
        int fm = sc.nextInt();
        System.out.println("Введите ставку подоходного налога в процентах: ");
        double nalog = fm * (sc.nextDouble() / 100);
        System.out.println("Оплачиваемый налог: " + nalog + "\nДеньги полученные на руки: " + (fm - nalog));

                    // Задание 2  -  обед в столовке
        int borch = 35;
        int katlet = 40;
        int kasha = 20;
        int tea = 3;
        int summ = borch + katlet + kasha + tea;
        int summ2 = borch + katlet*2 + kasha + tea;
        double vs = (double) summ2 / summ;
        System.out.print("Общая стоимость обеда :" + summ +
                "\nСоотношение стомости обеда до и после поднятия цен на котлеты ");
        System.out.println(String.format("%.2f", vs));

                        //Задание 3 -  граммы в тонны и килограммы
        System.out.println("Введите вес в граммах:");
        int gram = sc.nextInt();
        double kg = (double) gram / 1000;
        double ton = kg / 1000;
        System.out.println("Вес в килограммах: " + kg + "\nВес в тоннах: " + ton);

                           //Задание 4 - байты в киллобайты и мегабайты
        System.out.println("Введите объём в байтах: ");
        int b =  sc.nextInt();
        double kb = (double) b / 1024;
        double mb = kb / 1024;
        System.out.println("Объём в килобайтах: " + kb + "Объём в мегабайтах: " + mb);


                  //Задание 5 - Десятичное число в столбик
        System.out.println("Введите десятизначное число: ");
        String numbers = sc.next();
        char[] na = numbers.toCharArray();
        System.out.println(na[0] + "\n" + na[1] + "\n" + na[2] + "\n" + na[3]  + "\n" + na[4]  + "\n" + na[5]
                + "\n" + na[6]  + "\n" + na[7]  + "\n" + na[8]  + "\n" + na[9]);


                //Задание 6. Сканворд

                //Задание 8. Четырёхзначное наоборот
        System.out.println("Введите четырёхзначное число: ");
        String numbers2 = sc.next();
        char[] na2 = numbers2.toCharArray();
        System.out.println(na2[3] + na2[2] + na2[1] + na2[0]);
    }
}
