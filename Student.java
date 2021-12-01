import java.util.Scanner;

 abstract class Student implements Abiturent {
     Scanner in = new Scanner(System.in);
     String name;
        void name() {
            System.out.printf("Имя: \n");
             name = in.nextLine();
            System.out.println("Имя " + name);
        }

        void famile() {
            System.out.printf("Фамилия: \n");
            String famil = in.nextLine();
            System.out.println("Фамилия " + famil);
        }
        static String VishiUchebZaved = ("ENU") ;
       static  String UchebProgpamm = ("InfoBez");








     }




