package backend.ticket;

import jakarta.persistence.*;

@Entity

@Table(name = "tickets")

public class Ticket {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;

    public Long getId() { return id; }

    @Column(name = "enrolled_people") private String name;

    public String getName() { return name; }

    @Column(unique = true, name = "email_addresses") private String email;

    public String getEmail() { return email; }

    @Column(unique = true, name = "github_accounts") private String github;

    public String getGithub() { return github; }

    @Lob @Column(name = "photos", columnDefinition="BLOB") private byte[] image;

    public byte[] getImage() { return image; }

    public Ticket () {}

    public Ticket (DataTransferTicket receivedTicket) {

        name = receivedTicket.name();

        email = receivedTicket.email();

        github = receivedTicket.github();

        image = receivedTicket.image();
    }

    public Ticket (String name, String email, String github, byte[] image) {

        this.name = name;

        this.email = email;

        this.github = github;

        this.image = image;
    }
}