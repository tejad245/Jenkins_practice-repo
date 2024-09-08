package com.example.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Organisation {

    private ArrayList<Registration> registrations;

    public void setRegistrations(ArrayList<Registration> registrations) {
        this.registrations = registrations;
    }

    public ArrayList<Registration> getRegistrations() {
        return registrations;
    }
}
