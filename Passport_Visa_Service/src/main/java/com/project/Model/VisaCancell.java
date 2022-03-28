package com.project.Model;

import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name="VISA_CANCELLATION")
public class VisaCancell {
	
 
  
  private int VISA_NO;
  
  private int CANCELLATION_ID;
  private int CANCELLATION_FEE;
  private String STATUS;
  
  public int getVISA_NO() {
	  return VISA_NO;
  }
  
  public void setVISA_NO(int VISA_NO) {
	  VISA_NO = VISA_NO;
  }
  public int getCANCELLATION_ID() {
  return CANCELLATION_ID;
  }
  
  public void setCANCELLATION_ID(int CANCELLATION_ID) {
	  CANCELLATION_ID = CANCELLATION_ID;
  }
  public int getCANCELLATION_FEE() {
	  return CANCELLATION_FEE;
  }
  
  public void setCANCELLATION_FEE() {
	  CANCELLATION_FEE = CANCELLATION_FEE;
  }
  
  public String getSTATUS() {
	  return STATUS;
  }
	  public void setSTATUS(String Status) {
		  STATUS = STATUS;
	  }
  }
  

