package com.example.springbootproject;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        DatastoreService ds = DatastoreServiceFactory.getDatastoreService();

//        Entity e = new Entity("Student");
//        e.setProperty("name", "Shrey");
//        e.setProperty("email", "abc@gmail.com");
//        ds.put(e);

        resp.getWriter().println("Hello world from servlet!!!");
    }
}
