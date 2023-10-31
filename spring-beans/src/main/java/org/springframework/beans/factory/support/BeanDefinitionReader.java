package org.springframework.beans.factory.support;

import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.core.io.Resource;

public interface BeanDefinitionReader {

    /**
     * 从指定的资源位置加载 BeanDefinition
     *
     * @param locations 资源位置，由 ResourceLoader 加载
     *                 （或ResourcePatternResolver）此bean定义读取器
     * @return 找到的bean定义的数量
     * @throws BeanDefinitionStoreException 如果加载或解析错误
     */
    int loadBeanDefinitions(String... locations) throws BeanDefinitionStoreException;

    /**
     * 从指定的资源加载bean定义。
     *
     * @param resource 资源描述符
     * @return 找到的bean定义的数量
     * @throws BeanDefinitionStoreException 如果加载或解析错误
     */
    int loadBeanDefinitions(Resource resource) throws BeanDefinitionStoreException;

}
