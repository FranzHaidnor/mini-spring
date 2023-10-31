package org.springframework.beans.factory.support;

import cn.hutool.core.lang.Assert;
import org.springframework.beans.factory.BeanDefinitionStoreException;

public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        Assert.notNull(registry, "BeanDefinitionRegistry must not be null");
    }

    @Override
    public int loadBeanDefinitions(String... locations) throws BeanDefinitionStoreException {
        Assert.notNull(locations, "Location array must not be null");
        int count = 0;
        for (String location : locations) {
            // 把 location 转换为 Resource
            count += loadBeanDefinitions("null");
        }
        return count;
    }

}
