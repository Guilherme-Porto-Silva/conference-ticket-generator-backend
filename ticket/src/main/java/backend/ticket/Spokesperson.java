package backend.ticket;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@RestController

public class Spokesperson {

    private final TicketServices ticketServices;

    public Spokesperson (TicketServices ticketServices) {

        // Constructor Injection

        this.ticketServices = ticketServices;
    }

    @PostMapping("/generate-ticket") public DataTransferTicket ticketCallAnswer

(@RequestParam String name, @RequestParam String email, @RequestParam String github, @RequestParam MultipartFile image) throws IOException {

        return ticketServices.ticketToDTO(ticketServices.save(ticketServices.buildTicket(name, email, github, image.getBytes())));
    }
}