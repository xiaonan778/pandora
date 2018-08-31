package com.aikbc.pandora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aikbc.pandora.entity.MinerBasicInfo;
import com.aikbc.pandora.service.MinerBasicService;

/**
 * @author CJay
 * @date 2018年8月31日 上午10:08:48
 */
@RestController
public class MinerBasicController {
	
	@Autowired
	private MinerBasicService minerBasicService;
	
	@RequestMapping(value="getMinerBasicList")
	public List<MinerBasicInfo> getMinerBasicList(int pageNum,int pageSize){
		return minerBasicService.getList(pageNum,pageSize);
	}
}
