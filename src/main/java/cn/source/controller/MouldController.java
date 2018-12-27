package cn.source.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import cn.source.pojo.Mould;
import cn.source.pojo.Page;
import cn.source.service.MouldService;

@Controller
public class MouldController {
	@Autowired
	MouldService mouldService;
	//json
		String jsons;
		
		//��ѯ����ģ��
		@RequestMapping(value="selectAllMould",produces="text/html;charset=UTF-8")
		@ResponseBody
		public String selectAllMould() {
			List<Mould> mouldList = mouldService.selectAllMould();
			jsons=JSON.toJSONString(mouldList,SerializerFeature.DisableCircularReferenceDetect);
			return jsons;
		}
		
		//ͨ��ID��ѯģ��
		@RequestMapping(value="selectMouldById",produces="text/html;charset=UTF-8")
		@ResponseBody
		public String selectMouldById(int mid) {
			Mould moulds = mouldService.findMouldById(mid);
			jsons=JSON.toJSONString(moulds);
			System.out.println(jsons);
			return jsons;
		}
		
		//点赞
		@RequestMapping("mouldPraise")
		@ResponseBody
		public String mouldPraise(int mid) {
			mouldService.mouldPraise(mid);
			jsons="1";
			return jsons;
		}
	
		//踩
		@RequestMapping("mouldTread")
		@ResponseBody
		public String mouldTread(int mid) {
			mouldService.mouldTread(mid);
			jsons="1";
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

	// ɾ��
	@RequestMapping("deleteByPrimaryKeyMould")
	@ResponseBody
	public String deleteByPrimaryKey(Integer mid) {
		mouldService.deleteByPrimaryKey(mid);
		return "success";
	}

	// �޸�1.
	@RequestMapping("updateByPrimaryKeySelectiveaa")
	@ResponseBody
	public String updateByPrimaryKeySelectiveaa(Mould mould) {
		ModelAndView mav = new ModelAndView();
		mouldService.updateByPrimaryKeySelectiveaa(mould);
		mav.setViewName("success");
		return "success";
	}

	// �޸�2.
	@RequestMapping("updateByPrimaryKeySelective2")
	@ResponseBody
	public String updateByPrimaryKeySelective2(Mould mould) {
		ModelAndView mav = new ModelAndView();
		mouldService.updateByPrimaryKeySelective2(mould);
		mav.setViewName("success");
		return "success";
	}

	// �޸�3.
	@RequestMapping("updateByPrimaryKeySelective3")
	@ResponseBody
	public String updateByPrimaryKeySelective3(Mould mould) {
		ModelAndView mav = new ModelAndView();
		mouldService.updateByPrimaryKeySelective3(mould);
		mav.setViewName("success");
		return "success";
	}

	// �޸�4.
	@RequestMapping("updateByPrimaryKeySelective4")
	@ResponseBody
	public String updateByPrimaryKeySelective4(Mould mould) {
		ModelAndView mav = new ModelAndView();
		mouldService.updateByPrimaryKeySelective4(mould);
		mav.setViewName("success");
		return "success";
	}

	// �޸�5.
	@RequestMapping("updateByPrimaryKeySelective5")
	@ResponseBody
	public String updateByPrimaryKeySelective5(Mould mould) {
		ModelAndView mav = new ModelAndView();
		mouldService.updateByPrimaryKeySelective5(mould);
		mav.setViewName("success");
		return "success";
	}
	//��ҳ
	@RequestMapping("Pagelist")
	public ModelAndView Pagelist(Page page) {
		ModelAndView mav = new ModelAndView();
		List<Mould> moulds = mouldService.Pagelist(page);
		int total = mouldService.total();
		page.caculateLast(total);
		mav.addObject("moulds",moulds);
		mav.setViewName("SelectMouldList");
		return mav;
	}
}
