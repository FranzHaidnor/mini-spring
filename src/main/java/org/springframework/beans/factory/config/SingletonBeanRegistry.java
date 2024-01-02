package org.springframework.beans.factory.config;

/**
 * 单例 bean 注册表
 */
public interface SingletonBeanRegistry {

	/**
	 * 给定指定的 bean 名称获取单例实例
	 */
	Object getSingleton(String beanName);
}
