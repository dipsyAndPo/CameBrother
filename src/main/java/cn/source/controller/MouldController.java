package cn.source.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.source.pojo.Mould;
import cn.source.service.MouldService;

@Controller
@RequestMapping("")
public class MouldController {
	@Autowired
	MouldService mouldService;
	
	@RequestMapping("selectMouldlist")
	public ModelAndView selectMouldlist(Integer tid) {
		ModelAndView mav = new ModelAndView();
		List<Mould> moulds = mouldService.selectMouldlist(tid);
		mav.addObject("moulds", moulds);
		mav.setViewName("SelectMouldList");
		return mav;
	}
	//ÐÞ¸Ä1.
	@RequestMapping("updateByPrimaryKeySelectiveaa")
	@ResponseBody
	public String updateByPrimaryKeySelectiveaa(Mould mould) {
		ModelAndView mav = new ModelAndView();
		mouldService.updateByPrimaryKeySelectiveaa(mould);
		mav.setViewName("success");
		return "success";
	}
	//ÐÞ¸Ä2.
	@RequestMapping("updateByPrimaryKeySelective2")
	@ResponseBody
	public String updateByPrimaryKeySelective2(Mould mould) {
		ModelAndView mav = new ModelAndView();
		mouldService.updateByPrimaryKeySelective2(mould);
		mav.setViewName("success");
		return "success";
	}
	//ÐÞ¸Ä3.
	@RequestMapping("updateByPrimaryKeySelective3")
	@ResponseBody
	public String updateByPrimaryKeySelective3(Mould mould) {
		ModelAndView mav = new ModelAndView();
		mouldService.updateByPrimaryKeySelective3(mould);
		mav.setViewName("success");
		return "success";
	}
}
