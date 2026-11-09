import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        //loop - while

        int number = 0;

        if (number%2==0){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
        }
        //יש להדפיס את כל המספרים הזוגיים מ0 עד 10

        while (number<=10){
            System.out.println(number);
            number = number+2;     //number+=2
        }

        //loop - for

        //יש להדפיס את כל המספרים הזוגיים מ0 עד 10

        for (int i = 0; i <=10 ; i+=2) { //i=i+2
            System.out.println(i);
        }

        //להדפיס את כל המספרים מ1 עד 1000
        for (int i=1;i<=1000;i++){
            System.out.println(i);
        }

        int n = 1;
        while (n<=1000){
            System.out.println(n);
            n++;
        }


//        תרגיל 2:
//        כתבו תוכנית המדפיסה את כל המספרים הטבעיים מ-0 ועד limit, כאשר
//        limit הוא מספר שנקלט מהמשתמש. אם
//        limit אינו מספר חיובי יש להדפיס הודעת שגיאה מתאימה.

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number bigger than 0");
        int limit = scanner.nextInt();
        if (limit>0){
            for (int i=0;i<=limit;i++){
                System.out.println(i);
            }
        }else {
            System.out.println("the number is not bigger than 0");
        }

    }
}
