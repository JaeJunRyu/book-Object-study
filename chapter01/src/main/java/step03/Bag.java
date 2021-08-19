package step03;

public class Bag {
    private Long amount; //현금
    private Invitation invitation;  //초대장
    private Ticket ticket; //티켓

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

    private boolean hasInvitation() { //초대장 보여 여부 체크
        return invitation != null;
    }

    private void setTicket(Ticket ticket) { //초대장을 티켓으로 교환 메서드
        this.ticket = ticket;
    }

    private void minusAmount(Long amount) { //현금 감소
        this.amount -= amount;
    }

    private void plusAmount(Long amount) { //현금 증가
        this.amount += amount;
    }

    public Long hold(Ticket ticket){
        if(this.hasInvitation()) {  //초대장이 있을 경우
            System.out.println("초대장이 있을 경우");
            this.setTicket(ticket);
            System.out.println("가방에 티켓을 넣음 : " + ticket);
            return 0l;
        } else { //초대장이 없을 경우
            System.out.println("초대장이 없을 경우");
            this.minusAmount(ticket.getFee());
            System.out.println("티켓금액을 지불한다. : " + ticket);
            this.setTicket(ticket);
            System.out.println("가방에 티켓을 넣음 : " + ticket);
            return ticket.getFee();
        }
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
