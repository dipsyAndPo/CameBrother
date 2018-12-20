package cn.source.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.source.pojo.Tarde;
import cn.source.service.TardeService;

@Controller
@RequestMapping("")
public class TardeController {
	@Autowired
	TardeService tardeService;
	
	//查询所有行业
	@RequestMapping("selectByExample")
	public ModelAndView selectByExample() {
		ModelAndView mav = new ModelAndView();
		List<Tarde> tardes = tardeService.selectByExample();
		mav.addObject("tardes", tardes);
		mav.setViewName("aa");
		return mav;
	}
	@RequestMapping("deleteByPrimaryKey")
	public ModelAndView deleteByPrimaryKey(Integer tid) {
		ModelAndView mav = new ModelAndView();
		tardeService.deleteByPrimaryKey(tid);
		mav.setViewName("redirect:/selectByExample");
		return mav;
	}
	@RequestMapping("insert")
	public ModelAndView insert(Tarde record) {
		ModelAndView mav = new ModelAndView();
		tardeService.insert(record);
		mav.setViewName("redirect:/selectByExample");
		return mav;
	}
	@RequestMapping("updateByPrimaryKeySelective")
	@ResponseBody
	public String updateByPrimaryKeySelective(Tarde record) {
		ModelAndView mav = new ModelAndView();
		tardeService.updateByPrimaryKeySelective(record);
		mav.setViewName("success");
		return "success";
	}
}
