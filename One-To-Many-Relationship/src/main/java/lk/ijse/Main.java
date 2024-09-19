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
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Address address = new Address();
        address.setAId(3);
        address.setNo("120/1");
        address.setStreet("Flowers Rd");
        address.setCity("Kandy");
        address.setCustomer(session.get(Customer.class,1));


        List<Address> addressList = new ArrayList<>();
        addressList.add(address);
//        addressList.add(address1);
//        customer.setAddresses(addressList);

//        session.save(customer);
        session.save(address);
//        session.save(address1);
        transaction.commit();
        session.close();
    }
}