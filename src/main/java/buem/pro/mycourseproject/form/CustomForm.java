package buem.pro.mycourseproject.form;

import buem.pro.mycourseproject.model.Customer;
import buem.pro.mycourseproject.model.Product;

import java.time.LocalDateTime;

public class CustomForm {
    private String product;
    private String customer;
    private double amount;

    public CustomForm() {
    }

    public CustomForm(String product, String customer, double amount) {
        this.product = product;
        this.customer = customer;
        this.amount = amount;
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
