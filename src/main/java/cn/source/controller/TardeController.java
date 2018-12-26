package cn.source.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.source.pojo.Tarde;
import cn.source.service.TardeService;

@Controller
@RequestMapping("")
public class TardeController {
	@Autowired
	TardeService tardeService;
	

	@RequestMapping(value="selectByExample",method=RequestMethod.GET,produces="text/html;charset=UTF-8")
	public ModelAndView selectByExample() {
		ModelAndView mav = new ModelAndView();
		List<Tarde> tardes = tardeService.selectByExample();
		mav.addObject("tardes", tardes);

		mav.setViewName("SelectTarde");
		return mav;
	}

	@RequestMapping(value="deleteByPrimaryKey",produces="text/html;charset=UTF-8")
	public ModelAndView deleteByPrimaryKey(Integer tid) {
		ModelAndView mav = new ModelAndView();
		tardeService.deleteByPrimaryKey(tid);
		mav.setViewName("redirect:/selectByExample");
		return mav;
	}

	@RequestMapping(value="insert",produces="text/html;charset=UTF-8")
	public ModelAndView insert(Tarde record) {
		ModelAndView mav = new ModelAndView();
		tardeService.insert(record);
		mav.setViewName("redirect:/selectByExample");
		return mav;
	}
	@RequestMapping(value="updateByPrimaryKeySelective",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String updateByPrimaryKeySelective(Tarde record) {
		tardeService.updateByPrimaryKeySelective(record);
		tardeService.updateByPrimaryKeySelective(record);
		return "success";
	}
}
