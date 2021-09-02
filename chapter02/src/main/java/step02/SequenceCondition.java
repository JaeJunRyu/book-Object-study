package step02;

//순번 조건
public class SequenceCondition implements DiscountCondition {

    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) { //상영 순번과 일치할 경우 할인 가능 true 아니면 false
        return screening.isSequence(sequence);
    }
}
