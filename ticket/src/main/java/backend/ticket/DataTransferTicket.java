package backend.ticket;

public record DataTransferTicket (Long id, String name, String email, String github, byte[] image) {}