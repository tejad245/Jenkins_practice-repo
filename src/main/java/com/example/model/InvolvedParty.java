package com.example.model;

import jdk.jfr.DataAmount;


public class InvolvedParty {

    private Organisation organisation;

    public InvolvedParty(Organisation organisation) {
        this.organisation = organisation;
    }

    public Organisation getOrganisation() {
        return organisation;
    }

    public void setOrganisation(Organisation organisation)
    {
        this.organisation=organisation;
    }
}
