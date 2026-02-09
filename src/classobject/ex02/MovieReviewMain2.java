package classobject.ex02;

import classobject.ex01.MovieReview;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview ins1 = new MovieReview();
        MovieReview ins2 = new MovieReview();

        ins1.title = "주토피아";
        ins1.review = "닉 주디가 너무 귀여워요";

        ins2.title = "겨울왕국";
        ins2.review = "올라프가 너무 귀여워요";

        String[] arr = { ins1.review, ins2.review };

        for (String str : arr) {
            System.out.println(str);
        }
    }
}
