package endorphin.selfEditor.extend;

import endorphin.selfEditor.beans.Address;
import org.springframework.util.StringUtils;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;

public class AddressPropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (StringUtils.hasText(text)){
            String[] strings = text.split("-");
            Address address = new Address();
            address.setProvince(strings[0]);
            address.setCity(strings[1]);
            address.setDistrict(strings[2]);
            this.setValue(address);
        }
    }
}
