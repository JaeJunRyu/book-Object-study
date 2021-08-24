package step01;

import java.time.Duration;

public class Movie {
    private String title;  //제목
    private Duration runningTime; //상영시간
    private Money fee; //기본요금
    private DiscountPolicy discountPolicy; //할인정책

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return null;
    }

    public Money calculateMovieFee(Screening screening) { //1인당 예매 요금 계산
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));  //할인 요금을 구하고 그만큼 요금 차감
    }
}
