package org.springframework.beans.factory.support;

import org.springframework.beans.factory.config.BeanDefinition;

/**
 * bean 定义注册表接口
 */
public interface BeanDefinitionRegistry {

	/**
	 * 向支持表中注册bean定义对象
	 * @param beanName bean 的名称
	 * @param beanDefinition bean 定义对象信息
	 */
	void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
