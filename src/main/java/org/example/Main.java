package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("persistence.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        String sqlQuery = "SELECT * FROM usuario WHERE nome = :nome";
        NativeQuery nativeQuery = session.createNativeQuery(sqlQuery);
        nativeQuery.setParameter("nome", "joao");

        List<Object[]> results = nativeQuery.list();

        for (Object[] result : results) {
            // Os resultados são retornados como arrays de objetos
            Integer id = (Integer) result[0];
            String nome = (String) result[1];
            String email = (String) result[2];
            // ... processar outros campos, se houver
        }
        transaction.commit();
        session.close();
    }
}