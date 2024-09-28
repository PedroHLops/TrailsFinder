CREATE TABLE Trails(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    url_image VARCHAR(255),
    description TEXT,
    cep VARCHAR(20),
    address VARCHAR(255),
    city VARCHAR(100),
    location VARCHAR(255)
);