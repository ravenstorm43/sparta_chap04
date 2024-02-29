import java.util.Arrays;

public class Arrays4_1 {
    public static void main(String[] args) {
        String str = "ABCDEFG";
        char ch = str.charAt(3);
        System.out.println("ch = " + ch); // ch = D

        String str2 = str.substring(1, 4);
        System.out.println("str2 = " + str2); // str2 = BCD

        String str3 = str.substring(1);
        System.out.println("str3 = " + str3); // str3 = BCDEFG substring()함수의 두 번째 매게변수의 디폴트 값은 str3.length

        String str4 = str.substring(1, str.length());
        System.out.println("str4 = " + str4); // str4 = BCDEFG

        char[] chArr = str.toCharArray(); // String을 char배열로 변환
        System.out.println("Arrays.toString(chArr) = " + Arrays.toString(chArr));
    }
}
