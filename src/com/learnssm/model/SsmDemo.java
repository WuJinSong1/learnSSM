package com.learnssm.model;

public class SsmDemo {
	 private Integer sId;
	    private String sName;
	    private String sText;
	    private Integer sAge;
	    public Integer getsId() {
	        return sId;
	    }
	    public void setsId(Integer sId) {
	        this.sId = sId;
	    }
	    public String getsName() {
	        return sName;
	    }
	    public void setsName(String sName) {
	        this.sName = sName;
	    }
	    public String getsText() {
	        return sText;
	    }
	    public void setsText(String sText) {
	        this.sText = sText;
	    }
	    public Integer getsAge() {
	        return sAge;
	    }
	    public void setsAge(Integer sAge) {
	        this.sAge = sAge;
	    }
	    @Override
	    public String toString() {
	        return "ssmDemo [sId=" + sId + ", sName=" + sName + ", sText=" + sText
	                + ", sAge=" + sAge + "]";
	    }
}
