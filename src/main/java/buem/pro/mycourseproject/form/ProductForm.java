package buem.pro.mycourseproject.form;

import java.time.LocalDateTime;

public class ProductForm {
    private String id;
    private String name;
    private double price;
    private String deliverAbility;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ProductForm() {

    }

    public ProductForm(String name, double price, String deliverAbility, String description) {
        this.name = name;
        this.price = price;
        this.deliverAbility = deliverAbility;
        this.description = description;
    }

    public ProductForm(String id, String name, double price, String deliverAbility, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.deliverAbility = deliverAbility;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDeliverAbility() {
        return deliverAbility;
    }

    public void setDeliverAbility(String deliverAbility) {
        this.deliverAbility = deliverAbility;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "ProductForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", deliverAbility='" + deliverAbility + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
