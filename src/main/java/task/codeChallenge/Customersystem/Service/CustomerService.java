package task.codeChallenge.Customersystem.Service;

import task.codeChallenge.Customersystem.model.Customer;

import java.util.List;

public interface CustomerService {
 // we write the functions

 // to save customer
 public Customer saveCustomer(Customer customer);
 // to list all the customers
 public List<Customer> getAllCustomer();
 //to delete a customer
 void deleteCustomer(int id);
 // to update a customer
 public Customer updateCustomer(int id, Customer customer);
}
