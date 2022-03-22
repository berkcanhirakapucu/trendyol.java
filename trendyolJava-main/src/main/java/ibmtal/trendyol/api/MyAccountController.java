package ibmtal.trendyol.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.trendyol.business.services.MyAccountService;
import ibmtal.trendyol.core.result.Result;
import ibmtal.trendyol.dto.MyAccountDto;
import ibmtal.trendyol.entity.MyAccount;

@RestController
@RequestMapping("/api/myaccounts")
public class MyAccountController {
    private MyAccountService myaccountService;
    @Autowired
	public MyAccountController(MyAccountService myaccountService) {
		super();
		this.myaccountService = myaccountService;
	}   
    @PostMapping("/add")
	public Result<MyAccount> addMyAccountDto(@RequestBody MyAccount myaccount) {
    	return this.myaccountService.addMyAccount(myaccount);
    }
    @PostMapping("/addmyaccount")
    public Result<MyAccount> addMyAccountDto(@RequestBody MyAccountDto myaccountAddDto) {
    	return this.myaccountService.addMyAccountDto(myaccountAddDto);
    }
}
