package backend.ticket;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController

public class Spokesperson {

    private final TicketServices SERVICES = new TicketServices();

    @PostMapping("/generate-ticket") public DataTransferTicket ticketCallAnswer

(@RequestParam String name, @RequestParam String email, @RequestParam String github, @RequestParam MultipartFile image) {

        DataTransferTicket ticket = SERVICES.buildTicket(name, email, github, image);

        SERVICES.save(ticket);

        return ticket;
    }
}