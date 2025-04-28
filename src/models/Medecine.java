package models;

public class Medecine {

    private String id; // Unique identifier for the medicine
    private String name; // Name of the medicine
    private String manufacturer; // Manufacturer of the medicine
    private String category; // Category (e.g., Antibiotic, Painkiller)
    private double price; // Price of the medicine
    private int stockQuantity; // Quantity available in stock
    private String dosageForm; // Dosage form (e.g., Tablet, Syrup)
    private String activeIngredient; // Active ingredient in the medicine
    private String expirationDate; // Expiration date of the medicine
    private boolean prescriptionRequired; // Whether a prescription is required
    private String storageConditions; // Storage conditions (e.g., Cool, Dry place)

    public Medecine(String id, String name, String manufacturer, String category, double price, int stockQuantity,
                    String dosageForm, String activeIngredient, String expirationDate, boolean prescriptionRequired,
                    String storageConditions) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.dosageForm = dosageForm;
        this.activeIngredient = activeIngredient;
        this.expirationDate = expirationDate;
        this.prescriptionRequired = prescriptionRequired;
        this.storageConditions = storageConditions;
    }

    @Override
    public String toString() {
        return "Medecine{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", dosageForm='" + dosageForm + '\'' +
                ", activeIngredient='" + activeIngredient + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", prescriptionRequired=" + prescriptionRequired +
                ", storageConditions='" + storageConditions + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm;
    }

    public String getActiveIngredient() {
        return activeIngredient;
    }

    public void setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isPrescriptionRequired() {
        return prescriptionRequired;
    }

    public void setPrescriptionRequired(boolean prescriptionRequired) {
        this.prescriptionRequired = prescriptionRequired;
    }

    public String getStorageConditions() {
        return storageConditions;
    }

    public void setStorageConditions(String storageConditions) {
        this.storageConditions = storageConditions;
    }
}