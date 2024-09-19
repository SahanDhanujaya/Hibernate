package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Address;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Dhanu");

        Customer customer1 = new Customer();
        customer1.setId(2);
        customer1.setName("Sahan");

        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer);
        customerList.add(customer1);

        Address address = new Address();
        address.setId(1);
        address.setNo("120/1");
        address.setStreet("Flowers Rd");
        address.setCity("kandy");
        address.setCustomers(customerList);

        Address address1 = new Address();
        address1.setId(2);
        address1.setNo("150/1");
        address1.setStreet("Beach Rd");
        address1.setCity("Panadura");
        address.setCustomers(customerList);

        List<Address> addressList = new ArrayList<>();
        addressList.add(address);
        addressList.add(address1);
        customer.setAddresses(addressList);
        customer1.setAddresses(addressList);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        session.save(customer1);
        session.save(address);
        session.save(address1);
        transaction.commit();
        session.close();
    }
}