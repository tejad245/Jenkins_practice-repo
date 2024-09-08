package com.example.model;

public class Registration {

    private Eid eid;

    public Registration(Eid eid) {
        this.eid = eid;
    }

    public Eid getEid() {
        return eid;
    }

    public void setEid(Eid eid){
        this.eid=eid;
    }
}
