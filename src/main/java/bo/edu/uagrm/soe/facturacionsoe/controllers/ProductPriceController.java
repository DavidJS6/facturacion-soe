package bo.edu.uagrm.soe.facturacionsoe.controllers;

import bo.edu.uagrm.soe.facturacionsoe.services.ProductPriceService;
import bo.edu.uagrm.soe.facturacionsoe.dto.request.ProductPriceDto;
import bo.edu.uagrm.soe.facturacionsoe.valueobjects.ProductPriceValueObject;
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
    public ResponseEntity<Object> saveProductPrice(@RequestBody ProductPriceDto productPriceDto) throws Exception {
        productPriceService.save(new ProductPriceValueObject(productPriceDto));
        return new ResponseEntity<>("El precio del producto ha sido registrado", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateProductPrice(@PathVariable Long id, @RequestBody ProductPriceDto productPriceDto) throws Exception {
        productPriceService.update(id, new ProductPriceValueObject(productPriceDto));
        return new ResponseEntity<>("El precio del producto ha sido actualizado", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteProductPrice(@PathVariable Long id) throws Exception {
        productPriceService.delete(id);
        return new ResponseEntity<>("El precio del producto ha sido eliminado", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getProductPrice(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(productPriceService.getProductPriceById(id), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<Object> getAllProductPrices() {
        return new ResponseEntity<>(productPriceService.getAllPrices(), HttpStatus.OK);
    }
}
