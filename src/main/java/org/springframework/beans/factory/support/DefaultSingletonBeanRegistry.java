package org.springframework.beans.factory.support;

import org.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 默认的单例bean 注册器
 * <p>
 * 管理了存放 单例对象 Bean 的容器
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    // 存放单例bean 实例的容器
    private Map<String, Object> singletonObjects = new HashMap<>();

    // 从容器中获得单例bean
    // 实现于接口 SingletonBeanRegistry
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    // 向容器中注册单例bean
    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
