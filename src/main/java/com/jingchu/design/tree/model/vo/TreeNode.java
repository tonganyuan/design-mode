package com.jingchu.design.tree.model.vo;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/21 22:15
 */
public class TreeNode {

    private Long treeId;

    private Long treeNodeId;

    private Integer nodeType;

    private Object nodeValue;

    private String ruleKey;

    private String ruleDesc;

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public Long getTreeNodeId() {
        return treeNodeId;
    }

    public void setTreeNodeId(Long treeNodeId) {
        this.treeNodeId = treeNodeId;
    }

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public Object getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(Object nodeValue) {
        this.nodeValue = nodeValue;
    }

    public String getRuleKey() {
        return ruleKey;
    }

    public void setRuleKey(String ruleKey) {
        this.ruleKey = ruleKey;
    }

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }
}
