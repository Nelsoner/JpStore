package com.JppStore.service;

import com.JppStore.common.pojo.EasyUIDataGridResult;
import com.JppStore.common.utils.E3Result;
import com.JppStore.pojo.TbItem;
import com.JppStore.pojo.TbItemDesc;

public interface ItemService {

    TbItem getItemById(long itemID);
    EasyUIDataGridResult getItemList(int page, int rows);
    E3Result addItem(TbItem item, String desc);
    TbItemDesc getItemDescById(long itemId);
}
