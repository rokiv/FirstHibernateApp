package models;

public class Products {

    private int prodId;
    private int vendId;
    private String prodName;
    private double prodPrice;
    private String prodDesc;

    public Products() {
    }

    public Products(int vendId, String prodName, double prodPrice, String prodDesc) {
        this.vendId = vendId;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.prodDesc = prodDesc;
    }
}
