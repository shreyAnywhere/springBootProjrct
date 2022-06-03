package com.example.springbootproject;

import com.google.cloud.datastore.DatastoreOptions;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.VoidWork;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter
public class ObjectifyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = "abc";
        String email = "abc@gmail.com";
        int age = 25;

        try{
            ObjectifyService.init(new ObjectifyFactory(
                    DatastoreOptions.newBuilder()
                            .setProjectId("firstwebapp-349714")
                            .build()
                            .getService()
            ));
            StudentDetails studentDetails = new StudentDetails();
            studentDetails.setName(name);
            studentDetails.setEmail(email);
            studentDetails.setAge(age);
            OfyService.ofy().save().entity(studentDetails).now();
//            ObjectifyService.run(new VoidWork() {
//                public void vrun() {
//
//                }
//            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        resp.getWriter().println("hello from Objectify servlet");
    }
}
