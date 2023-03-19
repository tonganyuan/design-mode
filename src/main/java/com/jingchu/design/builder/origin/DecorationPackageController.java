package com.jingchu.design.builder.origin;

import com.jingchu.design.builder.IMatter;
import com.jingchu.design.builder.celling.LevelOneCelling;
import com.jingchu.design.builder.celling.LevelTwoCelling;
import com.jingchu.design.builder.coat.DuluxCoat;
import com.jingchu.design.builder.coat.LiBangCoat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/19 19:33
 */
public class DecorationPackageController {

    public String getMatterList(BigDecimal area, Integer level) {
        List<IMatter> matterList = new ArrayList<>();
        BigDecimal price = BigDecimal.ZERO;
        if (1 == level) {
            LevelTwoCelling levelTwoCelling = new LevelTwoCelling();
            matterList.add(levelTwoCelling);
            DuluxCoat duluxCoat = new DuluxCoat();
            matterList.add(duluxCoat);
            price = price.add(area.multiply(levelTwoCelling.price())).add(area.multiply(duluxCoat.price()));
        }

        if (2 == level) {
            LevelOneCelling levelOneCelling = new LevelOneCelling();
            matterList.add(levelOneCelling);
            LiBangCoat liBangCoat = new LiBangCoat();
            matterList.add(liBangCoat);
            price = price.add(area.multiply(levelOneCelling.price())).add(area.multiply(liBangCoat.price()));
        }
        StringBuilder detail = new StringBuilder();
        for (IMatter iMatter : matterList) {
            detail.append("装修材料：").append(iMatter.desc());
        }
        detail.append("总价：").append(price);
        return detail.toString();
    }
}
