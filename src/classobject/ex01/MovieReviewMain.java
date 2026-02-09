package classobject.ex01;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview = new MovieReview();
        movieReview.title = "주토피아";
        movieReview.review = "닉 주디 너무 조아";

        System.out.println(movieReview.title);

    }
}
