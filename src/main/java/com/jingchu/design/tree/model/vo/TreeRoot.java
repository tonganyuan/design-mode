package com.jingchu.design.tree.model.vo;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/3/21 22:15
 */
public class TreeRoot {

    private Long treeId;

    private Long treeRootNodeId;

    private String treeName;

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public Long getTreeRootNodeId() {
        return treeRootNodeId;
    }

    public void setTreeRootNodeId(Long treeRootNodeId) {
        this.treeRootNodeId = treeRootNodeId;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }
}
