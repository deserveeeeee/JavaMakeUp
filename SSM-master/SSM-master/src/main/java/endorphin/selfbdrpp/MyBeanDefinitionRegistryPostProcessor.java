package endorphin.selfbdrpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyBeanDefinitionRegistryPostProcessor() {
        System.out.println("===MyBeanDefinitionRegistryPostProcessor构造方法实现===");
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(OfferKing.class);
        beanDefinitionBuilder.addPropertyValue("name", "zhangsan");
        registry.registerBeanDefinition("offerKing", beanDefinitionBuilder.getBeanDefinition());
        System.out.println("==执行postProcessBeanDefinitionRegistry==MyBeanDefinitionRegistryPostProcessor");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("==执行postProcessBeanDefinitionRegistry==MyBeanDefinitionRegistryPostProcessor");
    }
}
