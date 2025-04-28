# Pharmacy Management Application

This is a JavaFX-based Pharmacy Management application designed to help pharmacies efficiently manage their operations. It features a user-friendly interface and supports CRUD operations for inventory, prescriptions, and customers. Advanced functionalities like filtering, search, pagination, and role-based access control are also included.

## Features

### 1. User Management
- Role-based access control:
    - **Pharmacist**: Manage inventory, verify prescriptions, and process customer orders.
    - **Staff**: Limited access to manage inventory and customer data.
- Secure login system with username and password.

### 2. Inventory Management
- Add, edit, or delete medicines in the inventory.
- Track expiry dates and receive alerts for soon-to-expire items.
- Search and filter inventory items by name, quantity, or expiry date.

### 3. Prescription Management
- Create, manage, and verify prescriptions.
- Assign prescriptions to customers and link them to pharmacists.
- Track prescription items and quantities.

### 4. Customer Management
- Add, edit, or delete customer records.
- Search and filter customers by name, phone, or email.
- Link prescriptions to customer records.

### 5. Advanced Functionalities
- **Search and Filtering**:
    - Apply filters to inventory, prescriptions, and customer data.
    - Perform quick searches with dynamic results.
- **Pagination**:
    - View large datasets in paginated format for better usability.
- **Database Integration**:
    - SQLite database for secure and efficient data storage.

## Technologies Used
- **JavaFX**: For building the graphical user interface.
- **SQLite**: For database management.
- **Gradle**: For managing dependencies and building the project.

## Project Structure
The project is organized as follows:
```
PharmacyManagement/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── controllers/       # Handles UI interactions
│   │   │   ├── models/            # Represents application data
│   │   │   ├── services/          # Business logic and database management
│   │   │   ├── utils/             # Helper utilities
│   │   │   └── Main.java          # Entry point of the application
│   │   ├── resources/
│   │   │   ├── fxml/              # FXML files for UI layouts
│   │   │   ├── css/               # Stylesheets for UI design
│   │   │   ├── images/            # Images and icons
│   │   │   └── sql/               # Database schema
├── .idea/                         # IntelliJ IDEA project files
├── .gitignore                     # Git ignore file
├── README.md                      # Documentation
└── build.gradle                   # Gradle build file
```

## Database Schema
The schema for the SQLite database is located in `src/main/resources/sql/pharmacy_schema.sql`. It includes the following tables:
- **Roles**: Stores user roles (e.g., staff, pharmacist).
- **Users**: Stores user credentials and roles.
- **Inventory**: Stores details about medicines (e.g., name, quantity, expiry date).
- **Customers**: Stores customer information (e.g., name, phone, email).
- **Prescriptions**: Stores prescription data linked to customers and pharmacists.
- **PrescriptionItems**: Stores items in a prescription linked to inventory.

## How to Run the Application
1. Clone this repository:
   ```bash
   git clone https://github.com/joel-elunda/PharmacyManagement.git
   cd PharmacyManagement
   ```
2. Open the project in IntelliJ IDEA.
3. Execute the SQL schema located at `src/main/resources/sql/pharmacy_schema.sql` to initialize the database.
4. Build the project using Gradle:
   ```bash
   ./gradlew build
   ```
5. Run the application by executing `Main.java` in IntelliJ IDEA.

## Screenshots
### Login Screen
![Login Screen](src/main/resources/images/login_screenshot.png)

### Dashboard
![Dashboard](src/main/resources/images/dashboard_screenshot.png)

### Inventory Management
![Inventory Management](src/main/resources/images/inventory_screenshot.png)

## Future Enhancements
- Email notifications for expired medicines.
- Detailed analytics and reporting.
- Integration with barcode scanners for inventory management.

## License
This project is open-source and available under the MIT License.

## Contribution
Contributions are welcome! If you'd like to contribute, please fork the repository and submit a pull request.

## Contact
For questions or support, please contact [joel-elunda](https://github.com/joel-elunda).