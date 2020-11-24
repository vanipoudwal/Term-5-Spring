
package Grant_University;

import Grant_University.CourseDetails;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class CourseDetailsDAO
{
    private SessionFactory SessionFactory;
    
    public void setSessionFactory (SessionFactory SessionFactory)
    {
        this.SessionFactory = SessionFactory;
    }
    
    public CourseDetailsDAO()
    {
        Configuration Configuration = new Configuration().configure();
    }
    
    public List getCourseByName(String CourseName)
    {
        List<CourseDetails> CourseList = null;
        try
        {
            Session Session = SessionFactory.openSession();
            org.hibernate.Transaction tx = Session.beginTransaction();
            Criteria Criteria = Session.createCriteria(CourseDetails.class).add(Restrictions.eq("CourseName", CourseName));
            CourseList = (List <CourseDetails>) Criteria.list();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return CourseList;
    }
}
