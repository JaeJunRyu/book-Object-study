package step02;

import java.time.LocalDateTime;

public class Screening {
    private Movie movie;  //영화
    private int sequence; //순번
    private LocalDateTime whenScreened; //상영 시작 시간

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public LocalDateTime getStartTime() { //상영 시작시간을 반환
        return whenScreened;
    }

    public boolean isSequence(int sequence) { //순번의 일치 여부 검사
        return this.sequence == sequence;
    }

    public Money getMovieFee() { //기본요금 반환
        return movie.getFee();
    }

    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    private Money calculateFee(int audienceCount) { //요금 계산
        return movie.calculateMovieFee(this).times(audienceCount);
    }

}
