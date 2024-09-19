package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Address;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setId(1);
        address.setNo("120/1");
        address.setStreet("Flowers Rd");
        address.setCity("Panadura");

        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Dhanu");
        customer.setAddress(address);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(address);
        session.save(customer);
        transaction.commit();
        session.close();
    }
}