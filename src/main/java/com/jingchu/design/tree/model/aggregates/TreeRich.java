package com.jingchu.design.tree.model.aggregates;

import com.jingchu.design.tree.model.vo.TreeNode;
import com.jingchu.design.tree.model.vo.TreeRoot;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: tonganyuan
 * @Description: 聚合对象 包含组织树信息
 * @Date: 2023/3/21 22:14
 */
public class TreeRich {

    public TreeRich(TreeRoot treeRoot, Map<Long, TreeNode> treeNodeMap) {
        this.treeRoot = treeRoot;
        this.treeNodeMap = treeNodeMap;
    }

    private TreeRoot treeRoot;

    private Map<Long, TreeNode> treeNodeMap = new HashMap<>();

    public TreeRoot getTreeRoot() {
        return treeRoot;
    }

    public void setTreeRoot(TreeRoot treeRoot) {
        this.treeRoot = treeRoot;
    }

    public Map<Long, TreeNode> getTreeNodeMap() {
        return treeNodeMap;
    }

    public void setTreeNodeMap(Map<Long, TreeNode> treeNodeMap) {
        this.treeNodeMap = treeNodeMap;
    }
}
