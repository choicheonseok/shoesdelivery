package shoesdelivery.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import shoesdelivery.CustomerApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomerApplication.class })
public class CucumberSpingConfiguration {}
