package endorphin.selfbdrpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;

public class MySelfBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(MyBeanDefinitionRegistryPostProcessor.class);
        registry.registerBeanDefinition("MyBeanDefinitionRegistryPostProcessor",beanDefinitionBuilder.getBeanDefinition());
        System.out.println("===MySelfBeanDefinitionRegistryPostProcessor:postProcessBeanDefinitionRegistry===");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("===MySelfBeanDefinitionRegistryPostProcessor:postProcessBeanFactory===");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
