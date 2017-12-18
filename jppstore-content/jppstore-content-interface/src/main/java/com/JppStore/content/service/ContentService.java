package com.JppStore.content.service;

import com.JppStore.common.utils.E3Result;
import com.JppStore.pojo.TbContent;

import java.util.List;

public interface ContentService {

	E3Result addContent(TbContent content);
	List<TbContent> getContentListByCid(long cid);
}
