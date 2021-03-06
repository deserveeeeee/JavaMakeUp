package endorphin.context;

import endorphin.selfBfpp.MyBeanFactoryPostProcessor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {
    /**
     * 扩展点一，initPropertySources
     * 例如：
     *      可以设置必要的属性
     */
    @Override
    protected void initPropertySources() {
//        getEnvironment().setRequiredProperties("abc");
        super.initPropertySources();
    }

    /**
     * 扩展点二，customizeBeanFactory
     * @param beanFactory beanFactory
     */
    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
//        super.setAllowBeanDefinitionOverriding(false);
//        super.setAllowCircularReferences(false);
        this.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
        super.customizeBeanFactory(beanFactory);
    }

    public MyClassPathXmlApplicationContext() {
    }

    public MyClassPathXmlApplicationContext(String configLocation) throws BeansException {
        super(configLocation);
    }

    @Override
    protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
        System.out.println("主要是拿到了beanFactory可以做一些操作");
        super.postProcessBeanFactory(beanFactory);
    }
}
