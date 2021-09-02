package step01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class step01Test {


    @Test
    @DisplayName("영화 아바타에 대한 할인 정책과 할인 조건을 설정한 테스트 코드" +
            "할인 정책으로 금액할인 정책 적용")
    void movieTest1() {
        Movie avatar = new Movie("아바타", Duration.ofMinutes(120), Money.wons(10000),
                new AmountDiscountPolicy(Money.wons(800),
                    new SequenceCondition(1),
                    new SequenceCondition(10),
                    new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
                    new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(20, 59))
                )
        );

        Screening screening = new Screening(avatar, 2, LocalDateTime.of(2021,9, 2, 12, 00, 00));

        final Money money = avatar.calculateMovieFee(screening);
        System.out.println("남은돈은? " + money);
    }

    @Test
    @DisplayName("영화 타이타닉 할인정책" +
            "10%의 비율할인 정책" +
            "두개의 기간 조건과 한개의 순서 조건을 이용해 할인 여부를 판단")
    void movieTest2() {
        Movie titanic = new Movie("타이타닉", Duration.ofMinutes(180), Money.wons(11000),
                new PercentDiscountPolicy(0.1,
                        new PeriodCondition(DayOfWeek.TUESDAY, LocalTime.of(14, 0), LocalTime.of(16, 59)),
                        new SequenceCondition(2),
                        new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(13, 59))
                )
        );

        Screening screening = new Screening(titanic, 2, LocalDateTime.of(2021,9, 2, 12, 00, 00));
        final Money money = titanic.calculateMovieFee(screening);
        System.out.println("남은돈은? = " + money);
    }

    @DisplayName("스타워즈:깨어난 포스")
    @Test
    void movieTest3() {
        Movie star = new Movie("스타워즈:깨어난포스", Duration.ofMinutes(180), Money.wons(10000), null);
        Screening screening = new Screening(star, 3, LocalDateTime.of(2021,9, 2, 12, 00, 00));
        final Money money = star.calculateMovieFee(screening);
        System.out.println("money = " + money);
    }



}