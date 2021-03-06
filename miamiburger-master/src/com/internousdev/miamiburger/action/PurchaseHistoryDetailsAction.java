package com.internousdev.miamiburger.action;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.PurchaseHistoryDetailsDAO;
import com.internousdev.miamiburger.dto.PurchaseHistoryDTO;
import com.internousdev.miamiburger.dto.PurchaseHistoryDetailsDTO;
import com.opensymphony.xwork2.ActionSupport;

//#session.purchaseListDTOListのallPurchaseListNumberが飛んでくる
public class PurchaseHistoryDetailsAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	public PurchaseHistoryDetailsDAO purchaseHistoryDetailsDAO = new PurchaseHistoryDetailsDAO();
	public PurchaseHistoryDetailsDTO purchaseHistoryDetailsDTO = new PurchaseHistoryDetailsDTO();
	private String result;
	private int listNumber;
	private ArrayList<PurchaseHistoryDetailsDTO> PHDList = new ArrayList<>();
	private int allPurchaseListNumber;

@SuppressWarnings("unchecked")
public String execute(){

	ArrayList<ArrayList<PurchaseHistoryDTO>> AllsetPurchaseList = new ArrayList<>();
	AllsetPurchaseList = (ArrayList<ArrayList<PurchaseHistoryDTO>>)  session.get("AllsetPurchaseList");
	for(int i=0 ; i< AllsetPurchaseList.get(allPurchaseListNumber).size(); i++){
		int id = AllsetPurchaseList.get(allPurchaseListNumber).get(i).getPurchseHistoryId();
		purchaseHistoryDetailsDTO = new PurchaseHistoryDetailsDTO();
		purchaseHistoryDetailsDTO = purchaseHistoryDetailsDAO.getPurchaseHistoryDetails(id);
		PHDList.add(purchaseHistoryDetailsDTO);
	}

	session.put("PHDList", PHDList);

	return SUCCESS;
}

public Map<String, Object> getSession() {
	return session;
}

public void setSession(Map<String, Object> session) {
	this.session = session;
}

public PurchaseHistoryDetailsDAO getPurchaseHistoryDetailsDAO() {
	return purchaseHistoryDetailsDAO;
}

public void setPurchaseHistoryDetailsDAO(PurchaseHistoryDetailsDAO purchaseHistoryDetailsDAO) {
	this.purchaseHistoryDetailsDAO = purchaseHistoryDetailsDAO;
}

public PurchaseHistoryDetailsDTO getPurchaseHistoryDetailsDTO() {
	return purchaseHistoryDetailsDTO;
}

public void setPurchaseHistoryDetailsDTO(PurchaseHistoryDetailsDTO purchaseHistoryDetailsDTO) {
	this.purchaseHistoryDetailsDTO = purchaseHistoryDetailsDTO;
}

public String getResult() {
	return result;
}

public void setResult(String result) {
	this.result = result;
}





public int getAllPurchaseListNumber() {
	return allPurchaseListNumber;
}

public void setAllPurchaseListNumber(int allPurchaseListNumber) {
	this.allPurchaseListNumber = allPurchaseListNumber;
}

public int getListNumber() {
	return listNumber;
}

public void setListNumber(int listNumber) {
	this.listNumber = listNumber;
}

public List<PurchaseHistoryDetailsDTO> getPHDList() {
	return PHDList;
}

public void setPHDList(ArrayList<PurchaseHistoryDetailsDTO> pHDList) {
	PHDList = pHDList;
}




}
