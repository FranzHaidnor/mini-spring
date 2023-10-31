package org.springframework.beans.factory.support;

import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.core.AliasRegistry;

public interface BeanDefinitionRegistry extends AliasRegistry {

    /*
     * 在此注册表中注册一个新的 bean 定义。
     * 必须支持RootBeanDefinition和ChildBeanDefinition。
     * @param beanName 要注册的bean实例的名称
     * @param beanDefinition 定义要注册的bean实例
     * 如果 BeanDefinition 无效，则抛出 BeanDefinitionStoreException
     * 如果已经存在 BeanDefinition，则抛出@ throws BeanDefinitionOverrideException
     * 对于指定的bean名称，我们不允许覆盖它
     * @see GenericBeanDefinition
     * @see RootBeanDefinition
     * @see ChildBeanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws BeanDefinitionStoreException;

}
