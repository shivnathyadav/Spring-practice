package springboot.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
    // need a controller  method to show intial  html form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    //process form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    //new Controlller method to read form data and add data to model
   @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
        //read the request paML form
       String theName=request.getParameter("studentName");

       //conver the data to all caps
       theName =theName.toUpperCase();

       //create message
       String result = "Yo! " + theName;

       //add message to Model
       model.addAttribute("message",result);

        return "helloworld";
    }
    //new Controller
    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){
        //read the request paML form
    //    String theName=request.getParameter("studentName"); //removed after adding re-quest param

        //conver the data to all caps
        theName =theName.toUpperCase();

        //create message
        String result = "Hello my Friend from v3! " + theName;

        //add message to Model
        model.addAttribute("message",result);

        return "helloworld";
    }





}
