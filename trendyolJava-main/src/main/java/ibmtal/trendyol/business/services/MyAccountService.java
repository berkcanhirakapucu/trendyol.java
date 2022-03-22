package ibmtal.trendyol.business.services;

import java.util.ArrayList;

import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.entity.MyAccount;
import ibmtal.trendyol.dto.MyAccountDto;

public interface MyAccountService {
    ArrayList<MyAccount> getAll();
    Result<MyAccount> addMyAccount(MyAccount myaccount);
    Result<MyAccount> addMyAccountDto(MyAccountDto myaccountAddDto);
    Result<MyAccount> addCompany(MyAccount myaccount);
    Result<MyAccount> getCompany(Integer id);
    Result<MyAccount> getMyAccount(Integer id);
}
