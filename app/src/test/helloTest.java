
import com.nk.spring.MyBeanFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = helloTest.class)
public class helloTest {
    @Autowired
    private MyBeanFactory myBeanFactory;

    @Test
    public void contextLoads() {
          myBeanFactory.getBean("test");
    }

}
