package step01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class Step01Test {

    @Test
    @DisplayName("초대장이 있는 사용자")
    public void step01_invitation(){
        Long amount = 1000l; //티켓 판매 금액
        Ticket ticket1 = new Ticket("티켓1"); //티켓1
        Ticket ticket2 = new Ticket("티켓2"); //티켓2
        Ticket ticket3 = new Ticket("티켓3"); //티켓3

        TicketOffice ticketOffice = new TicketOffice(amount, ticket1, ticket2, ticket3); //매표소
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);   //판매원

        LocalDateTime when = LocalDateTime.now(); //초대일자
        Invitation invitation = new Invitation(when); //초대장

        Bag bag = new Bag(invitation); //가방
        Audience audience =  new Audience(bag); //손님

        Theater theater = new Theater(ticketSeller); //소극장
        theater.enter(audience); //프로세스
    }

    @Test
    @DisplayName("초대장이 없는 사용자")
    public void step01_invitation2(){
        Ticket ticket1 = new Ticket("티켓1", 100l); //티켓1
        Ticket ticket2 = new Ticket("티켓2", 200l); //티켓2
        Ticket ticket3 = new Ticket("티켓3", 300l); //티켓3

        TicketOffice ticketOffice = new TicketOffice(10000l, ticket1, ticket2, ticket3); //매표소
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);

        Bag bag = new Bag(20000l);
        Audience audience =  new Audience(bag);

        Theater theater = new Theater(ticketSeller);
        theater.enter(audience);
    }



}