package org.springframework.beans.factory.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * 默认可列表 Bean 工厂
 * <p>
 * 管理了存放 BeanDefinition 的容器
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    /**
     * 管理 BeanDefinition 容器
     */
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    // implement BeanDefinitionRegistry --------------------------------------------------------------------------------
    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    // 实现 AbstractBeanFactory 的抽象方法
    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) {
            throw new BeansException("No bean named '" + beanName + "' is defined");
        }

        return beanDefinition;
    }
}
