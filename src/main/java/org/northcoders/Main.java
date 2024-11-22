package org.northcoders;

import org.hibernate.SessionFactory;
import org.northcoders.Entities.*;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = Database.getSessionFactory();
        sessionFactory.getSchemaManager().exportMappedObjects(true);


    }
}