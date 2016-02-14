
import dto.Contract_emp;
import dto.Employee;
import dto.Regular_emp;
import myconfig.connection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class test {
    public static void main(String[] args) {
        SessionFactory sf = connection.getSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        Employee e1 = new Employee();
        e1.setName("Anjal");
        
        Regular_emp r1 = new Regular_emp();
        r1.setName("Shreya");
        r1.setBonus(20000);
        r1.setSalary(3403442);
        
        Contract_emp c1 = new Contract_emp();
        c1.setName("Vidhi");
        c1.setPay_perhr(500);
        c1.setDays(20);
        
        s.save(e1);
        s.save(c1);
        s.save(r1);
        t.commit();
        s.close();
        sf.close();
    }
}
