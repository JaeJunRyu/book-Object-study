package step02;

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
        return fee;
    }

    public Money calculateMovieFee(Screening screening) { //1인당 예매 요금 계산
//        if(discountPolicy == null) { //할인 정책이 없는 경우를 예외 케이스로 취급 한다.
//            return fee;
//        }

        return fee.minus(discountPolicy.calculateDiscountAmount(screening));  //할인 요금을 구하고 그만큼 요금 차감
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", runningTime=" + runningTime +
                ", fee=" + fee +
                ", discountPolicy=" + discountPolicy +
                '}';
    }
}
