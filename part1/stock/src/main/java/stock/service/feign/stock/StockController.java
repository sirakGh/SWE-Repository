package stock.service.feign.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
    @Autowired
     ProductFeignClient accountClient;

    @RequestMapping("/stock/{productNumber}")
    public Product getName(@PathVariable("productNumber") String productNumber) {
        Product product = accountClient.getName("productNumber");
        return product;
    }

    @FeignClient(name = "product-service", url = "http://localhost:8901")
    interface ProductFeignClient {
        @RequestMapping("/stock/{productNumber}")
        public Product getName(@PathVariable("productNumber") String customerId);
    }
}
