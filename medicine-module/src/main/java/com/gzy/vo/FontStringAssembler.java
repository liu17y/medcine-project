package com.gzy.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FontStringAssembler {
    public static void main(String[] args) {
        String originalString = "<font color='#dd4b39'>寒</font><font color='#dd4b39'>性</font><font color='#dd4b39'>中药</font>";
        String formattedString = assembleFormattedString(originalString);
        System.out.println(formattedString);
    }

    public static String assembleFormattedString(String originalString) {
        // 正则表达式匹配<font color='#dd4b39'>内容</font>
        Pattern pattern = Pattern.compile("<font color='#dd4b39'>(.*?)</font>");
        Matcher matcher = pattern.matcher(originalString);

        List<String> formattedParts = new ArrayList<>();
        while (matcher.find()) {
            String part = matcher.group(1); // 提取<font>标签内的内容
            formattedParts.add("" + "<font color='#dd4b39'>" + part + "</font>" + "");
        }

        for (String formattedPart : formattedParts) {
            System.out.println(formattedPart);
        }

        // 将格式化后的部分放入数组中
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < formattedParts.size(); i++) {
            sb.append(formattedParts.get(i));
            if (i < formattedParts.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
