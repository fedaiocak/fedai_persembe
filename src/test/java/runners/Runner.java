package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)     // class'i cuCumber ile calistir
@CucumberOptions(

        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml" },  // rapor alamk icin kullaniriz

        features  =  "src/test/resources/features",  // features  sag tikla=> copy absulat path aldik path aldik
        glue   =  "stepdefinitions",  //  glue kelimesi ile feature i; stepdefinition'u birlestirdik
        tags   =  "@youtube", //hangisini calistirmak istersem onu bu sekilde tag ile yazariz.( iphone yazarsak sadece onu calistirir)
        dryRun   =  false

)


public class Runner {
}