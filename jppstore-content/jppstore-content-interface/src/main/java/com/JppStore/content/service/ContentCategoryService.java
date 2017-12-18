package com.JppStore.content.service;

import com.JppStore.common.pojo.EasyUITreeNode;
import com.JppStore.common.utils.E3Result;

import java.util.List;

public interface ContentCategoryService {

	List<EasyUITreeNode> getContentCatList(long parentId);
	E3Result addContentCategory(long parentId, String name);
}
