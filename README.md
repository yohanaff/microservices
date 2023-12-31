# Microservices Project

## English

### Introduction
This project is a microservices-based application designed to demonstrate a basic but comprehensive microservices architecture. It includes services for authentication, data processing, and more, all containerized with Docker for easy deployment and scalability. To create this project I followed [this course](https://www.youtube.com/watch?v=lh1oQHXVSc0&list=PLSVW22jAG8pBnhAdq9S8BpLnZ0_jVBj0c), but I used Spring Boot 3 and made some changes to the code.

### Prerequisites
- Docker
- Docker Compose

### Running the Application with Docker
1. **Clone the repository:**
   ```bash
   git clone https://github.com/yohanaff/microservices.git
    ```

2. **Navigate to the project directory:**
   ```bash
    cd microservices
    ```

2. **Build and run the containers:**
    ```bash
    docker-compose up --build
   ```

    This command builds the images if they don't exist and starts the containers.

3. **Open Keycloak:**
    - Open a browser and navigate to http://localhost:8080
    - Log in with the username `admin` and the password `admin`
    - Click on the `Administration Console` button
    - Log in with the username `admin` and the password `admin`
    - Click on the `Clients` tab
    - Click on `spring-cloud-client`
    - Click on the `Credentials` tab
      - Copy the value of the `Secret` field

4. **Open a client application such as Postman or Insomnia:**
      - Import this curl request:
        ```bash
         curl --location 'http://localhost:8181/api/product' \
          --header 'Authorization: Bearer token' \
          --header 'Cookie: JSESSIONID=2A9DC6AF0F43046385556B043B0D7ACA'
        ```
      - Click on the `Authorization` tab
      - Select OAuth 2.0 as the type
      - Paste the value copied on step 3 into the `Client Secret` field
      - Click on the `Get New Access Token` button
      - Click on  `Use Token` button
   

Do the same for the other endpoints.
   
            