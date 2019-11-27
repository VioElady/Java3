
public class InvoiceTest {

    public static void main(String[] args) {

        InvoiceClass invoice = new InvoiceClass("h3456vb", "electrique", 300, 500);
        InvoiceClass invoice1 = new InvoiceClass("h34gg6vb", "electrique", -55, 500);
        InvoiceClass invoice2 = new InvoiceClass("h34556vb", "electrique", 300, -66);

        System.out.println(invoice.getInvoiceAnount());
        System.out.println(invoice1.getInvoiceAnount());
        System.out.println(invoice2.getInvoiceAnount());

    }
}
