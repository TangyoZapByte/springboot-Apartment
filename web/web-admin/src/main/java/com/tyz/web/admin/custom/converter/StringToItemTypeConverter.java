package com.tyz.web.admin.custom.converter;

import com.tyz.model.enums.ItemType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToItemTypeConverter implements Converter<String, ItemType> {
    @Override
    public ItemType convert(String code) {

        for (ItemType value : ItemType.values()) {
            if (value.getCode().equals(Integer.valueOf(code))) {
                return value;
            }
        }
        throw new IllegalArgumentException("code非法");
    }
}