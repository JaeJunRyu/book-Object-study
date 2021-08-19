package step02;

public class Audience { //관람객
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        if(bag.hasInvitation()) {  //초대장이 있을 경우
            System.out.println("초대장이 있을 경우");
            bag.setTicket(ticket);
            System.out.println("가방에 티켓을 넣음 : " + ticket);
            return 0l;
        } else { //초대장이 없을 경우
            System.out.println("초대장이 없을 경우");
            bag.minusAmount(ticket.getFee());
            System.out.println("티켓금액을 지불한다. : " + ticket);
            bag.setTicket(ticket);
            System.out.println("가방에 티켓을 넣음 : " + ticket);
            return ticket.getFee();
        }
    }
}
