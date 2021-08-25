public class homework2 {
    public static void main(String[] args) {
        System.out.println("Задание 1: " + homework2.task1(11));
        System.out.println("Задание 2: " + homework2.task2(-1));
        System.out.println("Задание 3: " + homework2.task3(-1));
        homework2.task4(4, "Test string");
        System.out.println("Задание 5: " + homework2.task5(400));
    }
    // Задание 1
    public static String task1 (int a){
        if (a>=10 && a <= 20){
            return  "true";
        }else{
            return  "false";
        }
    }

    public  static String task2 (int a){
        if (a >= 0){
            return "Положительное";
        }else{
            return  "Отрицательное";
        }
    }

    public  static String task3 (int a){
        if (a >= 0){
            return "true";
        }else{
            return  "false";
        }
    }

    public static void task4 (int a, String b){
        System.out.println("Задание 4: ");
        for (int i=0; i < a; i++){
            System.out.println(b);
        }
    }

    public static String task5 (int a){
        if ((a%4 == 0 && a% 100 !=0) || a%400 == 0){
            return "true";
        }else{
            return "false";
        }
    }

}
