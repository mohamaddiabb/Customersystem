package task.codeChallenge.Customersystem.Service;
import task.codeChallenge.Customersystem.model.Customer;
import task.codeChallenge.Customersystem.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
 public abstract class CustomerServiceimpl implements CustomerService {
// we write the overrides of the functions
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer updateCustomer(int id, Customer customer) {
        customer.setId(id);
        return customerRepository.save(customer);
    }
}

