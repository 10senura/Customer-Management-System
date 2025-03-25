import edu.icet.Main;
import edu.icet.service.CustomerService;
import edu.icet.service.impl.CustomerServiceImpl;
import lombok.ToString;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = Main.class)
public class CustomerServiceTest {
    @InjectMocks
    private CustomerServiceImpl Service;

    @Test
    public void tesCalc(){
        assertEquals(20,Service.calc(10,10));
    }

}
