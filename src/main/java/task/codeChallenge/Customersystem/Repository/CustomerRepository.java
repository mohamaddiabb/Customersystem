package task.codeChallenge.Customersystem.Repository;
import task.codeChallenge.Customersystem.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
// to connect with the data base
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
