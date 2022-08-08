package buem.pro.mycourseproject.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Product {

    private String id;
    private String name;
    private double price;
    private boolean deliverAbility;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Product() {

    }

    public Product(String id, String name, double price, boolean deliverAbility , String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.deliverAbility = deliverAbility;
        this.description = description;
    }

    public Product(String id, String name, double price, boolean deliverAbility, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
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

    public boolean isDeliverAbility() {
        return deliverAbility;
    }

    public void setDeliverAbility(boolean deliverAbility) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", deliverAbility=" + deliverAbility +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
