package com.JppStore.sso.service;

import com.JppStore.common.utils.E3Result;
import com.JppStore.pojo.TbUser;

public interface RegisterService {

	E3Result checkData(String param, int type);
	E3Result register(TbUser user);
}
