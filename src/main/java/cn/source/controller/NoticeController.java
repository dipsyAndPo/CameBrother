package cn.source.controller;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

import cn.source.pojo.Notice;
import cn.source.service.NoticeService;

@Controller
@RequestMapping("")
public class NoticeController {
	@Autowired
	NoticeService noticeService;
	
	//查看所有公告
	@RequestMapping("selectNotice")
	public ModelAndView selectNotice() {
		ModelAndView mav = new ModelAndView();
	    List<Notice> notices = noticeService.selectNotice();
	    mav.addObject("notices", notices);
	    mav.setViewName("SelectNoticeList");
		return mav;
	}
	
	
	//ajax获取前五个公告
		@RequestMapping(value="getAjaxNotice",produces="text/html;charset=UTF-8")
		@ResponseBody
		public String getAjaxNotice() {
		    List<Notice> notices = noticeService.selectNoticeBy5();
			return JSON.toJSONString(notices);
		}
	
	//删除
	@RequestMapping("deleteNotice")
	public ModelAndView deleteNotice(Integer nid) {
		ModelAndView mav = new ModelAndView();
		noticeService.deleteNotice(nid);
		mav.setViewName("redirect:/selectNotice");
		return mav;
	}
	//修改1
	@RequestMapping("updateNotice1")
	@ResponseBody 
	public String updateNotice1(Notice notice) {
		noticeService.updateNotice1(notice);
		return "success";
	}
	//修改1
	@RequestMapping("updateNotice2")
	@ResponseBody 
	public String updateNotice2(Notice notice) {
		noticeService.updateNotice2(notice);
		return "success";
	}
	//添加
	@RequestMapping(value="insertNotice",method=RequestMethod.POST)
	public String insertNotice(Notice notice,MultipartFile file,MultipartFile file1, HttpServletRequest request) throws  IOException {
		String name = UUID.randomUUID().toString().replaceAll("-", "");
		String name1 = UUID.randomUUID().toString().replaceAll("-", "");
		String ext = FilenameUtils.getExtension(file.getOriginalFilename());
		String ext1 = FilenameUtils.getExtension(file1.getOriginalFilename());
		String url = request.getSession().getServletContext().getRealPath("/upload");
		System.out.println(url);
		file.transferTo(new File(url+"/"+name + "." + ext));
		file1.transferTo(new File(url+"/"+name1 + "." + ext1));
		notice.setImg("upload/"+name + "." + ext);
		notice.setLogoimg("upload/"+name1 + "." + ext1);
		noticeService.insertNotice(notice);
		return "redirect:/selectNotice";
	}

}
