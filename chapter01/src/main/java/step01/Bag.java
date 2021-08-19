package step01;

public class Bag {
    private Long amount; //현금
    private Invitation invitation;  //초대장
    private Ticket ticket; //티켓

    public boolean hasInvitation() { //초대장 보여 여부 체크
        return invitation != null;
    }

    public boolean hasTicket() { //티켓 소유여부 체크
        return ticket != null;
    }

    public void setTicket(Ticket ticket) { //초대장을 티켓으로 교환 메서드
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) { //현금 감소
        this.amount -= amount;
    }

    public void plusAmount(Long amount) { //현금 증가
        this.amount += amount;
    }

    public Bag(Long amount) {
        this(amount, null);
    }

    public Bag(Invitation invitation) {
        this(0l, invitation);
    }

    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "amount=" + amount +
                ", invitation=" + invitation +
                ", ticket=" + ticket +
                '}';
    }
}
