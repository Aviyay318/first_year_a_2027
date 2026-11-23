import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        String fullName = "Asi choen";

        System.out.println(function("abcccdf","cccg"));
        //subString(start,end)
        System.out.println(fullName.substring(0,3));
        System.out.println(fullName.substring(1,5));
        //subString(start)
        System.out.println(fullName.substring(4));

        //indexOf
        String word = "i xfjbgvjdfb love pasta";
        int index = word.indexOf("love"); //אם לא קיים יחזיר -1
        System.out.println("index of : " + index);
        System.out.println(word.substring(index,index+4));

        //contains - > מקבלת מחרוזת ומחזירה תשובה בוליאנית אם המחרוזת מוכלת במחזרות השנייה
//        if (fullName.contains("si")){
//
//        }




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

       String fullName1 =  function1("abc" ,"try");
        System.out.println(fullName1);
        System.out.println( function4());
        function11("abcd");



        //charAt() -> מקבלת מספר אינדקס מיקום, ומחזירה את התו במיקום ששלחנו לה
        //length() -> אורך של מחרוזת
        //equals() ->מקבלת מחרוזת ומחזירה תשובה בוליאנית אם המחזרות שוות
        //שרשור - חיבור של תווים או מחרווזת +
        //contains
        //indexOf
        //replace
        //subString

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

//    תרגיל 11:
//    כתבו פונקציה המקבלת מחרוזת כפרמטר
//    ומחזירה מחרוזת חדשה בהיפוך אותיות של המחרוזת המקורית.

    public static String function11(String str){
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
//        }
        //המיקום של התו האחרון -> האורך של המחרוזת פחות 1
        //ריצה מהסוף להתחלה של מחרוזת
        String revers = "";
        for (int i = str.length()-1; i>=0 ;i--){
          revers+=str.charAt(i); //revers = revers + str.charAt(i)
        }
        return revers;
    }
//
//    תרגיל 12:
//    כתבו פונקציה המבקשת מהמשתמש להכניס סיסמה חזקה.
//    סיסמה חזקה עונה על הדרישות הבאות:
//            -אורכה הוא 8-10 תווים
//-בסיסמה יש לפחות תו אחד מבין הבאים: _, $ או %.

    public static boolean function12(String password){
        if (password.length() >=8 && password.length() <=10){
//           if (password.indexOf("$")!=-1 || password.indexOf("%")!=-1){
//               return true;
//           }else {
//               return false;
//           }
            if (password.contains("%")||password.contains("$")){
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }
    }
    //יש לכתוב פונקציה שמקבלת 2 מחרוזות ובודקת אם המחזורת השנייה הקיימץת בראשונה
    //במידה וכן יש להחזיר את המחרוזת הראשןנה אחרי שהסרנו מתוכה אץ השנייה
    //לדוגמא
    //str1 = "abcccdef" , str2 = "ccc"
    //יחזור-> abdef
    //הסרנו את הCCC מהמחרוזץ הראשונה
    //אם המחרוזת לא קיימת בראשונה נחזיר את צירוף הראשונה והשנייה ביחד
    //לדוגמא
    //str1 = "abyyydef" , str2 = "ccc"
    //יחזור-> abyyydefccc

    public static String function(String str1 ,String str2){
        if (str1.contains(str2)){
            int indexStart = str1.indexOf(str2);
            String tempStr=str1.substring(0,indexStart);
            tempStr+=str1.substring(indexStart + str2.length());
            return tempStr;
        }else {
            return str1 + str2;
        }
    }


    public static void functionNewWay(String str1 ,String str2){
        //replace
        String str = "i love pasta";
        str = str.replace("pasta","book");

        if (str1.contains(str2)) {
            str1 = str1.replace(str2,"");
        }
    }
}
