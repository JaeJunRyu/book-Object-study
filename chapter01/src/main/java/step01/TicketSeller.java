package step01;

public class TicketSeller { //판매원
    private TicketOffice ticketOffice; //매표소

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
