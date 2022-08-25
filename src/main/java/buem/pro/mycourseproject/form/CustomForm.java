package buem.pro.mycourseproject.form;

import buem.pro.mycourseproject.model.Customer;
import buem.pro.mycourseproject.model.Product;

import java.time.LocalDateTime;

public class CustomForm {

    private String id;
    private String product;
    private String customer;
    private double amount;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public CustomForm() {
    }

    public CustomForm(String product, String customer, double amount) {
        this.product = product;
        this.customer = customer;
        this.amount = amount;
    }

    public CustomForm(String id, String product, String customer, double amount, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.product = product;
        this.customer = customer;
        this.amount = amount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CustomForm{" +
                "product='" + product + '\'' +
                ", customer='" + customer + '\'' +
                ", amount=" + amount +
                '}';
    }
}
