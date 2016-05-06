package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LJ on 2016/5/6.
 * Describe : This class is responsible for
 */
public class UndirectedGraphNode
{
    int label;
    List<UndirectedGraphNode> neighbors;
    UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
}
