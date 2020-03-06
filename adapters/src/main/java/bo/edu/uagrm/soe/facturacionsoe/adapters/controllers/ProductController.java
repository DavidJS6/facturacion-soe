package bo.edu.uagrm.soe.facturacionsoe.adapters.controllers;

import bo.edu.uagrm.soe.facturacionsoe.adapters.services.ProductService;
import bo.edu.uagrm.soe.facturacionsoe.usecases.dto.request.ProductRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/facturacion-soe/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Object> saveProduct(@RequestBody ProductRequestDto productRequestDto) throws Exception {
        return new ResponseEntity<>(productService.store(productRequestDto), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateProduct(@PathVariable Long id, @RequestBody ProductRequestDto productRequestDto) throws Exception {
        return new ResponseEntity<>(productService.update(id, productRequestDto), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteProduct(@PathVariable Long id) throws Exception {
        productService.delete(id);
        return new ResponseEntity<>("El producto ha sido eliminado", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getProduct(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(productService.findById(id), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<Object> getAllProducts() {
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }
}
