package mum.edu.Myproducts.Model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import java.time.LocalDate;


@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "Product_Number")
    @NotEmpty(message = "*Please provide product Number")
    private long productNumber;

    @Column(name = "name_Product")
    @NotEmpty(message = "*Please provide name")
    private String name;

    private float unitPrice;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateMfd;
    public Product() {

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public long getProductNumber() {
        return productNumber;
    }
    public void setProductNumber(long productNumber) {
        this.productNumber = productNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
    public LocalDate getDateMfd() {
        return dateMfd;
    }
    public void setDateMfd(LocalDate dateMfd) {
        this.dateMfd = dateMfd;
    }

}
