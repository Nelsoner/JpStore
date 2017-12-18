package com.JppStore.service;

import com.JppStore.common.pojo.EasyUITreeNode;

import java.util.List;

public interface ItemCatService {

	List<EasyUITreeNode> getItemCatlist(long parentId);
}
