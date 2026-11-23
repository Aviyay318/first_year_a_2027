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
    }

//    כתבו פונקציה המקבלת שתי מחרוזות כפרמטרים:
//    firstName ו-lastName שמייצגות את השם הפרטי ואת שם המשפחה של המשתמש בהתאמה.
//    המחרוזת תחזיר מחרוזת שהיא השם המלא של המשתמש,
//    כך שהשם הפרטי יופיע קודם, ואז רווח, ואז שם המשפחה.
    public static String function1(String firstName,String lastName){
        return firstName+ " " + lastName; //ab tr
    }

}
