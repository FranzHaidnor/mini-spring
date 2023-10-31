package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

public interface BeanFactory {

    /**
     * Return an instance, which may be shared or independent, of the specified bean.
     * <p>This method allows a Spring BeanFactory to be used as a replacement for the
     * Singleton or Prototype design pattern. Callers may retain references to
     * returned objects in the case of Singleton beans.
     * <p>Translates aliases back to the corresponding canonical bean name.
     * <p>Will ask the parent factory if the bean cannot be found in this factory instance.
     *
     * @param name the name of the bean to retrieve
     * @return an instance of the bean
     * @throws BeansException if the bean could not be obtained
     */
    Object getBean(String name) throws BeansException;

}
