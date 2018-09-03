package com.aikbc.pandora.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aikbc.pandora.entity.MinerBasicInfo;
import com.aikbc.pandora.service.MinerBasicInfoService;

/**
 * <p>
 * 矿机基础信息 前端控制器
 * </p>
 *
 * @author CJay123
 * @since 2018-09-03
 */
@Controller
@RequestMapping("/minerBasicInfo")
public class MinerBasicInfoController {

	@Autowired
	private MinerBasicInfoService minerBasicInfoService;
	
	public Integer addMinerBasicInfo(MinerBasicInfo minerBasicInfo){
		return minerBasicInfoService.addMinerBascInfo(minerBasicInfo);
	}
	
	@RequestMapping("/list")
	public String listMinerInfoBasic(Model model){
		List<MinerBasicInfo> list =  minerBasicInfoService.getMinerBascInfo();
		model.addAttribute("test","Miner info");
		model.addAttribute("miners",list);
		return "/miner/minerInfo";
	}
		
}

