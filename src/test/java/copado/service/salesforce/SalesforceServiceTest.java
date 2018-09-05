package copado.service.salesforce;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SalesforceServiceTest {


    @Test
    public void test_Deploy() throws Exception {

        ClassLoader classLoader = getClass().getClassLoader();
        Path baseDir = Paths.get(classLoader.getResource("deploy_OK_2.zip").getPath());

        SalesforceService service = new SalesforceService();
        service.init();
        service.deployZip(baseDir.toAbsolutePath().toString());

    }



}