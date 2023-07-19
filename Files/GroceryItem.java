package FundamentalJava.Files;

import lombok.AllArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
public class GroceryItem  implements Serializable {
    String ProductName;
    int ProductQuantity;
    float ProductPrice;

}