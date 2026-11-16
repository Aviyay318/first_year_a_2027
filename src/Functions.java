import java.util.Random;
import java.util.Scanner;

public class Functions {


    public static void main(String[] args) {
        int x= 5;
        int y= 7;
        int z =17;
       boolean bigger = function1(15,17,88);
        System.out.println(bigger);
        System.out.println(function1(20,30,50));
       boolean bigger2 = function1(x,y,z);

    }

//    כתבו פונקציה המקבלת שלושה מספרים ומחזירה תשובה חיובית במידה וכל השלושה גדולים מ-10.
    public static boolean function1(int num1, int num2, int num3){
        boolean biggerThan10 =false;
        if(num1>10&&num2>10&&num3>10){
           biggerThan10 = true;
        }
        return biggerThan10;
    }

//    כתבו פונקציה המקבלת שני מספרים שלמים
//    ואז מחזירה תשובה חיובית במידה והמספר הראשון מתחלק במספר השני ללא שארית.
    public static boolean function2(int num1, int num2){
        if(num1 % num2 == 0){
            return true;
        }
        return false;
    }

//    כתבו פונקציה המקבלת מספר שלם number ואז מדפיסה
//    number מספרים שלמים אקראיים בטווח של 0 עד number.

    public static void function4(int number){
        Random random = new Random();
        for (int i=0;i<number;i++){
            System.out.println(random.nextInt(number));
        }
    }



    public static int function5(int number){
       Scanner scanner = new Scanner(System.in);
       int max = 0;
        for (int i = 0; i < number; i++) {
           int input = scanner.nextInt();
           if (input > max){
               max = input;
           }
        }
        return max;
    }

//    כתבו פונקציה המקבלת מספר שלם totalStudents,
//    ואז קולטת מבקשת מהמשתמש להכניס totalStudents ציונים של סטודנטים.
//    לאחר קליטת totalStudents ציונים, התוכנית תחשב את ממוצע הציונים.
//    אם ממוצע הציונים הוא מעל 60,
//    התוכנית תחזיר true, אחרת היא תחזיר false.

    public static boolean function6(int totalStudents){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < totalStudents; i++) {
            System.out.println("please enter student grade:");
            int grade = scanner.nextInt();
            sum+=grade; //sum = sum + grade
        }
        int avg = sum/totalStudents;
        if (avg>60){
            return true;
        }else{
            return false;
        }
    }


//    כתבו פונקציה המקבלת מספר שלם number ואז מדפיסה number מספרים שלמים אקראיים המתחלקים
//    ב-number ללא שארית.
    public static void function7(int number){
        Random random = new Random();
        for (int i = 0; i < number; i++) {
           int x = random.nextInt(1,20);
            System.out.println(x*number);
        }
    }

//    כתבו פונקציה המקבלת מספר שלם number ואז מדפיסה את לוח הכפל בגודל number.
    public static void function10(int number){
        for(int i =1;i<=number;i++){
            for (int j=1;j<=number;j++){
                System.out.print(i*j);
            }
        }
    }
}
