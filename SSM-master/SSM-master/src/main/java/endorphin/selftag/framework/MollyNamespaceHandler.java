package endorphin.selftag.framework;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MollyNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
        registerBeanDefinitionParser("city",new CityBeanDefinitionParser());
    }
}
