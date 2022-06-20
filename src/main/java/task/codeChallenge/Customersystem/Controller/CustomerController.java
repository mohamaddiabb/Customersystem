package task.codeChallenge.Customersystem.Controller;
import task.codeChallenge.Customersystem.model.Customer;
import task.codeChallenge.Customersystem.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerService customerService;
// post mapping is used to add a customer to the data base
    @PostMapping("/add")
    public String add(@RequestBody Customer customer) {
        customerService.saveCustomer(customer);
        return "New customer is added";
    }
// get mapping is to get all the customers from the data base
    @GetMapping("/getAll")
    public List<Customer> list() {
        return customerService.getAllCustomer();
    }
// delete mapping is to delete a customer from the data base having the same id as the given parameter
    @DeleteMapping("/id")
    public void deleteCustomer(@PathVariable("id") int id) {
        customerService.deleteCustomer(id);
    }
// put mapping is to update the customer from the data base having the same id as the given parameter
    @PutMapping("/id")
    public Customer updateCustomer(@PathVariable("id") int id, @RequestBody Customer customert) {
        return customerService.updateCustomer(id, customert);
    }
}


