public class InvoiceFixed{

  public double calculateTotal(){
    // Caluclate total value of items on this invoice.
  }
  
}

public interface InvoicePrinter{ // Deals with printing invoices in whichever format our user want.

  public void printInvoice(InvoiceFixed invoiceFixed);
  
}

public interface InvoiceRepository{ // Deals with persisting invoices; this can know about database structure.

  public void storeInvoice(InvoiceFixed invoiceFixed);
  
}
