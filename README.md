# **Ticket Generation Backend**

A Spring Boot application designed to handle ticket registrations, including user details and image uploads. The application uses Spring Data JPA for persistence and PostgreSQL as the primary database.

## **🚀 Features**

* **Multipart File Support**: Allows users to upload profile photos or event images.

* **Data Transfer Objects**: Uses Java Records (DataTransferTicket) for clean and immutable data handling.

* **Automated Persistence**: Integrates with Spring Data JPA for easy database interactions.

* **Validation-Ready**: Database constraints ensure unique emails and GitHub accounts.

## **🛠️ Tech Stack**

* **Java 17+**

* **Spring Boot**

* **Spring Data JPA**

* **PostgreSQL** (with HSQLDialect configuration)

* **Hibernate**

## **📂 Project Structure**

* Spokesperson.java: The REST Controller handling incoming HTTP requests.

* TicketServices.java: The business logic layer for building and saving tickets.

* Ticket.java: The JPA Entity representing the database table tickets.

* TicketsRepository.java: Interface for CRUD operations.

* DataTransferTicket.java: A record used to transport data between layers.

* GlobalExceptionHandler.java: A handler for the exceptions the backend itself might throw

## **🚦 API Endpoints**

### **Generate Ticket**

Processes user information and an image to create a new ticket entry.

**URL**: /generate-ticket

**Method**: POST

**Content-Type**: multipart/form-data

**Parameters**:

| Name | Type | Description |
| :---- | :---- | :---- |
| name | String | Full name of the attendee. |
| email | String | Unique email address. |
| github | String | GitHub username. |
| image | byte[] | Multipart image file (photo). |

**Response**:

Returns the DataTransferTicket object as JSON.

## **⚙️ Configuration**

The application requires the following environment variables to be set in your system or your application.properties:

* DB\_HOST: Database server address.

* DB\_NAME: Name of the database.

* DB\_USER: Database username.

* DB\_PASSWORD: Database password.

Developed for the backend ticket generation system of the ticket generator chalenge I had done for Frontend Mentor.

[You can find the frontend repository for this project here.](https://github.com/Guilherme-Porto-Silva/conferenceTicketGeneratorByGuigui-chan)
