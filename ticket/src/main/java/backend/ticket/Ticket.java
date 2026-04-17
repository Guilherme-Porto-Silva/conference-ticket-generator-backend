package backend.ticket;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.web.multipart.MultipartFile;

@Entity

@Table(name = "tickets")

public class Ticket {

    @Column(name = "enrolled_people") private String name;

    @Column(unique = true, name = "email_addresses") private String email;

    @Column(unique = true, name = "github_accounts") private String github;

    @Column(name = "photos") private MultipartFile image;

    public Ticket () {}

    public Ticket(DataTransferTicket receivedTicket) {

        name = receivedTicket.name();

        email = receivedTicket.email();

        github = receivedTicket.github();

        image = receivedTicket.image();
    }
}