package pojo;

public class Appointment {
	private String ID;               //ԤԼ���
    private String name;             //��ʵ����
    private String idNumber;         //���֤��
    private String phoneNumber;      //�绰����
    private int turn;             //ҡ���ִ�
    private int quantity;         //ԤԼ����
    private Boolean status;          //�Ƿ���ǩ
    
    public void setID(String ID) {
    	this.ID = ID;
    }
    
    public String getID() {
    	return this.ID;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getName() {
    	return this.name;
    }
    
    public void setIdNumber(String idNumber) {
    	this.idNumber = idNumber;
    }
    
    public String getidNumber() {
    	return this.idNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
    	this.phoneNumber = phoneNumber;
    }
    
    public String getPhoneNumber() {
    	return this.phoneNumber;
    }
    
    public void setTurn(int turn) {
    	this.turn = turn;
    }
    
    public int getTurn() {
    	return this.turn;
    }
    
    public void setQuantity(int quantity) {
    	this.quantity = quantity;
    }
    
    public int getQuantity() {
    	return this.quantity;
    }
    
    public void setStatus(Boolean status) {
    	this.status = this.status;
    }
    
    public boolean getStatus() {
    	return this.status;
    }
}
