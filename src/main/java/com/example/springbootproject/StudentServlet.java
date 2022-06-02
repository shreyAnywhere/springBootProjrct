package com.example.springbootproject;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.googlecode.objectify.ObjectifyService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = "abc";
        String email = "abc@gmail.com";
        int age = 25;

        try{

            StudentDetails studentDetails = new StudentDetails();
            studentDetails.setName(name);
            studentDetails.setEmail(email);
            studentDetails.setAge(age);
            OfyService.ofy().save().entity(studentDetails).now();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        resp.getWriter().println("Hello world from servlet!!!");
    }
}
