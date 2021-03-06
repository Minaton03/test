package com.internousdev.miamiburger.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dto.DestinationInfoDTO;
import com.internousdev.miamiburger.dto.UserInfoDTO;
import com.internousdev.miamiburger.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

/*
 * user_idをセッションに格納されたUserInfoDTOから取得している。実装時にはセッションのキーを合わせる必要がある。
 */
public class AddressConfirmAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	private String family_name;
	private String first_name;
	private String family_name_kana;
	private String first_name_kana;
	private String email;
	private String tel_number;
	private String user_address;
	private int sex;

	private String errorSei="";
	private String errorMei="";
	private String errorSeiKana="";
	private String errorMeiKana="";
	private String errorEmail="";
	private String errorTelNumber="";
	private String errorUserAddress="";

	private DestinationInfoDTO destinationInfoDTO = new DestinationInfoDTO();

	public String execute(){
		String result = SUCCESS;
		InputChecker inputChecker = new InputChecker();

//		user_idの取得。必要であれば変更する---------------------------------------
		UserInfoDTO loginDTO = (UserInfoDTO) session.get("userInfoDTO");
		String userId = loginDTO.getUserId();
//		-----------------------------------------------------------------
		destinationInfoDTO.setUserId(userId);

		List<String> seiErrorCheck = new ArrayList<>();
		List<String> meiErrorCheck = new ArrayList<>();
		List<String> seiKanaErrorCheck = new ArrayList<>();
		List<String> meiKanaErrorCheck = new ArrayList<>();
		List<String> emailErrorCheck = new ArrayList<>();
		List<String> telNumberErrorCheck = new ArrayList<>();
		List<String> userAddressErrorCheck = new ArrayList<>();

//		フォームの入力内容をinputCheckerを使用しチェックする。-----------------------------------------------
		seiErrorCheck = inputChecker.doCheck("姓", family_name, 1, 16, true, true, true, false, false,false,false);
		meiErrorCheck = inputChecker.doCheck("名", first_name, 1, 16, true, true, true, false, false,false,false);
		seiKanaErrorCheck = inputChecker.doCheck("姓ふりがな", family_name_kana, 1, 16, false, false, true, false, false,false,false);
		meiKanaErrorCheck = inputChecker.doCheck("名ふりがな", first_name_kana, 1, 16, false, false, true, false, false,false,false);
		emailErrorCheck = inputChecker.doCheck("メールアドレス", email, 18, 32, true, false, false, true, true,false,false);
		telNumberErrorCheck = inputChecker.doCheck("電話番号", tel_number, 11, 13, false, false, false, true, false,false,false);
		userAddressErrorCheck = inputChecker.doCheck("住所", user_address, 15, 50, true, true, false, true, true,true,false);

		if(seiErrorCheck.isEmpty() &&
				meiErrorCheck.isEmpty()&&
				seiKanaErrorCheck.isEmpty()&&
				meiKanaErrorCheck.isEmpty()&&
				emailErrorCheck.isEmpty()&&
				telNumberErrorCheck.isEmpty()&&
				userAddressErrorCheck.isEmpty()){
			destinationInfoDTO.setFamilyName(family_name);
			destinationInfoDTO.setFirstName(first_name);
			destinationInfoDTO.setFamilyNameKana(family_name_kana);
			destinationInfoDTO.setFirstNameKana(first_name_kana);
			destinationInfoDTO.setEmail(email);
			destinationInfoDTO.setTelNumber(tel_number);
			destinationInfoDTO.setUserAddress(user_address);
		}else{
			if(seiErrorCheck.size() != 0){
				for(int i = 0 ; i < seiErrorCheck.size(); i++){
					errorSei += seiErrorCheck.get(i);
				}
			}else{
				destinationInfoDTO.setFamilyName(family_name);
			}
			if(meiErrorCheck.size() != 0){
				for(int i = 0 ; i < meiErrorCheck.size(); i++){
					errorMei += meiErrorCheck.get(i);
				}
			}else{
				destinationInfoDTO.setFirstName(first_name);
			}
			if(seiKanaErrorCheck.size() != 0){
				for(int i = 0 ; i < seiKanaErrorCheck.size(); i++){
					errorSeiKana += seiKanaErrorCheck.get(i);
				}
			}else{
				destinationInfoDTO.setFamilyNameKana(family_name_kana);
			}
			if(meiKanaErrorCheck.size() != 0){
				for(int i = 0 ; i < meiKanaErrorCheck.size(); i++){
					errorMeiKana += meiKanaErrorCheck.get(i);
				}
			}else{
				destinationInfoDTO.setFirstNameKana(first_name_kana);
			}
			if(emailErrorCheck.size() != 0){
				for(int i = 0 ; i < emailErrorCheck.size(); i++){
					errorEmail += emailErrorCheck.get(i);
				}
			}else{
				destinationInfoDTO.setEmail(email);
			}
			if(telNumberErrorCheck.size() != 0){
				for(int i = 0 ; i < telNumberErrorCheck.size(); i++){
					errorTelNumber += telNumberErrorCheck.get(i);
				}
			}else{
				destinationInfoDTO.setTelNumber(tel_number);
			}
			if(userAddressErrorCheck.size() != 0){
				for(int i = 0 ; i < userAddressErrorCheck.size(); i++){
					errorUserAddress += userAddressErrorCheck.get(i);
				}
			}else{
				destinationInfoDTO.setUserAddress(user_address);
			}

			result = ERROR;
		};
//		-------------------------------------------------------------
		session.put("destinationInfoDTO", destinationInfoDTO);
		return result;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public String getFamily_name() {
		return family_name;
	}


	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getFamily_name_kana() {
		return family_name_kana;
	}


	public void setFamily_name_kana(String family_name_kana) {
		this.family_name_kana = family_name_kana;
	}


	public String getFirst_name_kana() {
		return first_name_kana;
	}


	public void setFirst_name_kana(String first_name_kana) {
		this.first_name_kana = first_name_kana;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTel_number() {
		return tel_number;
	}


	public void setTel_number(String tel_number) {
		this.tel_number = tel_number;
	}


	public String getUser_address() {
		return user_address;
	}


	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}


	public DestinationInfoDTO getDestinationInfoDTO() {
		return destinationInfoDTO;
	}


	public void setDestinationInfoDTO(DestinationInfoDTO destinationInfoDTO) {
		this.destinationInfoDTO = destinationInfoDTO;
	}


	public String getErrorSei() {
		return errorSei;
	}


	public void setErrorSei(String errorSei) {
		this.errorSei = errorSei;
	}


	public String getErrorMei() {
		return errorMei;
	}


	public void setErrorMei(String errorMei) {
		this.errorMei = errorMei;
	}


	public String getErrorSeiKana() {
		return errorSeiKana;
	}


	public void setErrorSeiKana(String errorSeiKana) {
		this.errorSeiKana = errorSeiKana;
	}


	public String getErrorMeiKana() {
		return errorMeiKana;
	}


	public void setErrorMeiKana(String errorMeiKana) {
		this.errorMeiKana = errorMeiKana;
	}


	public String getErrorEmail() {
		return errorEmail;
	}


	public void setErrorEmail(String errorEmail) {
		this.errorEmail = errorEmail;
	}


	public String getErrorTelNumber() {
		return errorTelNumber;
	}


	public void setErrorTelNumber(String errorTelNumber) {
		this.errorTelNumber = errorTelNumber;
	}


	public String getErrorUserAddress() {
		return errorUserAddress;
	}


	public void setErrorUserAddress(String errorUserAddress) {
		this.errorUserAddress = errorUserAddress;
	}


	public int getSex() {
		return sex;
	}


	public void setSex(int sex) {
		this.sex = sex;
	}


}
