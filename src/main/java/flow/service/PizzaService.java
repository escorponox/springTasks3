package flow.service;

import jpa.Customer;
import jpa.CustomerDAO;
import org.springframework.transaction.TransactionSystemException;

import java.io.Serializable;

public class PizzaService implements Serializable {

    private CustomerDAO customerDAO;

    public Customer getCustomerByPhone(String phone) throws CustomerNotFoundException {
        Customer customer = customerDAO.getCustomerById(phone);
        if (customer != null) {
            return customer;
        } else {
            throw new CustomerNotFoundException("Customer nor found.");
        }
    }

    public void addCustomer(Customer customer) throws TransactionSystemException {
        customerDAO.addCustomer(customer);
    }

    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }
}
