import java.util.Scanner;

public class Str {
    public static void main(String[] args) {

        String str= "abcde";
        System.out.println(str);
        //אורך מחרוזת
        System.out.println(str.length());
        //גישה לתו
        System.out.println(str.charAt(1));

        //מעבר על כל תווי המחרוזת
        for (int i=0; i<str.length();i++){
            System.out.println(str.charAt(i));
        }

       String fullName =  function1("abc" ,"try");
        System.out.println(fullName);
        System.out.println( function4());
    }

//    כתבו פונקציה המקבלת שתי מחרוזות כפרמטרים:
//    firstName ו-lastName שמייצגות את השם הפרטי ואת שם המשפחה של המשתמש בהתאמה.
//    המחרוזת תחזיר מחרוזת שהיא השם המלא של המשתמש,
//    כך שהשם הפרטי יופיע קודם, ואז רווח, ואז שם המשפחה.
    public static String function1(String firstName,String lastName){
        return firstName+ " " + lastName; //ab tr
    }

//    תרגיל 2:
//    כתבו פונקציה המקבלת
//    כפרמטרים שתי מחרוזות ומדפיסה על המסך את המחרוזת הארוכה מבין השתיים.

    public static void function2(String first, String second){
        if (first.length() > second.length()){
            System.out.println(first);
        }else {
            System.out.println(second);
        }
    }
//    תרגיל 3:
//    כתבו פונקציה המקבלת מחרוזת ומספר שלם,
//    ומחזירה תשובה חיובית אם המחרוזת היא בדיוק באורך המספר השלם.

    public static boolean function3(String str, int num){
        if (str.length() == num){
            return true;
        }
        return false;
    }
//    תרגיל 4:
//    כתבו פונקציה הקולטת מהמשתמש שתי מחרוזות ומחזירה: 1 – אם המחרוזות זהות;
//    2 – אם המחרוזות לא זהות אך מתחילות באותה האות; 3 – עבור כל אפשרות אחרת.

    public static int function4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter str 1: ");
        String str1 = scanner.nextLine();
        System.out.println("please enter str 2: ");
        String str2 = scanner.nextLine();

        //שיוויון בין מחרוזות 
        if (str1.equals(str2)){
            return 1;
        } else if (str1.charAt(0)==str2.charAt(0)) {
            return 2;
        }else {
            return 3;
        }
        //מחרוזות לא שוות
//        if (!str1.equals(str2)){
//
//        }
    }

//    תרגיל 5:
//    כתבו פונקציה המקבלת מחרוזת text ותו toCount,
//    ומחזירה את כמות הפעמים שהתו toCount מופיע במחרוזת text.

    public static int function5(String text,char toCount){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
           if (toCount == text.charAt(i)){
               count++;
           }
        }
        return count;
    }

//    תרגיל 6:
//    כתבו פונקציה המקבלת שתי מחרוזות כקלט ומחזירה תשובה בוליאנית
//    באשר לשאלה האם הן זהות
//    , ללא שימוש במתודה equals.

    public static boolean function6(String str1,String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        for (int i = 0; i < str1.length() ;i++){
            if (str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

}
