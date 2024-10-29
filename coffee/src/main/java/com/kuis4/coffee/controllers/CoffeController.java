package main.java.com.kuis4.coffee.controllers;

import main.java.com.kuis4.coffee.services.CoffeService;

@Controller
public class CoffeController {
@Autowired
private CoffeService coffeService;

@GetMapping ("/list-coffe")
public String ListProduct(Model model){
    List<Product> product = new CoffeService.getAllProduct();
    model.AddAttribute("product", product);
    return "productlist";
}

}
