package com.sankuai.inf.leaf.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 健康检查 控制器
 * @author honghu
 */
@RestController
@RequestMapping("/health")
public class HealthController {

	/**
	 * 健康检查
	 */
	@GetMapping("/check")
	public void check() {
		// NOTHING TO DO
	}

}
