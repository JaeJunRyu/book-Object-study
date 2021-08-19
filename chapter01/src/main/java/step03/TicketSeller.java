package step03;

public class TicketSeller { //판매원
    private TicketOffice ticketOffice; //매표소

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience){
        final Ticket ticket = ticketOffice.getTicket(); //가장 첫번째 티켓을 가져옴
        final Long amount = audience.buy(ticket);
        System.out.println("매표소에 티켓 지불 금액을 준다 : " + amount);
        ticketOffice.plusAmount(amount);

    }
}
