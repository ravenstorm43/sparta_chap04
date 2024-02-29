public class Arrays3_2 {
    public static void main(String[] args) {
        int sum = 0; // 총합을 저장
        float avg = 0f; // 평균을 저장

        int[] score = {100, 40, 33, 50, 77, 29};

        for (int i = 0; i < score.length; i++) {
            System.out.println("score[" + i + "] = " + score[i]);
            sum += score[i];
        }

        avg = sum / (float) (score.length); // float형으로 변환하지 않으면 소숫점이 잘린 평균이 나옴

        System.out.println("총합 = " + sum);
        System.out.println("평균 = " + avg);
    }
}
