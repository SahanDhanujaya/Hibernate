package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.embed.Name;
import lk.ijse.entity.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Name name = new Name();
        name.setId(1);
        name.setFirstNma("Sahan");
        name.setSecName("Dhanujaya");

        Person person = new Person();
        person.setId(1);
        person.setName(name);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(person);
        transaction.commit();
        session.close();
    }
}