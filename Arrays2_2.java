public class Arrays2_2 {
    public static void main(String[] args) {
        int[] num1 = new int[]{1,2,3,4,5,6,7,8,9}; // 배열의 선언과 동시에 초기화
        int[] num2 = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < num1.length; i++) {
            System.out.println("num1[" + i + "] = " + num1[i]);
        }
        System.out.println();

        //int[] num3;
        //num3 = {1,2,3,4,5,6,7,8,9}; // 배열의 값을 초기화하기 위해선 원하는 사이즈의 배열을 생성해야함
        int[] num4;
        num4 = new int[]{1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < num4.length; i++) {
            System.out.println("num4[" + i + "] = " + num4[i]);
        }
    }
}
