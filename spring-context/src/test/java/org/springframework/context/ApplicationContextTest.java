package org.springframework.context;

import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ApplicationContextTest {
    @Test
    public void test_() throws Exception {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("beans.xml");
        Object bean = context.getBean("student");
    }

}
