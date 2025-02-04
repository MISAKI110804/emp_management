package com.example.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
//問3追記
public class InsertAdministratorForm {
	/** 名前 */
	@NotBlank(message = "名前は必須です")
	@Size(min=1,max =100, message = "名前は100文字以内で入力してください")
	private String name;
	/** メールアドレス */
	@Email(message = "メールアドレスの形式が不正です")
	@Size(min=1,max =100, message = "メールアドレスは100文字以内で入力してください")
	
	private String mailAddress;
	/** パスワード */
	@NotBlank(message = "パスワードは必須です")
	@Size(min=8,max =20, message = "パスワードは20文字以内で入力してください")
	@Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).+$",message = "8文字以上20文字以下、かつ英大文字、小文字、数字をそれぞれ少なくとも1文字は使用してください")
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ "]";
	}

}
