
package Grant_University;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BeanDAO
{
    private SessionFactory SessionFactory;
    
    public void setSessionFactory (SessionFactory SessionFactory)
    {
        this.SessionFactory = SessionFactory;
    }
    
    public BeanDAO()
    {
        Configuration Configuration = new Configuration().configure();
    }
    
    public List getStudent()
    {
        List <Student> Student = null;
        try
        {
            Session Session = SessionFactory.openSession();
            org.hibernate.Transaction tx = Session.beginTransaction();
            Query q = Session.createQuery("FROM Grant_University.Student");
            Student = (List<Student>) q.list();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return Student;
    }
}
