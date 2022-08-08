package buem.pro.mycourseproject.model;

import java.time.LocalDate;
import java.util.Objects;

public class Customer {
    private String id;
    private String name;
    private String address;
    private String telephoneNumber;
    private String customerName;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public Customer() {
    }

    public Customer(String id, String name, String address, String telephoneNumber, String customerName) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.customerName = customerName;
    }

    public Customer(String id, String name, String address, String telephoneNumber, String customerName, LocalDate createdAt, LocalDate updatedAt) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.customerName = customerName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id.equals(customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
