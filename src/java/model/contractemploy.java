/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Yogesh
 */
public class contractemploy extends employee{
    private double payperhour;
    private String contractduration;

    public double getPayperhour() {
        return payperhour;
    }

    public void setPayperhour(double payperhour) {
        this.payperhour = payperhour;
    }

    public String getContractduration() {
        return contractduration;
    }

    public void setContractduration(String contractduration) {
        this.contractduration = contractduration;
    }   
}
