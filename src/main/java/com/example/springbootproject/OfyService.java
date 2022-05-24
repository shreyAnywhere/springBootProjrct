package com.example.springbootproject;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

public class OfyService {

    static {
        ObjectifyService.register(StudentDetails.class);
    }
    public static Objectify ofy(){
        return ObjectifyService.ofy();
    }
}
