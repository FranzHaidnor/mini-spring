package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * bean容器
 */
public interface BeanFactory {

	/**
	 * 从容器中获取bean
	 *
	 * @param name bean 的名称
	 * @throws BeansException bean不存在时
	 */
	Object getBean(String name) throws BeansException;
}
