/*public class Report5 {
    public static void main(String[] args) {
         String str = null;
        System.out.println(str.length());        
    }

}*/

public class Report5 {
    public static void main(String[] args) {
        // 条件1: String型変数 str を宣言し、初期値として null を代入する。
        String str = null;

        // 条件2: str.length() の内容を表示しようとする。
        try {
            System.out.println("Stringの長さ: " + str.length());
        } catch (java.lang.NullPointerException err) {
            // NullPointerExceptionが発生した場合の処理
            System.out.println("java.lang.NullPointerExceptionが発生しました。");
            System.out.println(err.getMessage());
        }
    }
}