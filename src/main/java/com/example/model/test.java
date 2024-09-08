package com.example.model;

public class test {

    private int id;
    private InvolvedParty involvedParty;

    public test(InvolvedParty involvedParty,int id) {
        this.involvedParty = involvedParty;
        this.id=id;
    }

    public test() {

    }

    public InvolvedParty getInvolvedParty() {
        return involvedParty;
    }

    public void setInvolvedParty(InvolvedParty involvedParty){
        this.involvedParty=involvedParty;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
