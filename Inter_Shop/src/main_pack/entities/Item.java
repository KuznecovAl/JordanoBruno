package main_pack.entities;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Item {
    private long id;
    private String supplier;
    private String model;
    private Double price;

    public Item(String supplier, String model, Double price) {
        this.supplier = supplier;
        this.model = model;
        this.price = price;
    }
}