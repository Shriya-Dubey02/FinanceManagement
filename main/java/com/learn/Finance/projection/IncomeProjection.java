package com.learn.Finance.projection;

import org.springframework.beans.factory.annotation.Value;

public interface IncomeProjection {
	String getIncomeId();
	@Value("#{target.account?.accountType}")

	String getAccount();
	int getInitialBalance();
	

}
