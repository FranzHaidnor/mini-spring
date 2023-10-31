package org.springframework.context.support;

import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;

/**
 * 通用应用程序上下文
 */
public class GenericApplicationContext extends AbstractApplicationContext implements BeanDefinitionRegistry {

    //---------------------------------------------------------------------
    // Implementation of BeanDefinitionRegistry
    //---------------------------------------------------------------------

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws BeanDefinitionStoreException {

    }

}
