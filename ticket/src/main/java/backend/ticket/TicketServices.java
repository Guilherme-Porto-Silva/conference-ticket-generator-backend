package backend.ticket;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service public class TicketServices {
    
    private final TicketsRepository boxOffice;

    public TicketServices (TicketsRepository boxOffice) { this.boxOffice = boxOffice; }

    public Ticket buildTicket (String name, String email, String github, byte[] image) {

        return new Ticket(name, email, github, image);
    }

    @Transactional public Ticket save (Ticket ticket) {

        return boxOffice.save(ticket);
    }

    public DataTransferTicket ticketToDTO (Ticket ticket) {

        return new DataTransferTicket(ticket.getId(), ticket.getName(), ticket.getEmail(), ticket.getGithub(), ticket.getImage());
    }
}