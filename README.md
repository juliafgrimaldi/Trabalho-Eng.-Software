# Product Manager MVC

This project implements a simple product management system using the Model-View-Controller (MVC) architecture pattern in Java.

## Description
The system consists of three main components:

### Model
Represented by the Product class, which defines the data structure of a product, and by the ProductRepository class, responsible for interacting with the database to save and retrieve products.

### View
Represented by the ProductView class, which is the user interface. In this interface, users can add new products, view all existing products, and receive feedback on the operations performed.

### Controller
Represented by the ProductController class, which coordinates the interaction between the view and the model. The controller sets up event listeners on the user interface components and responds to events by performing appropriate operations on the model.

## How to Use
To run the project locally, follow these steps:

1. Make sure you have the Java Development Kit (JDK) installed on your machine.
2. Clone this repository to your local environment.
3. Open the project in your preferred Java IDE.
4. Compile and execute the Main class.

Make sure you have access to a MariaDB (or other compatible) database to store product data. Also, ensure that you correctly configure the database credentials in the ProductRepository.java file.

## Contributing
Contributions are welcome! If you encounter a problem, have a suggestion, or want to improve this project in any way, feel free to open an issue or submit a pull request.
