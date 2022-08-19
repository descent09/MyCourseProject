package buem.pro.mycourseproject.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Custom {
    @Id
    private Product product;
    private Customer customer;

    private String id;
    private double amount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Custom() {

    }

    public Custom(Product product, Customer customer,  double amount, LocalDateTime createdAt) {
        this.product = product;
        this.customer = customer;
        this.amount = amount;
        this.createdAt = createdAt;
    }

    public Custom(Product product, Customer customer, String id, double amount, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.product = product;
        this.customer = customer;
        this.id = id;
        this.amount = amount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
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
        Custom custom = (Custom) o;
        return id.equals(custom.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Custom{" +
                "product=" + product +
                ", customer=" + customer +
                ", id='" + id + '\'' +
                ", amount=" + amount +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
