package com.rratchet.spring.wechat.open.menu;

import com.rratchet.spring.wechat.open.WechatAPI;
import com.rratchet.spring.wechat.open.token.accesstoken.AccessTokenManager;

public class MenuQueryAPI extends WechatAPI {

	public static final String MENU_QUERY_URL_TEMPLATE = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token={ACCESS_TOKEN}";
	
	private AccessTokenManager accessTokenManager;
	
	public MenuQueryAPIResponse query() {
		String token = accessTokenManager.token();
		MenuQueryAPIResponse response = restOperations.getForObject(MENU_QUERY_URL_TEMPLATE, MenuQueryAPIResponse.class, token);
		apiResponseAssert.assertOK(response);
		return response;
	}

	public void setAccessTokenManager(AccessTokenManager accessTokenManager) {
		this.accessTokenManager = accessTokenManager;
	}

}
