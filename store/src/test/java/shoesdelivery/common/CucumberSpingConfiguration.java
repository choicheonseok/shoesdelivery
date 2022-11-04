package shoesdelivery.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import shoesdelivery.StoreApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { StoreApplication.class })
public class CucumberSpingConfiguration {}
