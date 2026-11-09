import java.util.Random;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
//        int count = 0;
//        for (int i=0;i<5;i++){
//            System.out.println("please enter number");
//            int x = scanner.nextInt();
//            if (x>10){
//                count++;
//            }
//        }
//        System.out.println(count + " : bigger than 10");


//        תרגיל 5:
//        כתבו תוכנית היוצרת באופן אקראי חמישה מספרים שלמים, בטווח שבין min
//        ו-max, כאשר min ו-max הם קלט מהמשתמש. לאחר מכן התוכנית
//        תדפיס את חמשת המספרים, ולבסוף תכתוב
//        כמה מבין אותם מספרים הם גדולים מ-10.

        Random random = new Random();
//
//        System.out.println("הכנס 2 מספרים , מימנימום ומקסימום");
//        int min  = scanner.nextInt();
//        int max = scanner.nextInt();
//
//        int count = 0;
//        for (int i = 0; i<5 ;i++){
//            int number = random.nextInt(min,max);
//            if (number>10){
//                count++;
//            }
//        }
//        System.out.println(count);


//        תרגיל 7:
//        כתבו תוכנית הקולטת מהמשתמש מספר שלם count.
//        לאחר מכן, התוכנית תבקש מהמשתמש להכניס
//        count מספרים שלמים נוספים ותדפיס את הממוצע שלהם.


//        System.out.println("please enter number");
//        int count = scanner.nextInt();
//
//        int sum = 0;
//
//        for (int i=0; i<count;i++){
//            System.out.println("please enter number");
//            int x = scanner.nextInt();
//            sum  = sum + x ;           //sum+=x
//        }
//
//        System.out.println("the avg: " + (sum/count));




//        תרגיל 8:
//        כתבו תוכנית הקולטת
//        מהמשתמש מספרים שלמים עד אשר הוקלדו בדיוק חמישה מספרים זוגיים.

//        int evenCount = 0;
//        while (evenCount<5){
//            System.out.println("please enter a even number");
//            int number = scanner.nextInt();
//            if (number%2==0){
//                evenCount++;
//            }
//        }


//        תרגיל 11:
//        כתבו תוכנית הקולטת מהמשתמש מספרים שלמים עד אשר הוקלדו שלושה מספרים
//        תלת-ספרתיים שכל הספרות שלהם זהות. לדוגמה: 333, 777, 888 וכו'.

//        int count = 0;
//        while (count<3){
//            System.out.println("please...");
//            int number = scanner.nextInt();
//            if (number>99 && number<1000){
//                //אחדות - %10
//                //עשרות-/10%10
//                //מאות-/100
//              if (number%10==number/10%10 && number%10==number/100){
//                  count++;
//              }
//            }
//        }


//        תרגיל 12:
//        כתבו תוכנית הקולטת מהמשתמש מספר limit ומדמה את המשחק "7 בום":
//        התוכנית תדפיס
//        את כל המספרים מ-1 ועד limit, אבל כל פעם שהיא נתקלת במספר שהוא
//        כפולה של 7 או מכיל את הספרה 7
//        , תוצג המילה BOOM במקום המספר.


//        System.out.println("please...");
//        int limit = scanner.nextInt();
//
//        boolean contains7 = false;
//        for (int i=1; i<limit;i++){
//            contains7=false;
//            if (i%7==0) {
//                contains7 = true;
//            }else {
//                int number =  i;
//                while (number>0){
//                    if (number%10==7){
//                        contains7=true;
//                        break;
//                    }
//                        number= number/10;
//                }
//            }
          //  if (contains7==true){   //if(contains7) =>true
//                System.out.println("BOOM");
//            }else {
//                System.out.println(i);
//            }

           // if (contains7==false) // if (!contains7) =>false
       // }


        /// רק להדפיס אם מכיל את הספרה 7 או לא

//        int number = 878;
//        while (number>0){
//            if (number%10==7){
//                System.out.println("BOOM");
//            }else {
//                number = number/10; // number/=10
//            }
//        }

        //מעבר על ספרות של מספר
//        while (number>0){
//            System.out.println(number%10);
//            number/=10;
//        }


//        תרגיל 13:
//        כתבו תוכנית הקולטת מהמשתמש מספרים שלמים בזה אחר זה,
//        ועוצרת לאחר שהוקלדו ברצף שלושה מספרים עוקבים בסדר עולה.

        System.out.println("please...");
        int previous = scanner.nextInt();

        int count = 1;
        while (count < 3){
            System.out.println("please...");
            int current = scanner.nextInt();

            if ((previous + 1) == current){
                count++;
            }else {
                count = 1;
            }
            previous = current;
        }

    }




}
