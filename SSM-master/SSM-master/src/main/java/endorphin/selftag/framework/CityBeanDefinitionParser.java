package endorphin.selftag.framework;

import endorphin.selftag.beans.City;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class CityBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
    @Override
    protected Class<?> getBeanClass(Element element) {
        return City.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        // 获取属性标签具备的属性值
        String cityName = element.getAttribute("cityName");
        String province = element.getAttribute("province");
        Integer type = Integer.valueOf(element.getAttribute("type"));
        //
        if (StringUtils.hasText(cityName)){
            builder.addPropertyValue("cityName",cityName);
        }
        if (StringUtils.hasText(province)){
            builder.addPropertyValue("province",province);
        }
        if (type != null){
            builder.addPropertyValue("type",type);
        }
    }
}
