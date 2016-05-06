package com.company;

import java.util.*;

/**
 * Created by LJ on 2016/5/6.
 * Describe : This class is responsible for
 */
public class Q133_CloneGraph
{
    private Map<Integer, UndirectedGraphNode> map = new HashMap<>();
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node)
    {
        return dfs(node);
    }

    private UndirectedGraphNode dfs(UndirectedGraphNode node)
    {
        if (node == null)
            return null;
        UndirectedGraphNode root = new UndirectedGraphNode(node.label);
        map.put(root.label, root);
        List<UndirectedGraphNode> list = node.neighbors;
        for (UndirectedGraphNode n : list)
        {
            if (map.containsKey(n.label))
                root.neighbors.add(map.get(n.label));
            else
                root.neighbors.add(dfs(n));
        }
        return root;

    }

}
