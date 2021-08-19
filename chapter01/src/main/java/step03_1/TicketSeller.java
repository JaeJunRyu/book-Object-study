package step03_1;

public class TicketSeller { //판매원
    private TicketOffice ticketOffice; //매표소

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience){
        ticketOffice.sellTicketTo(audience);
    }
}
