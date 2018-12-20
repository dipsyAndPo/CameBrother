package cn.source.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import cn.source.pojo.Mould;
import cn.source.service.MouldService;

@Controller
@RequestMapping("")
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
		
	
	@RequestMapping("selectMouldlist")
	public ModelAndView selectMouldlist(Integer tid) {
		ModelAndView mav = new ModelAndView();
		List<Mould> moulds = mouldService.selectMouldlist(tid);
		mav.addObject("moulds", moulds);
		mav.setViewName("SelectMouldList");
		return mav;
	}
	//修改1.
	@RequestMapping("updateByPrimaryKeySelectiveaa")
	@ResponseBody
	public String updateByPrimaryKeySelectiveaa(Mould mould) {
		ModelAndView mav = new ModelAndView();
		mouldService.updateByPrimaryKeySelectiveaa(mould);
		mav.setViewName("success");
		return "success";
	}
	//修改2.
	@RequestMapping("updateByPrimaryKeySelective2")
	@ResponseBody
	public String updateByPrimaryKeySelective2(Mould mould) {
		ModelAndView mav = new ModelAndView();
		mouldService.updateByPrimaryKeySelective2(mould);
		mav.setViewName("success");
		return "success";
	}
	//修改3.
	@RequestMapping("updateByPrimaryKeySelective3")
	@ResponseBody
	public String updateByPrimaryKeySelective3(Mould mould) {
		ModelAndView mav = new ModelAndView();
		mouldService.updateByPrimaryKeySelective3(mould);
		mav.setViewName("success");
		return "success";
	}
}
