package ibmtal.trendyol.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.trendyol.business.services.MyAccountService;
import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.core.result.ResultItem;
import ibmtal.trendyol.database.MyAccountDao;
import ibmtal.trendyol.dto.MyAccountDto;
import ibmtal.trendyol.entity.MyAccount;
import ibmtal.trendyol.entity.User;

 
public class MyAccountManager implements MyAccountService {
	private MyAccountDao MyAccountDao;
    @Autowired
	public MyAccountManager(MyAccountDao myaccountDao) {
		super();
		this.MyAccountDao = myaccountDao;
	    }
	@Override
	public ArrayList<MyAccount> getAll() {
	return new ArrayList<MyAccount>(this.MyAccountDao.findAll());
	}
	@Override
	public Result<MyAccount> addMyAccount(MyAccount myaccount) {
		Result<MyAccount> result=new Result<MyAccount>();
		if(myaccount.getSurname().isBlank()==true) {
			result.setSuccess(false);
			result.getErrors().add(
			new ResultItem("username","Hesabınızı doldurunuz.")
			);
		}
		if(myaccount.getSurname().isBlank()==true) {
			result.setSuccess(false);
			result.getErrors().add(
			new ResultItem("Surname","SoyAdınızı giriniz.")
			);			
		}
		if(myaccount.getEmail().isBlank()==true) {
			result.setSuccess(false);
			result.getErrors().add(
			new ResultItem("email","Mail'inizi giriniz.")
			);
		}
		if(result.isSuccess()!=false) {
			this.MyAccountDao.save(myaccount);
		}
		return result;
	}
	@Override
	public Result<MyAccount> addMyAccountDto(MyAccountDto myaccountAddDto) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Result<MyAccount> addCompany(MyAccount myaccount) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Result<MyAccount> getCompany(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Result<MyAccount> addMyAccountDto(MyAccountAddDto myaccountAddDto) {
		Result<MyAccount> result=new Result<MyAccount>();
		if(myaccountAddDto.getSurname().isBlank()==true) {
			result.setSuccess(false);
			result.getErrors().add(new ResultItem("Surname","Kullanıcı ad boş"));
		}
		else if(this.MyAccountDao.getByMyAccountname(myaccountAddDto.getMyAccountname).isEmpty()==false) {
			result.setSuccess(false);
			result.getErrors().add(new ResultItem("username","Kullancı adı sistemde kayıtlı.")
			);
		}
		if(myaccountAddDto.getName().isBlank()==true) {
			result.setSuccess(false);
			result.getErrors().add(
			new ResultItem("name","Adınızı girmediniz.")
			);		
		}
		if(myaccountAddDto.getSurname().isBlank()==true) {
		    result.setSuccess(false);
		    result.getErrors().add(
		    new ResultItem("reSurname","SoyAdınızı tekrar giriniz.")
		    );
		}
		if(myaccountAddDto.getEmail().isBlank()==true) {
			result.setSuccess(false);
			result.getErrors().add(new ResultItem("Email","Emailinizi giriniz."));
		}
		if(result.isSuccess()==true) {
			MyAccount myaccount=new MyAccount();
			myaccount.setName(myaccountAddDto.getName());
			myaccount.setSurname(myaccountAddDto.getSurname());
			myaccount.setEmail(myaccountAddDto.getEmail());
			myaccount.setAge(myaccountAddDto.getAge());
			myaccount.setGender(myaccountAddDto.getGender());
			myaccount.setMyAccounttype("myaccount");
			this.MyAccountDao.save(myaccount);
			ArrayList<MyAccount> userlist=new ArrayList<MyAccount>();
			userlist.add(myaccount);
			result.setData(userlist);	
		}
		return result;
	}
	@Override
	public Result<MyAccount> getMyAccount(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}			
}
