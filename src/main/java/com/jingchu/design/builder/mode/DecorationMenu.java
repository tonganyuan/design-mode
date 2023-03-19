package com.jingchu.design.builder.mode;

import com.jingchu.design.builder.IMatter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/19 19:48
 */
public class DecorationMenu implements IMenu {

    private final List<IMatter> matterList = new ArrayList<>();
    private final BigDecimal area;
    private BigDecimal price = BigDecimal.ZERO;
    private final String grade;

    public DecorationMenu(BigDecimal area, String grade) {
        this.area = area;
        this.grade = grade;
    }

    @Override
    public IMenu appendCelling(IMatter matter) {
        matterList.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendCoat(IMatter matter) {
        matterList.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public String getDetail() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(grade);
        for (IMatter iMatter : matterList) {
            stringBuilder.append(iMatter.desc()).append(iMatter.brand());
        }
        stringBuilder.append("价格：").append(price);
        return stringBuilder.toString();
    }
}
