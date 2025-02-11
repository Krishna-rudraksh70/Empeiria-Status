package com.temp;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.temp.service.CustomerService;
import com.temp.service.LaptopService;
import com.temp.util.Customer;
import com.temp.util.Laptop;

public class App 
{
    public static void main( String[] args )
    {
    	
    	AnnotationConfigApplicationContext apc = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	CustomerService bean2 = apc.getBean("customerSer", CustomerService.class);
    	bean2.createTable();
    	Customer c = new Customer(101,"vanshika","baghpat","6784678426");
    	int saveCustomer = bean2.saveCustomer(c);
    	System.out.println(saveCustomer);
    	
    	LaptopService bean = apc.getBean("laptopSer", LaptopService.class);
    	bean.createTable();
        Laptop l = new Laptop(1,"a30s","Asus", c);
    	int saveLaptop = bean.saveLaptop(l);
    	System.out.println(saveLaptop);
//    	int res = bean.saveLaptop(new Laptop(3,"sdds","ygh"));
//    	System.out.println(bean.allrec());
//    	bean.allrec().forEach(val -> {
//    		System.out.println("Model : "+val.getModal()+"\t"+"Brand : "+val.getBrand());
//    	});
//    	

    	
    	apc.close();
    	
    	
    }
}