public class Arrays1_1 {
    public static void main(String[] args) {
        //int[] age; // 참조변수 배열 age 생성
        // 참조변수 배열은 배열의 가장 첫 번째 요소의 주소를 가리킴
        //age = new int[5]; // 사이즈가 5인 배열의 생성
        int[] age = new int[5];
        age[3] = 28;
        System.out.println("age[3] = " + age[3]);

        int beatitudoAge = age[3];
        System.out.println("beatitudoAge = " + beatitudoAge);

        System.out.println("age배열의 전체값 확인");
        System.out.println("age[0] = " + age[0]);
        System.out.println("age[1] = " + age[1]);
        System.out.println("age[2] = " + age[2]);
        System.out.println("age[3] = " + age[3]);
        System.out.println("age[4] = " + age[4]);
    }
}
