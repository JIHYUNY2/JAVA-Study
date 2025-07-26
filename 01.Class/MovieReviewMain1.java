public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "우주영화 재밋음";
        reviews[0] = inception;

        MovieReview nightmare = new MovieReview();
        nightmare.title = "나이트메어";
        nightmare.review = "공포영화 무서워";
        reviews[1] = nightmare;

        for (MovieReview movieReview : reviews) {
            System.out.println("영화제목 : " + movieReview.title + " 리뷰 : " + movieReview.review);
        }

    }

}