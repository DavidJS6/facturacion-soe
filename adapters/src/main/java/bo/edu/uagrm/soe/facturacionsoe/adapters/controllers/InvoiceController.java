package bo.edu.uagrm.soe.facturacionsoe.adapters.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/facturacion-soe/invoices")
public class InvoiceController {
    /*private InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping()
    public ResponseEntity<List<InvoiceResponseDto>> getInvoices() {
        return new ResponseEntity<>(invoiceService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InvoiceResponseDto> getInvoiceById(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(invoiceService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<InvoiceResponseDto> saveInvoice(@RequestBody InvoiceRequestDto invoiceRequestDto) throws Exception {
        return new ResponseEntity<>(invoiceService.store(invoiceRequestDto), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map> deleteInvoice(@PathVariable Long id) throws Exception {
        invoiceService.delete(id);
        Map<String, Object> map = new HashMap<>();
        map.put("success", true);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @PutMapping("/cancel/{id}")
    public ResponseEntity<InvoiceResponseDto> cancelInvoice(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(invoiceService.cancel(id), HttpStatus.OK);
    }
*/
}
