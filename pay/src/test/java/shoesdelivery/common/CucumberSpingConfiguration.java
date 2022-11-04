package shoesdelivery.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import shoesdelivery.PayApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { PayApplication.class })
public class CucumberSpingConfiguration {}
