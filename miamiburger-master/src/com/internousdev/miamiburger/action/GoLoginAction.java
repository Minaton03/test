package com.internousdev.miamiburger.action;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.LoginDAO;
import com.internousdev.miamiburger.dao.ProductInfoDAO;
import com.internousdev.miamiburger.dto.ProductInfoDTO;
import com.internousdev.miamiburger.dto.UserInfoDTO;
import com.internousdev.miamiburger.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;
public class GoLoginAction extends ActionSupport implements SessionAware{
	private String userId;
	private String password;


	//ログアウト時IDを表示する
	private int idCheck;

	private String errorId = "";        //IDエラー
	private String errorPass = "";          //パスワードエラー
	private String errorMessage;

	int i;

	public List<String> ErrorUserIdList = new ArrayList<String>();
	public List<String> ErrorPasswordList = new ArrayList<String>();

	private Map<String,Object>session;

	// 検索ワード(初期値空白)
		private String search = "";
	// 商品情報取得DAO
		private ProductInfoDAO productInfoDAO = new ProductInfoDAO();
	// 商品情報をリストに格納
		public ArrayList<ProductInfoDTO> productInfoList = new ArrayList<ProductInfoDTO>();
		InputChecker inp = new InputChecker();

	public String execute(){
		int check= 0;
		String result = ERROR;
		ErrorUserIdList = inp.doCheck("ユーザーID", userId, 1, 8, true, false, false, true, false,false,false);
		ErrorPasswordList = inp.doCheck("パスワード", password, 1, 16, true, false, false, true, false,false,false);


		if(ErrorUserIdList.size() == 0 && ErrorPasswordList.size() == 0){

		LoginDAO dao = new LoginDAO();
		UserInfoDTO userInfoDTO = new UserInfoDTO();

		//ユーザーの情報をDTOに詰める
		userInfoDTO = dao.login(userId, password);

		//DTOに中身があればセッションに詰める
		if(!(userInfoDTO.getUserId() == null)){
			session.put("userInfoDTO", userInfoDTO);

			//loginedを入れる
			session.put("idCheck", idCheck);
			check = dao.login(userId);
			if(check == 0){
				return "errorDAO";
			}

			if(userInfoDTO.getMasterFlg() == 1){
			//管理者画面へ遷移、それに伴う商品情報の取得

				productInfoList = productInfoDAO.getProductListInfoAll(search);
				session.put("productInfoList", productInfoList);
				session.put("admin", "admin");
				return INPUT;

			}
			System.out.println(session.get("temp_user_id"));
			check = dao.changeUserCart(userId,session.get("temp_user_id").toString());
			if(check == 0){
				System.out.println("カートの中身がありません。");
			}

			result = SUCCESS;
				}else{
			errorMessage = "ユーザーID、またはパスワードが違います。";	//エラー時
		}


		}else{
			//エラー時
			for(i=0;i < ErrorUserIdList.size();i++){
				errorId = errorId + ErrorUserIdList.get(i);
			}
			for(i=0;i < ErrorPasswordList.size();i++){
				errorPass = errorPass + ErrorPasswordList.get(i);
			}

		}


		return result;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getErrorMessage() {
		return errorMessage;
	}


	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public String getSearch() {
		return search;
	}


	public void setSearch(String search) {
		this.search = search;
	}


	public ProductInfoDAO getProductInfoDAO() {
		return productInfoDAO;
	}


	public void setProductInfoDAO(ProductInfoDAO productInfoDAO) {
		this.productInfoDAO = productInfoDAO;
	}


	public ArrayList<ProductInfoDTO> getProductInfoList() {
		return productInfoList;
	}


	public void setProductInfoList(ArrayList<ProductInfoDTO> productInfoList) {
		this.productInfoList = productInfoList;
	}


	public int getIdCheck() {
		return idCheck;
	}


	public void setIdCheck(int idCheck) {
		this.idCheck = idCheck;
	}


	public String getErrorId() {
		return errorId;
	}


	public void setErrorId(String errorId) {
		this.errorId = errorId;
	}


	public String getErrorPass() {
		return errorPass;
	}


	public void setErrorPass(String errorPass) {
		this.errorPass = errorPass;
	}


	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	public List<String> getErrorUserIdList() {
		return ErrorUserIdList;
	}


	public void setErrorUserIdList(List<String> errorUserIdList) {
		ErrorUserIdList = errorUserIdList;
	}


	public List<String> getErrorPasswordList() {
		return ErrorPasswordList;
	}


	public void setErrorPasswordList(List<String> errorPasswordList) {
		ErrorPasswordList = errorPasswordList;
	}


	public InputChecker getInp() {
		return inp;
	}


	public void setInp(InputChecker inp) {
		this.inp = inp;
	}



}

