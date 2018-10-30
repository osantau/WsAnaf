package oct.soft.model;

public class CompanyReqInfo {
	 private int cui;
	 private String data;


	 public CompanyReqInfo(int cui, String data) {
	
		this.cui = cui;
		this.data = data;
	}

	// Getter Methods 
	 
	 public int getCui() {
	  return cui;
	 }

	 public String getData() {
	  return data;
	 }

	 // Setter Methods 

	 public void setCui(int cui) {
	  this.cui = cui;
	 }

	 public void setData(String data) {
	  this.data = data;
	 }
	}