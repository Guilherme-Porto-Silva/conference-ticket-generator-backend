package backend.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

public class TicketServices {

    @Autowired private TicketsRepository BOX_OFFICE;

    public DataTransferTicket buildTicket (String name, String email, String github, MultipartFile image) {

        return new DataTransferTicket(name, email, github, image);
    }

    public void save (DataTransferTicket receivedTicket) {

        Ticket savedTicket = new Ticket(receivedTicket);

        BOX_OFFICE.save(savedTicket);
    }
}