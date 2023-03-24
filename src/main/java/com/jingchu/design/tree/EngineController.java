package com.jingchu.design.tree;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/21 21:43
 */
public class EngineController {

    public String process(String userId, String userSex, int userAge) {
        if ("man".equals(userSex)) {
            if (userAge < 25) {
                return "果实A";
            } else {
                return "果实B";
            }
        }
        if ("woman".equals(userSex)) {
            if (userAge < 25) {
                return "果实C";
            } else {
                return "果实D";
            }
        }
        return null;
    }
}
