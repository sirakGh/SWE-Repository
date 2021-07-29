package product.service.feign.product;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
    @RequestMapping("/product/{productNumber}")
    public  Product getName(@PathVariable("productNumber") String productNumber) {
        Product p1 = new Product("1234", "Sirak","1001");
        Product p2 = new Product("1235", "Solomon", "1002");
        Product p3 = new Product("1236", "Ghebrehiwot", "1003");

        return p1;
    }
}
