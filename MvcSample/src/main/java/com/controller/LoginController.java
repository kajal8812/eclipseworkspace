package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.Cruddao.CrudInsertItemDetails;
import com.Cruddao.CrudInsertRequisition;
import com.fileupload.SequenceGenerator;
import com.modal.ItemDetails;
import com.modal.Requisition;

//
@Controller
public class LoginController {

	private static final Logger log = LogManager.getLogger(LoginController.class);

	@Autowired
	private UserDao userDao;

	@Autowired
	private ItemDao itemDao;

	//private List<Requisition> itemList = new ArrayList<>();

	//private CrudMethod crud = new CrudMethod();

	//@ResponseStatus(HttpStatus.CREATED) 
	//	@RequestMapping(value = "/requestorname", method = RequestMethod.POST)
	//	public String clickOnSave(@ModelAttribute Requisition requisition, Model model) {
	//		int status = CrudInsertRequisition.saveRequisition(requisition);
	//		if (status > 0) {
	//			//System.out.println("record have been saved succesfuuulllyyyy");
	//			//model.addAttribute("status","Record have been saved Successfully")
	//		} else
	//			System.out.println(" record not saved");
	//
	//		return "task";
	//	}

	//	@RequestMapping(value = "/test", method = RequestMethod.GET)
	//	public String sample() {
	//		return "index";
	//	}

	//	@RequestMapping(value = "/myPage", method = RequestMethod.GET)
	//	public String page() {
	//		return "index1";
	//	}

	//trace debug info warn error fatal

	@RequestMapping("/hello")
	public String hi() {
		//		System.out.print("trace is printed");
		log.trace("trace is printed");
		//		System.out.print("debug is printed");
		log.debug("debug is printrd");
		//		System.out.print("info is printed");
		log.info("info is printed");
		//		System.out.print("warn is printed");
		log.warn("warn is printed");
		//		System.out.print("error is printed");
		log.error("error is printed");
		//		System.out.print("fatal is printed");
		log.fatal("fatal is printef");
		return "test";
	}

	@RequestMapping(value = "/requestorname", method = RequestMethod.POST)
	public ModelAndView clickOnSave(@Valid @ModelAttribute Requisition requisition, BindingResult result) {
		if (result.hasErrors()) {

			System.out.print(result);
			//	"/webapp/index.jsp";
			ModelAndView mv = new ModelAndView("index1");
			return mv;

		}
		System.out.println("version: " + SpringVersion.getVersion());
		int status = CrudInsertRequisition.saveRequisition(requisition);
		if (status > 0) {
			//System.out.println("record have been saved succesfuuulllyyyy");
			//model.addAttribute("status","Record have been saved Successfully")
		} else
			System.out.println(" record not saved");
		//System.out.print(result);
		ModelAndView mv = new ModelAndView("task");
		return mv;

		//		else {
		//			System.out.print(result);
		//			return "test";
		//		}

		//return "task";

	}

	@RequestMapping(value = "/itemdetails", method = RequestMethod.POST)
	public String clickOnAdd(@ModelAttribute ItemDetails details, Model model) {
		//itemList.add(requisition);

		//		int status = crud.save(requisition);
		//		if (status > 0) {
		//			System.out.println("record have been saved succesfuuulllyyyy");
		//		} else
		//			System.out.println(" record not saved");
		System.out.println("Name: " + details.getType());
		System.out.println("Name: " + details.getCategory());
		System.out.println("Name: " + details.getSubCategory());
		System.out.println("Name: " + details.getItemName());
		System.out.println("Name: " + details.getQuantity());
		System.out.println("Name: " + details.getEstimatedPrice());
		System.out.print("hii");

		int status = CrudInsertItemDetails.saveDetails(details);
		if (status > 0) {
			System.out.println("record have been saved succesfuuulllyyyy");
		} else
			System.out.println(" record not saved");

		return "table";
	}

	@RequestMapping(value = "/getAll")
	public String getAllValues(Model model) {
		System.out.print("geettting ");
		List<Requisition> list = CrudInsertRequisition.getAll();
		model.addAttribute("list", list);
		return "view";
	}

	@RequestMapping("/user/{userId}/items")
	public String getUserItems(@PathVariable int userId, Model model) {
		//int userId = 1;
		Requisition user = userDao.getUserById(userId);
		if (user != null) {
			List<ItemDetails> items = itemDao.getItemsByUserId(userId);
			model.addAttribute("user", user);
			model.addAttribute("items", items);
			return "useritems";
		}
		return "error";
	}

	//	@PostMapping("/upload")
	//	@ResponseBody
	//	public String uploadFile(@RequestParam("file") MultipartFile file) {
	//		System.out.print("coming");
	//		if (file.isEmpty()) {
	//			return "Please select a file to upload.";
	//		}
	//
	//		try {
	//			String uploadDir = "D://uploaded_files"; // Set your desired upload directory
	//			String originalFileName = file.getOriginalFilename();
	//			String fileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
	//			String uniqueFileName = generateUniqueFileName(uploadDir, fileExtension);
	//
	//			File uploadedFile = new File(uploadDir, uniqueFileName);
	//			file.transferTo(uploadedFile);
	//
	//			return "File uploaded successfully.";
	//		} catch (IOException e) {
	//			return "File upload failed: " + e.getMessage();
	//		}
	//	}
	//
	//	private String generateUniqueFileName(String uploadDir, String fileExtension) {
	//		String baseFileName = UUID.randomUUID().toString();
	//		String uniqueFileName = baseFileName + fileExtension;
	//
	//		File file = new File(uploadDir, uniqueFileName);
	//		int sequenceNumber = 1;
	//
	//		while (file.exists()) {
	//			uniqueFileName = baseFileName + "_" + sequenceNumber + fileExtension;
	//			file = new File(uploadDir, uniqueFileName);
	//			sequenceNumber++;
	//		}
	//
	//		return uniqueFileName;
	//	}

	@PostMapping("/upload")
	@ResponseBody
	public String uploadFile(@RequestParam("file") MultipartFile file) {
		System.out.print("coming");
		if (file.isEmpty()) {
			return "Please select a file to upload.";
		}

		try {
			String uploadDir = "D://uploaded_files";
			String originalFileName = file.getOriginalFilename();
			System.out.println(originalFileName);
			String fileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
			System.out.println(fileExtension);
			String uniqueFileName = generateUniqueFileName(uploadDir, fileExtension);
			System.out.println(uniqueFileName);
			File uploadedFile = new File(uploadDir, uniqueFileName);
			file.transferTo(uploadedFile);

			return "File uploaded successfully.";
		} catch (IOException e) {
			return "File upload failed: " + e.getMessage();
		}
	}

	private String generateUniqueFileName(String uploadDir, String fileExtension) {
		String baseFileName = SequenceGenerator.getNext() + " ";
		System.out.println(baseFileName);
		String uniqueFileName = baseFileName + fileExtension;

		File file = new File(uploadDir, uniqueFileName);

		while (file.exists()) {
			uniqueFileName = baseFileName + "_" + fileExtension;
			file = new File(uploadDir, uniqueFileName);
		}

		return uniqueFileName;
	}
}
