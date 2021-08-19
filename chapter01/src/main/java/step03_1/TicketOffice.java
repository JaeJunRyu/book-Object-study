package step03_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice { //매표소
    private Long amount; //티켓 판매 금액
    private List<Ticket> tickets = new ArrayList<>(); //티켓 목록

    public TicketOffice(Long amount, Ticket...tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public void sellTicketTo(Audience audience) {
        final Ticket ticket = this.getTicket(); //가장 첫번째 티켓을 가져옴
        final Long amount = audience.buy(ticket);
        System.out.println("매표소에 티켓 지불 금액을 준다 : " + amount);
        this.plusAmount(amount);
    }

    private Ticket getTicket() { //티켓 판매 메서드
        for (Ticket ticket : tickets) {
            System.out.println("티켓 정보 : " + ticket);
        }
        System.out.println("총 티켓 수는 ? : " + tickets.size());
        final Ticket remove = tickets.remove(0);
        System.out.println("현재 남은 티켓 수는 ? : " + tickets.size());
        return remove;
    }

    private void minusAmount(Long amount) { //판매 금액 차감
        this.amount -= amount;
    }

    private void plusAmount(Long amount) { //판매 금액 증감
        if(amount > 0) {
            this.amount += amount;
        }
    }

    @Override
    public String toString() {
        return "TicketOffice{" +
                "amount=" + amount +
                ", tickets=" + tickets +
                '}';
    }
}

