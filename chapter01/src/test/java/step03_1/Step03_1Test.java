package step03_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class Step03_1Test {

    @Test
    @DisplayName("초대장이 있을 경우")
    public void enterTest(){
        //given
        Ticket ticket1 = new Ticket("티켓1",100l);
        Ticket ticket2 = new Ticket("티켓2",200l);
        Ticket ticket3 = new Ticket("티켓3",300l);

        TicketOffice ticketOffice = new TicketOffice(1000l, ticket1, ticket2, ticket3);
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);
        Theater theater =  new Theater(ticketSeller);

        Invitation invitation = new Invitation(LocalDateTime.now());
        Bag bag = new Bag(invitation);
        Audience audience = new Audience(bag);
        //when
        theater.enter(audience);

        System.out.println("가방 객체 : " + bag);
        //then
    }


    @Test
    @DisplayName("초대장이 없을 경우")
    public void enterTest2(){
        //given
        Ticket ticket1 = new Ticket("티켓1",100l);
        Ticket ticket2 = new Ticket("티켓2",200l);
        Ticket ticket3 = new Ticket("티켓3",300l);

        TicketOffice ticketOffice = new TicketOffice(1000l, ticket1, ticket2, ticket3);
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);
        Theater theater =  new Theater(ticketSeller);

        Bag bag = new Bag(10000l);
        Audience audience = new Audience(bag);
        //when
        theater.enter(audience);

        System.out.println("가방 객체 : " + bag);
        //then
    }

}