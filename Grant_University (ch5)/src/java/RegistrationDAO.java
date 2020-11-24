
package Grant_University;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RegistrationDAO
{
    private SessionFactory SessionFactory;
    boolean b = true;
    
    public void setSessionFactory (SessionFactory SessionFactory)
    {
        this.SessionFactory = SessionFactory;
    }
    
    public RegistrationDAO()
    {
        Configuration Configuration = new Configuration().configure();
    }
    
    public String insertStudent(Student std, StudentCourse sc)
    {
        Session Session = SessionFactory.openSession();
        org.hibernate.Transaction tx = Session.beginTransaction();
        String uid = (String) std.getUserID();
        System.out.println(uid);
        Query Query = Session.createQuery("FROM Grant_University.Student");
        List <Student> Student = Query.list();
        
        for(Iterator it = Student.iterator(); it.hasNext();)
        {
            Student st = (Student) it.next();
            
            if(st.getUserID().equals(uid))
            {
                b = false;
            }
            if(b ==  false)
            {
                return "error";
            }
            else
            {
                try
                {
                    tx = Session.beginTransaction();
                    int regstnum = 0;
                    Query q  = Session.createQuery("Select max(RegistrationNumber) from Student");
                    List CurrentRegNo = q.list();
                    regstnum = (Integer) CurrentRegNo.get(0)+1;
                    std.setRegistrationNumber(regstnum);
                    sc.setRegistrationNumber(regstnum);
                    Serializable objID = Session.save(std);
                    Session.saveOrUpdate(sc);
                    tx.commit();
                }
                catch(Exception e)
                {
                    if(tx != null)
                    {
                        tx.rollback();
                    }
                    System.out.println(e.getMessage());
                }
                return "true";
            }
        }
        return null;
    }
}