package com.coforge.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.pms.model.Product;
import com.coforge.pms.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	
	@RequestMapping("/home")
	public ModelAndView loadHomePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");
		return mv;
	}
	
	@RequestMapping(value="/product", method=RequestMethod.POST, params="Insert")
	public ModelAndView createProduct(@ModelAttribute Product product) {

	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("ProductHome");

	    String result = "";
	    boolean status = service.createProduct(product);

	    if(status) {
	        result = "SUCCESS : Product Object Created";
	    } else {
	        result = "FAILED : Product Object Not Created";
	    }

	    mv.addObject("result", result);
	    return mv;
	}
	
	@RequestMapping(value="/product", method=RequestMethod.POST, params="Delete")
	public ModelAndView deleteProduct(@RequestParam int pid) {
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("ProductHome");

	    String result = "";
	    boolean status = service.deleteProduct(pid);

	    if(status) {
	        result = "SUCCESS : Product Deleted";
	    } else {
	        result = "FAILED : Product Not Deleted";
	    }

	    mv.addObject("result", result);
	    return mv;
	}
	
	@RequestMapping(value="/product", method=RequestMethod.POST, params="Update")
	public ModelAndView updateProduct(@ModelAttribute Product product) {
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("ProductHome");

	    String result = "";
	    boolean status = service.updateProduct(product);

	    if(status) {
	        result = "SUCCESS : Product Updated";
	    } else {
	        result = "FAILED : Product Not Updated";
	    }

	    mv.addObject("result", result);
	    return mv;
	}
	
	@RequestMapping(value="/product", method=RequestMethod.POST, params="Find")
	public ModelAndView findProduct(@RequestParam int pid) {
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("ProductHome");

	    Product p = service.findProduct(pid);

	    if(p != null) {
	        mv.addObject("result", p);
	    } else {
	        mv.addObject("result", "Product Not Found");
	    }

	    return mv;
	}
	
	@RequestMapping(value="/product", method=RequestMethod.POST, params="FindAll")
	public ModelAndView findAllProducts() {
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("ProductHome");

	    mv.addObject("result", service.findAllProduct());

	    return mv;
	}
}
