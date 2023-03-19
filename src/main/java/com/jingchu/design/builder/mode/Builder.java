package com.jingchu.design.builder.mode;

import com.jingchu.design.builder.celling.LevelOneCelling;
import com.jingchu.design.builder.celling.LevelTwoCelling;
import com.jingchu.design.builder.coat.DuluxCoat;
import com.jingchu.design.builder.coat.LiBangCoat;

import java.math.BigDecimal;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/19 19:55
 */
public class Builder {

    public static IMenu levelOne(BigDecimal area) {
        return new DecorationMenu(area, "轻奢风格").appendCelling(new LevelOneCelling())
                .appendCoat(new DuluxCoat());
    }

    public static IMenu levelTwo(BigDecimal area) {
        return new DecorationMenu(area, "欧式风格").appendCelling(new LevelTwoCelling())
                .appendCoat(new LiBangCoat());
    }
}
