//package com.upload;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//
//import javax.servlet.ServletContext;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.util.FileCopyUtils;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.multipart.MultipartHttpServletRequest;
//
//@Controller
//@RequestMapping("/fileuploadController")
//public class FileuploadController {
//	@Autowired
//	ServletContext context;
//
//	//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	//	public ModelAndView getPage() {
//	//		ModelAndView view = new ModelAndView("fileUpload");
//	//		return view;
//	//	}
//
//	@RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
//	public @ResponseBody Map<String, Object> fileUpload(MultipartHttpServletRequest request,
//			HttpServletResponse response) {
//		Map<String, Object> map = new HashMap<String, Object>();
//		List<String> fileUploadedList = new ArrayList<String>();
//		Iterator<String> itr = request.getFileNames();
//		MultipartFile mpf = null;
//
//		System.out.println("hii");
//
//		while (itr.hasNext()) {
//			mpf = request.getFile(itr.next());
//			try {
//				FileCopyUtils.copy(mpf.getBytes(), new FileOutputStream(
//						context.getRealPath("/") + "/" + mpf.getOriginalFilename().replace(" ", "-")));
//				FileCopyUtils.copy(mpf.getBytes(),
//						new FileOutputStream("D:" + "/" + mpf.getOriginalFilename().replace(" ", "-")));
//				fileUploadedList.add(mpf.getOriginalFilename().replace(" ", "-"));
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//
//		map.put("Status", 200);
//		map.put("SucessfulList", fileUploadedList);
//		return map;
//	}
//
//}

// <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
//    pageEncoding="ISO-8859-1"%>
//<!DOCTYPE html>
//<html>
//<head>
//<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
//<title>File Upload</title>
//<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
//</head>
//</head>
//<body>
//
//<h1> File Upload </h1>
//			<form id='fileUpload' onsubmit="return false;">
//				File <input type='file' id='file' multiple="multiple">
//				<button onclick="uplaod();">Upload</button>
//			</form>
//			
//	<script type="text/javascript">
//	
//	uplaod = function(){
//		
//		var data = new FormData();
//		jQuery.each(jQuery('#file')[0].files, function(i, file) {
//		    data.append('file-'+i, file);
//		});
//		
//		$.ajax({
//			url:'fileUpload',
//			data: data,
//		    cache: false,
//		    contentType: false,
//		    processData: false,
//			type:'POST',
//			success: function(response){
//				if(response.Status == 200){
//					alert(response.SucessfulList);
//				}else{
//					alert('Error');
//				}
//			
//					
//			}				
//		});
//		
//	}
//	</script>
//
//</body>
//</html>
