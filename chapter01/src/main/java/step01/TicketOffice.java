package step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice { //매표소
    private Long amount; //티켓 판매 금액
    private List<Ticket> tickets = new ArrayList<>(); //티켓 목록

    public TicketOffice(Long amount, Ticket ...tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public Ticket getTicket() { //티켓 판매 메서드
        for (Ticket ticket : tickets) {
            System.out.println("티켓 정보 : " + ticket);
        }
        System.out.println("총 티켓 수는 ? : " + tickets.size());
        final Ticket remove = tickets.remove(0);
        System.out.println("현재 남은 티켓 수는 ? : " + tickets.size());
        return remove;
    }

    public void minusAmount(Long amount) { //판매 금액 차감
        this.amount -= amount;
    }

    public void plusAmount(Long amount) { //판매 금액 증감
        this.amount += amount;
    }

    @Override
    public String toString() {
        return "TicketOffice{" +
                "amount=" + amount +
                ", tickets=" + tickets +
                '}';
    }
}

