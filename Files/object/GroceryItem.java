package FundamentalJava.Files.object;

import lombok.AllArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
public class GroceryItem implements Serializable {
    String ProductName;
    int ProductQuantity;
    float ProductPrice;

}