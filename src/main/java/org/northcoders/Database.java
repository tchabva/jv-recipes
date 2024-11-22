package org.northcoders;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.northcoders.Entities.*;

import static java.lang.Boolean.TRUE;
import static org.hibernate.cfg.JdbcSettings.*;

public class Database {
    public static SessionFactory getSessionFactory(){
        var sessionFactory = new Configuration()
                .setProperty("hibernate.connection.driver_class", "org.h2.Driver") // <-- Specifying our H2 in-memory database
                .setProperty(JAKARTA_JDBC_URL, "jdbc:h2:mem:db1")   // <-- Supplying our database's connection string
                .setProperty(JAKARTA_JDBC_USER, "sa")   // <-- Using the default username...
                .setProperty(JAKARTA_JDBC_PASSWORD, "") // <-- ... and password
                .setProperty("hibernate.hikari.maximumPoolSize", "20") // <-- adding the connection pool
                .setProperty(SHOW_SQL, TRUE.toString()) // <-- SQL formatting configuration
                .setProperty(FORMAT_SQL, TRUE.toString())
                .setProperty(HIGHLIGHT_SQL, TRUE.toString())
                .addAnnotatedClass(Category.class)
                .addAnnotatedClass(Tag.class)
                .addAnnotatedClass(Ingredient.class)
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Recipe.class)
                .addAnnotatedClass(Rating.class)
                .addAnnotatedClass(Image.class)
                .addAnnotatedClass(Comment.class)
                .buildSessionFactory();

        return sessionFactory;
    }

    static void seed(){
        var sessionFaction = getSessionFactory();

    }

}
