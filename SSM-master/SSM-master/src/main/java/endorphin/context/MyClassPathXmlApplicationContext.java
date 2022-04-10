package endorphin.context;

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
        getEnvironment().setRequiredProperties("abc");
        super.initPropertySources();
    }

    /**
     * 扩展点二，customizeBeanFactory
     * @param beanFactory beanFactory
     */
    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        super.setAllowBeanDefinitionOverriding(false);
        super.setAllowCircularReferences(false);
        super.customizeBeanFactory(beanFactory);
    }
}
