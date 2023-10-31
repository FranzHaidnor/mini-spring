package org.springframework.context.support;

import org.springframework.beans.BeansException;
import org.springframework.context.ConfigurableApplicationContext;

public abstract class AbstractApplicationContext implements ConfigurableApplicationContext {

    //---------------------------------------------------------------------
    // Implementation of BeanFactory interface
    //---------------------------------------------------------------------

    @Override
    public Object getBean(String name) throws BeansException {
        return null;
    }


    //---------------------------------------------------------------------
    // Implementation of ConfigurableApplicationContext interface
    //---------------------------------------------------------------------


    @Override
    public void refresh() throws BeansException, IllegalStateException {

    }

}
