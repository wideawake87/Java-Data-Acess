import org.hibernate.Session;
import org.hibernate.Transaction;
import java.sql.*;
import java.util.ArrayList;

public class Db {
    static Connection conn;


    public static void insertEmployee(Session session, Transaction transaction, Employers emp) {
        session.save(emp);
        transaction.commit();
        session.close();
    }

    public static void deleteEmployee(Session session, Transaction transaction, int id) {
        Employers emp = (Employers) session.get(Employers.class, id);
        session.delete(emp);
        transaction.commit();
        session.close();

    }

    public static ArrayList<Employers> showTables(Session session, Transaction transaction) {
        ArrayList<Employers> emp = (ArrayList<Employers>) session.createQuery("from Employers").list();
        return emp;
    }


    public static void changeEmp(Session session, Transaction transaction, int id, Employers emp){
        Employers employers = (Employers) session.get(Employers.class, id);
        employers.setAddress(emp.getAddress());
        employers.setEmail(emp.getEmail());
        employers.setPhone_number(emp.getPhone_number());
        employers.setSalary(emp.getSalary());
        session.update(employers);
        transaction.commit();
        session.close();

    }
    public static Employers getEmployee(Session session, Transaction transaction, int id) {
        session.get(Employers.class, id);
        Employers emp = (Employers) session.get(Employers.class, id);
        transaction.commit();
        session.close();
        return emp;

    }
}





