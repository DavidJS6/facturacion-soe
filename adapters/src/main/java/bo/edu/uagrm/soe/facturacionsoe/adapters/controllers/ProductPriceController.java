package bo.edu.uagrm.soe.facturacionsoe.adapters.controllers;

import bo.edu.uagrm.soe.facturacionsoe.adapters.services.ProductPriceService;
import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.request.ProductPriceRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/facturacion-soe/product-prices")
public class ProductPriceController {

    private ProductPriceService productPriceService;

    public ProductPriceController(ProductPriceService productPriceService) {
        this.productPriceService = productPriceService;
    }

    @PostMapping
    public ResponseEntity<Object> saveProductPrice(@RequestBody ProductPriceRequestDto productPriceRequestDto) throws Exception {
        return new ResponseEntity<>(productPriceService.store(productPriceRequestDto), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateProductPrice(@PathVariable Long id, @RequestBody ProductPriceRequestDto productPriceRequestDto) throws Exception {
        return new ResponseEntity<>(productPriceService.update(id, productPriceRequestDto), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteProductPrice(@PathVariable Long id) throws Exception {
        productPriceService.delete(id);
        return new ResponseEntity<>("El precio del producto ha sido eliminado", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getProductPrice(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(productPriceService.findById(id), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<Object> getAllProductPrices() {
        return new ResponseEntity<>(productPriceService.findAll(), HttpStatus.OK);
    }

}
