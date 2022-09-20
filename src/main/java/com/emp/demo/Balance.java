package com.emp.demo;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor
@Entity
@Table(name = "balance", schema = "Account")
public class Balance implements Serializable {

    private static final long serialVersionUID = -7941769011539363185L;

    @Id
    @Column(name = "customerID")
    private long customerID;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "product")
    private String product;

    /*
    @Column(name = "balance")
    private Number balance;
*/

    public Balance(long CustomerId, String LastName, String FirstName, String Product, Number Balance) {
        this.customerID = CustomerId;
        this.lastName = LastName;
        this.firstName = FirstName;
        this.product = Product;
        //this.balance = Balance;
    }

    public long getCustomerID() {
        return customerID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getProduct() {
        return product;
    }

    //public Number getBalance() {
    //    return balance;
    //}

    public void setFirstName(String FirstName) {
        this.firstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.lastName = LastName;
    }

    public void setProduct(String Product) {
        this.product = Product;
    }

    //public void setBalance(Number Balance) {
    //    this.balance = Balance;
    //}

    public void setBalance(long CustomerId) {
        this.customerID = CustomerId;
    }

    @Override
    public String toString() {
        return "Balance [id=" + customerID + ", FirstName=" + firstName + " , LastName & Product=" + lastName + " >> " + product +" , Balance=]";
    }
}
