package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC015_MyProfile extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Verify My Profile";
		testDescription="My Profile";
		browserName="chrome";
		dataSheetName="TC015_MyProfile";
		category="Sumday Able Program";
		authors="Ragunath";
	}

	@Test(dataProvider="fetchData")
	public void MyProfile(String Email, String Password, String Phone, String VerError, String ConfId, String ConfDesc
			,String WConfId, String WConfDesc ) throws InterruptedException{

		new LoginPage(driver, test)
		.EnterEmailID(Email)
		.EnterPassWord(Password)
		.ClickLogin()
		.ClickMyProfile()
		.ClickEditProfile()
		.EnterPhNo(Phone)
		.GetGender()
		.VerifyHoldPeriod(VerError)
		.ClickSaveChanges()
		.VerMyProfileConfId(ConfId)
		.VerMyProfileConfDesc(ConfDesc)
		.ClickContinue()
		.ClickEditWork()
		.EnterWorkStatus()
		.SelectOccupation()
		.ClickDone()
		.ClickSaveChanges()
		.VerworkConfId(WConfId)
		.VerworkConfDesc(WConfDesc)
		.ClickTakeALook()
		
		;
		
		
	}

}
