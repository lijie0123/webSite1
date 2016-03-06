import com.lijie.webSite1.dao.impl.PersonRepo;
import com.lijie.webSite1.model.exception.WebExeption;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lj on 16-3-6.
 */
public class Main {
    public static void main(String args[]){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("daoContext.xml");
        PersonRepo personRepo= (PersonRepo) applicationContext.getBean("personRepo");
        try {
            personRepo.getAll();
        } catch (WebExeption webExeption) {
            webExeption.printStackTrace();
        }

    }
}
