package edu.iu.habahram.coffeeorder.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//public record Receipt(String description, float cost, int id) {
//}
@Entity
@Table(schema = "coffee", name = "coffee")
public class Receipt {
    private String description;
    private float cost;
    @Id
    private int id;

    public Receipt() {
    }

    public Receipt(String description, float cost, int id) {
        this.description = description;
        this.cost = cost;
        this.id = id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}