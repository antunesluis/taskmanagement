# Task Manager API

Task and Project Management System developed in Java with Spring Boot and SQLite.

## Technologies

- Java 17
- Spring Boot 3.2.0
- Spring Data JPA
- SQLite
- Lombok
- Maven

## Project Structure

```
src/main/java/com/taskmanager/
├── builder/           # Builder Pattern
├── config/            # Configurations and Singleton
├── controller/        # REST Controllers
├── dto/               # Data Transfer Objects
├── exception/         # Exception Handling
├── factory/           # Factory Pattern
├── model/             # JPA Entities
│   └── enums/        # Enumerations
├── observer/          # Observer Pattern
├── repository/        # JPA Repositories
├── service/           # Business Logic
└── strategy/          # Strategy Pattern
```

## How to Run

### Prerequisites

- JDK 17 or higher
- Maven 3.6+
- IntelliJ IDEA (recommended)

### Steps

1. **Clone or create the project in IntelliJ**:
   - File → New → Project
   - Name: `task-manager-api`
   - Group: `com.taskmanager`

2. **Copy the `pom.xml` file** to the project root directory

3. **Create the package structure** as indicated above

4. **Copy all Java files** to their respective packages

5. **Copy the `application.properties`** to `src/main/resources/`

6. **Run Maven to download dependencies**:

   ```bash
   mvn clean install
   ```

7. **Run the application**:

   ```bash
   mvn spring-boot:run
   ```

   Or run the `TaskManagerApiApplication` class directly in IntelliJ

8. **The API will be available at**: `http://localhost:8080`

## API Endpoints

### Projects

- `POST /api/projects` - Create project
- `GET /api/projects` - List all
- `GET /api/projects/{id}` - Get by ID
- `GET /api/projects/search?name=` - Search by name
- `PUT /api/projects/{id}` - Update
- `DELETE /api/projects/{id}` - Delete

### Tasks

- `POST /api/tasks` - Create task
- `GET /api/tasks` - List all
- `GET /api/tasks/{id}` - Get by ID
- `GET /api/tasks/project/{projectId}` - Tasks by project
- `GET /api/tasks/status/{status}` - Filter by status
- `GET /api/tasks/sorted/priority` - Sort by priority (Strategy)
- `PUT /api/tasks/{id}` - Update
- `DELETE /api/tasks/{id}` - Delete

### Comments

- `POST /api/tasks/{taskId}/comments` - Add comment
- `GET /api/tasks/{taskId}/comments` - List comments
- `DELETE /api/tasks/{taskId}/comments/{commentId}` - Delete comment
