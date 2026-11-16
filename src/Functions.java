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

}
