package bo.edu.uagrm.soe.facturacionsoe.usecases.invoices.getbyid;

public class GetInvoiceByIdQuery {

    private Long id;

    public GetInvoiceByIdQuery(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
