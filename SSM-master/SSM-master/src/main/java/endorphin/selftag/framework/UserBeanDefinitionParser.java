package endorphin.selftag.framework;

import endorphin.selftag.beans.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
    @Override
    protected Class<?> getBeanClass(Element element) {
        // 返回属性值所对应的属性对象
        return User.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        // 获取属性标签具备的属性值
        String username = element.getAttribute("username");
        String email = element.getAttribute("email");
        Integer age = Integer.valueOf(element.getAttribute("age"));
        //
        if (StringUtils.hasText(username)){
            builder.addPropertyValue("username",username);
        }
        if (StringUtils.hasText(email)){
            builder.addPropertyValue("email",email);
        }
        if (age != null){
            builder.addPropertyValue("age",age);
        }
    }
}
