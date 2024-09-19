package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Address;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Save {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(2);
        customer.setName("Dhanu");
        customer.setAddress("Kandy");

        Address address = new Address();
        address.setAId(2);
        address.setNo("120/1");
        address.setStreet("Flowers Rd");
        address.setCity("Kandy");

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        session.save(address);
        transaction.commit();
        session.close();
    }
}