
public class InvoiceClass {

    private  String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public InvoiceClass(String partNumber,String partDescription, int quantity,double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;

    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public double getInvoiceAnount () {
        if (getQuantity() < 0) {
            setQuantity(0);
        } else if (getPrice() < 0) {
            setPrice(0.0);
        }
        return  getQuantity() * getPrice();
    }
}
