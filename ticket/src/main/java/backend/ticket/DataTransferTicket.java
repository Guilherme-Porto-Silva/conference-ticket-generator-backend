package backend.ticket;

import org.springframework.web.multipart.MultipartFile;

public record DataTransferTicket (String name, String email, String github, MultipartFile image) {}