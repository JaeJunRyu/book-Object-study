package step01;

public class Theater { //소극장
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        if(audience.getBag().hasInvitation()) { //관람객의 가방안에 초대장이 들어 있는지 확인
            //이벤트에 당첨된 관람객
            final Ticket ticket = ticketSeller.getTicketOffice().getTicket(); //가장 첫번째 티켓을 가져옴
            System.out.println("첫번째 티켓을 가져오자!! = " + ticket);

            //판매원에게서 받은 티켓을 관람객의 가방안에 넣어준다
            System.out.println("손님 가방에 티켓을 넣기전 상태 = " + audience.getBag());
            audience.getBag().setTicket(ticket);
            System.out.println("손님 가방에 티켓을 넣어주자??? = " + audience.getBag());
        } else { //초대장이 없을 경우
            final Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            System.out.println("첫번째 티켓을 가져오자!! = " + ticket);

            //소극장은 관람객의 가방에서 티켓 금액 만큼 차감
            System.out.println("손님 가방에서 돈을 꺼내서 수수료를 계산 전 : " + audience.getBag());
            audience.getBag().minusAmount(ticket.getFee());
            System.out.println("손님 가방에서 돈을 꺼내서 수수료를 계산 후 : " + audience.getBag());

            //매표소 금액 증가
            System.out.println("매표소 계산전 상태 : " + ticketSeller.getTicketOffice());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            System.out.println("매표소 계산후 상태 : " + ticketSeller.getTicketOffice());
            //소극장이 관람객의 가방안에 티켓을 넣어준다.
            System.out.println("손님 가방에 티켓을 넣기전 상태 = " + audience.getBag());
            audience.getBag().setTicket(ticket);
            System.out.println("손님 가방에 티켓을 넣어주자??? = " + audience.getBag());
        }
    }
}
