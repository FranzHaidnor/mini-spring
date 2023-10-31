package org.springframework.context.support;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.XmlBeanDefinitionReader;

public class GenericXmlApplicationContext extends GenericApplicationContext  {

    /**
     * 创建 XmlBeanDefinitionReader. 其中的 BeanDefinitionRegistry 就是自己
     */
    private final XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(this);

    /**
     * 创建一个新的GenericXmlApplicationContext，加载bean定义
     * 从给定的资源位置并自动刷新上下文。
     *
     * @param resourceLocations 要加载的资源
     */
    public GenericXmlApplicationContext(String... resourceLocations) {
        load(resourceLocations);
        refresh();
    }

    /**
     * Load bean definitions from the given XML resources.
     *
     * @param resourceLocations one or more resource locations to load from
     */
    public void load(String... resourceLocations) {
        this.reader.loadBeanDefinitions(resourceLocations);
    }

}
