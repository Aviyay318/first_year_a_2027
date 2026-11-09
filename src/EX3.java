import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        //loop - while

//        int number = 0;
//
//        if (number%2==0){
//            System.out.println("the number is even");
//        }else{
//            System.out.println("the number is odd");
//        }
        //יש להדפיס את כל המספרים הזוגיים מ0 עד 10

//        while (number<=10){
//            System.out.println(number);
//            number = number+2;     //number+=2
//        }

        //loop - for

        //יש להדפיס את כל המספרים הזוגיים מ0 עד 10
//
//        for (int i = 0; i <=10 ; i+=2) { //i=i+2
//            System.out.println(i);
//        }

        //להדפיס את כל המספרים מ1 עד 1000
//        for (int i=1;i<=1000;i++){
//            System.out.println(i);
//        }
//
//        int n = 1;
//        while (n<=1000){
//            System.out.println(n);
//            n++;
//        }


//        תרגיל 2:
//        כתבו תוכנית המדפיסה את כל המספרים הטבעיים מ-0 ועד limit, כאשר
//        limit הוא מספר שנקלט מהמשתמש. אם
//        limit אינו מספר חיובי יש להדפיס הודעת שגיאה מתאימה.

        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter number bigger than 0");
//        int limit = scanner.nextInt();
//        if (limit>0){
//            for (int i=0;i<=limit;i++){
//                System.out.println(i);
//            }
//        }else {
//            System.out.println("the number is not bigger than 0");
//        }


//        תרגיל 3:
//        כתבו תוכנית המדפיסה את כל המספרים הטבעיים מ-start ועד end,
//        כאשר start הוא מספר שלם כלשהו שנקלט מהמשתמש ו-end
//        הוא מספר שלם כלשהו שנקלט מהמשתמש.
//        אם end אינו גדול מ-start, יש להדפיס הודעת שגיאה מתאימה.

//        System.out.println("please enter 2 numbers 1- for start 2- for end");
//        int start = scanner.nextInt();
//        int end = scanner.nextInt();
//
//        if (start<end){
//            for (int i = start; i <=end ; i++) {
//                System.out.println(i);
//            }
//        }else {
//            System.out.println("error");
//        }


//        תרגיל 4:
//        כתבו תוכנית הקולטת מהמשתמש חמישה מספרים שלמים,
//        ולאחר מכן מדפיסה כמה מבין אותם מספרים הם גדולים מ-10.
        int count = 0;
        for (int i=0;i<5;i++){
            System.out.println("please enter number");
            int x = scanner.nextInt();
            if (x>10){
                count++;
            }
        }
        System.out.println(count + " : bigger than 10");
    }
}
