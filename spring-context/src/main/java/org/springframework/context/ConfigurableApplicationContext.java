package org.springframework.context;

import org.springframework.beans.BeansException;

public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * Spring框架中的refresh()方法是ApplicationContext接口中的一个方法，它的作用是重新加载或刷新应用程序上下文。
     * 当应用程序上下文被创建后，如果需要对其进行更改，比如添加或删除bean定义、更改属性值等，那么就需要调用refresh()方法来重新加载或刷新应用程序上下文，以使更改生效。
     * 在调用refresh()方法时，Spring框架会重新加载所有的bean定义，并且会销毁所有已经存在的bean实例，然后重新创建新的bean实例。这样可以确保应用程序上下文中的所有bean都是最新的，并且与当前的配置相匹配。
     * 需要注意的是，如果在调用refresh()方法之前，已经使用了应用程序上下文中的任何bean，则这些bean将无法被销毁。因此，在调用refresh()方法之前，应该尽可能避免使用应用程序上下文中的任何bean。
     * 总之，refresh()方法的作用是重新加载或刷新应用程序上下文，以使更改生效，并且确保所有bean都是最新的。
     */
    void refresh() throws BeansException, IllegalStateException;

}
