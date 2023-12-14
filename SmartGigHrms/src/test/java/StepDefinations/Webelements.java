package StepDefinations;

public class Webelements {
	String UserName="//input[@id='UserName']";
	String password="//input[@id='Password']";
	String Loginbtn="//input[@id='btnLogIn']";
	String Dashboard="//div[text()='Dashboard' and @class='activeMenu']";
	String menu="//div[@class='menuIcon']";
	String HR="//div[@class='menuName' and text()='HR']";
	//Holidays
	String Holoiday_Icon="//div[text()='Holidays']";
	String Add_Holiday="//input[@value='Add Holiday']";
	String HolidayName="//input[@id='HolidayName']";
	String HolidayDate="//input[@id='Date_JDate']";
	String Save_Holiday="//input[@id='btnAddEditCompanyHolidays']";
	
//reset pwd
	String AdminModule="//div[text()='Admin']";
	String userSearch="//input[@id='searchText']";
	String userSearchBtn="//img[@id='btnsearchUser']";
	String ellipsisIcon="//img[@class='dotIcon']";
	String resetPwd="//a[text()='Reset Password']";
	//Logout
	String Logoutmenu="//img[@id='optimg']";
	String Logoutbtn="//td[text()='Logout']";
	
	//Activate Deactivate user
	String allRadiostatusbtn="//input[@id='UserStatus' and @value='0']";
	String DeactivateIcon="//img[@title='Deactivate']";
	String activateIcon="//img[@title='Activate']";
	
	//view Assigned roles
	String ViewAssignedRoles="//a[text()='View Assigned Roles']";
	String ListRoles="//span[@style='color:#327AD6;cursor:pointer;']";
	
	//Add Role
	String AddTeam="//input[@value='Add Team']";
	String Team="//select[@id='TeamId']";
	String Role="//select[@id='RoleId']";
	String RoleSave="//input[@id='btnAddTeam']";
	//Admin
	String Anministratorsbtn="//a[text()='Administrators']";
	String AddAdmin="//input[@id='btnAddAdmin']";
	String AdminSearch="//input[@id='txtSearchText']";
	String adminSearechbtn="//img[@id='btnSearchUser']";
	String Radiobtn="//input[@type='radio' and @name='SelectUser']";
	String AdminSavebtn="//input[@id='btnSearchSubmit']";
	
	String DeleteAdmin="((//td[text()='1414'])[2]/..//td)[17]";
	
	//Add site
	String SitesIcon="//div[text()='Sites']";
	String AddSite="//input[@id='btnAddSite']";
	String Sitename="//input[@id='SiteName']";
	String siteType="//select[@id='SiteTypeId']";
	String Diviion="//select[@id='lbDivision']";
	
	String moveDiv="//input[@id='btnDivisionMoveToRight']";
	String SiteSave="//input[@id='btnSave']";
	
	//Add Division
	String DivisionIcon="//div[text()='Divisions']";
	String AddDivision="//input[@value='Add Division']";
	String Divisionname="//input[@id='DivisionName']";
	String DivisionCode="//input[@id='DivisionCode']";
	String DivisionSave="//input[@id='btnSave']";
	
	
	//Add workflow
	String workflowIcon="//div[text()='Manage Work Flows']";
	String addNewWorkflow="//input[@value='Add New']";
	String wfname="//input[@id='Name']";
	String entityType="//select[@id='EntityTypeId']";//Leaves
	String entitysubType="//select[@id='EntitySubTypeId']"; //Leave approval
	String siteId="//select[@id='SiteId']";//HO
	String wfSave="//input[@id='btnSaveWorkFlow']";
	
	//Add Leave
	String MyRequests="//div[text()='My Requests']";
	String LeaveIcon="//div[text()='Leaves']";
	String addLeaveReq="//input[@value='Add Leave Request']";
	String leaveBalanceIcon="//div[@id='btnShowBalanceLeaves']/img";
	String balanceiconclose="(//span[@class='t-icon t-close'])[2]";
	String casualLeaveBalance="(//div[text()='Casual Leave Days']/../following-sibling::td)[3]";//gettext
	String leaveType="//select[@id='LeaveTypeIdStr']";//Casual Leave
	String startdate="(//img[@class='ui-datepicker-trigger'])[1]";
	String Sdate="//a[text()='8']";
	String endDate="(//img[@class='ui-datepicker-trigger'])[2]";
	String Edate="//a[text()='8']";
	String chargeHandover="//input[@id='ChargeHandover' and @value='1' ]";
	String textArea="//textarea[@id='Notes']";
	String leaveSave="//input[@id='btnSave']";
	
	//Add Employee
	String addEmp="//input[@value='Add Employee']";
	String empCode="//input[@id='EmployeeCode']";
	String biometricCode="//input[@id='BiometricEmployeeCode']";
	String salutation="//select[@id='PrefixId']";//Mr
	String firstName="//input[@id='FirstName']";
	String surname="//input[@id='surname']";
	String gender="//select[@id='GenderTypeId']";
	String DOB="//input[@id='DateOfBirth_JDate']";
	String qualification="//input[@id='QualificationId-input']/following-sibling::span";
	String qualificationSelect="//li[text()='BTech']";
	String bloodGroup="//select[@id='BloodGroupId']";//A +
	String positionDropdown="//input[@id='OrganisationPositionId-input']/following-sibling::span";
	String position="//li[text()='PS0248 (Software Test Engineer)']";
	String employeeType="//select[@id='EmployeeTypeId']";
	String status="//select[@id='StatusId']";
	String statuseffictivedate="//input[@id='StatusEffectiveDate_JDate']";
	String dateOfJoin="//input[@id='DateOfJoin_JDate']";
	String pfEligible="//input[@id='PFEligible' and @value='0']";
	String ptEligible="//input[@id='PTEligible' and @value='0']";
	String earnedleaveEligible="//input[@id='EarnedLeaveEligible' and @value='0']";
	String NPFEligible="//input[@id='NPSApplicable' and @value='0']";
	String SystemUser="//input[@id='IsSystemUser']";
	String empSave="//input[@id='btnSaveEmployee']";
	
	
	//Review cycle
	String reviewCycleicon="//div[text()='Review Cycles']";
	String addreviewCycle="//input[@id='btnAddReviewCycle']";
	String year="//input[@id='ReviewCycleYear']";
	String startDatePick="(//img[@class='ui-datepicker-trigger'])[1]";
	String startdatePick="//a[text()='25']";
	String performanceEndDate="(//img[@class='ui-datepicker-trigger'])[2]";
	String endyearpick="//select[@class='ui-datepicker-year']";
	String endmnthPick="//select[@class='ui-datepicker-month']";
	String endDatePick="//a[text()='27']";
	String reviewSave="//input[@id='btnSaveReviewCycle']";
	//Performance
	String EmployeeIcon="//div[text()='Employee']";
	String empSearchFiels="//input[@id='txtEmployeeName']";
	String empsearchbtn="//img[@id='btnSearch']";
	String empHyperlink="//a[@class='removeLink']";
	String performancebtn="//a[contains(text(),'Performance')]";
	String addPerformance="//input[@value='Add Performance']";
	String ReviewCycle="//select[@id='ReviewCycleId']";
	String reviewer="//select[@id='ReviewerId']";
	String performanceSave="//input[@id='btnSavePerformance']";
	String goalbtn="//input[@value='Add Performance Goal']";
	String goalTitle="//input[@id='GoalTitle']";
	String weight="//input[@id='Weight']";
	String goalType="//select[@id='GoalTypeId']";
	String goalSave="//input[@id='btnSavePerformanceGoal']";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
