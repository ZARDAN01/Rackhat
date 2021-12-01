import java.util.InputMismatchException;
import java.util.Scanner;

public interface Abiturent {
    Scanner in = new Scanner(System.in);

    default void SborDoki() {
        Scanner in = new Scanner(System.in);
        System.out.print(" Собираем документы ");
        System.out.printf(" Введите какие документы нужны : \n");
        String nam = in.nextLine();
        System.out.println(" Список документов " + nam);

    }


    default void Oplatit() {
        Scanner in = new Scanner(System.in);
        System.out.print(" Оплачиваем учебу ");
        System.out.printf(" ВВедите какую сумму надо оплатить чтобы учится : \n");

        try {
            int nam = in.nextInt();
            System.out.println(" Необходимая сумма " + nam+ " тг");
        } catch  (InputMismatchException MyErr) {
            System.err.println(" Надо ввести число  "+MyErr.getMessage());
        }
    }


    default void SdatDoki() {
        Scanner in = new Scanner(System.in);
        System.out.print(" Сдаем документы ");
        System.out.printf(" Укажите дату и место где нужно доставить документы : \n ");
        String nam = in.nextLine();
        System.out.println(" Документы нужно сдать " + nam);
    }


    default void Zaiava() {
         Scanner in = new Scanner(System.in);
         System.out.print(" Пишем заявление ");
         System.out.printf(" Распишитесь свойм именем : \n ");
         String name = in.nextLine();
         System.out.println(" Роспись " + name);

     }


    default void SdatENT() {
        Scanner in = new Scanner(System.in);
        System.out.print(" Сдаем ЕНТ ");
        System.out.printf("укажите ваш выбранный предмет на ЕНТ : \n ");
        String nam = in.nextLine();
        System.out.println(" Предмет " + nam);
        System.out.printf("укажите сколько баллов вы набрали : \n " );
        try {
            int net = in.nextInt();
            System.out.println(  net+ " балл ");
            System.out.println(" Предмет " + nam  + net);
        } catch  (InputMismatchException MyErr) {
            System.err.println(" Надо ввести число  "+MyErr.getMessage());
        }


    }
}


