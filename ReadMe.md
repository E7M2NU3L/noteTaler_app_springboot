# Notes Taker API

## Overview
The Notes Taker API is a Spring Boot application that allows users to create, read, update, and delete notes. Each note can have a title, description, and an important flag to mark its significance.

## Features
- Create new notes
- Retrieve all notes
- Update existing notes
- Delete notes
- Mark notes as important

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Jakarta Persistence
- Lombok

## Project Structure
The project is organized into several packages:

- **controllers**: Contains the `NotesController` class, which handles HTTP requests and responses.
- **model**: Contains the `Notes` class, which represents the note entity.
- **repository**: Contains the `NotesRepository` interface, which extends `JpaRepository` for database operations.
- **services**: Contains the `NotesServices` class, which contains the business logic for managing notes.

## Endpoints
### GET /notes
Fetches all notes and returns them in a view.

### POST /notes
Creates a new note with the provided title and description.

### GET /{id}/delete
Deletes the note with the specified ID.

### POST /{id}/update
Updates the note with the specified ID using the provided title and description.

### GET /{id}/important
Toggles the important status of the note with the specified ID.

## Setup Instructions
1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```bash
   cd notes-taker-api
   ```

3. Build the project using Maven:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

5. Access the application at `http://localhost:8080`.

## Contributing
Contributions are welcome! Please open an issue or submit a pull request for any enhancements or bug fixes.

## License
This project is licensed under the MIT License.