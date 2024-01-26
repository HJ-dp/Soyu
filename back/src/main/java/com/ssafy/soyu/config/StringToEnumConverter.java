package com.ssafy.soyu.config;


import com.ssafy.soyu.item.ItemCategories;
import org.springframework.core.convert.converter.Converter;

public class StringToEnumConverter implements Converter<String, ItemCategories> {
  @Override
  public ItemCategories convert(String source) {
    try {
      return ItemCategories.valueOf(source.toUpperCase());
    } catch (IllegalArgumentException e) {
      return null;
    }
  }
}