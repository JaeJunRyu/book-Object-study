package step01;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);  //할인이 가능하면 true, 불가능 하면 false
}
