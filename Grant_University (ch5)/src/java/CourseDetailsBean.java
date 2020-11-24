
import java.util.ArrayList;
import java.util.Iterator;
import Grant_University.*;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RequestScoped
@Named("CourseDetailsBean")

public class CourseDetailsBean 
{
    public CourseDetailsBean() {}
    CourseDetails cd = new CourseDetails();
    
    public String Action()
    {
        String CourseName = vce.getNewValue().toString();
        StringBuilder CourseID = new StringBuilder();
        StringBuilder CourseDuration = new StringBuilder();
        StringBuilder CourseEligibility = new StringBuilder();
        StringBuilder CourseFee = new StringBuilder();
        
        performLookup(CourseID, CourseName, CourseDuration, CourseEligibility, CourseFee);
        cd.setCourseID(CourseID.toString());
        cd.setCourseDuration(CourseDuration.toString());
        cd.setCourseEligibility(CourseEligibility.toString());
        cd.setCourseFee(CourseFee.toString());
            
        return null;
    }
    
    public String getCourseName() 
    {
        return null;
    }
    
    void performLookup(StringBuilder CourseID, String CourseName, StringBuilder CourseDuration, StringBuilder CourseEligibility, StringBuilder CourseFee)
    {
        ApplicationContext apc = new ClassPathXmlApplicationContext("spring-hibernate.xml");
        CourseDetailsDAO CrsHlpr = (CourseDetailsDAO) apc.getBean("CourseDetailsDAO");
        //CourseHelper CrsHlpr = new CourseHelper();
        List<CourseDetails> Courses = new ArrayList<CourseDetails>();
        Courses = CrsHlpr.getCourseByName(getCourseName());
        Iterator iterator;
        iterator = Courses.iterator();
            
        while(iterator.hasNext())
        {
            Courses = (List<CourseDetails>)(CourseDetails)iterator.next();
        }
        CourseID.append(CourseID.toString());
        CourseDuration.append(CourseDuration.toString());
        CourseEligibility.append(CourseEligibility.toString());
        CourseFee.append(CourseFee.toString());
    }

    private static class vce
    {
        private static Object getNewValue()
        {
            throw new UnsupportedOperationException("Not supported yet.");
        }
        public vce(){}
    }
}
