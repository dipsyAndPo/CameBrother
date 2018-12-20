package cn.source.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import cn.source.pojo.Mould;
import cn.source.service.MouldService;

@Controller
public class MouldController {
	@Autowired
	MouldService mouldService;
	//json
	String jsons;
	
	//查询所有模板
	@RequestMapping(value="selectAllMould",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String selectAllMould() {
		List<Mould> mouldList = mouldService.selectAllMould();
		jsons=JSON.toJSONString(mouldList,SerializerFeature.DisableCircularReferenceDetect);
		return jsons;
	}
	
	//通过ID查询模板
	@RequestMapping(value="selectMouldById",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String selectMouldById(int mid) {
		Mould moulds = mouldService.findMouldById(mid);
		jsons=JSON.toJSONString(moulds);
		System.out.println(jsons);
		return jsons;
	}

}