package com.parallel.steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	private User user = new User();
	String pos;
	String neg;
	int result=0;
	
    @Given("^I have the this useless scenario$")
    public void I_have_the_this_useless_scenario() {
    }

    @When("^I sleep for (\\d+) seconds$")
    public void I_sleep_for_seconds(int arg1) throws InterruptedException {
        Thread.sleep(arg1 * 1000);
    }

    @Then("^It should finished$")
    public void It_should_finished() {
    }
    
    @Given("^that the user Vinod enter two number for (.*)$")
	public void name(String name) throws Throwable {
		user.setName(name);
	}
	
	/*When Vinod enters 10,5 for addition operation*/
	@When("^Vinod enters (.*),(.*) for (.*)$")
	public void operation(String m1, String m2, String oper) throws Throwable {
		int marks1 = Integer.parseInt(m1);
		int marks2 = Integer.parseInt(m2);
		user.setCertification(oper);
		if(user.getCertification().equals("addition")) {
			result = marks1+marks2;
		}else if(user.getCertification().equals("subtraction")) {
			result = marks1-marks2;
		}else if(user.getCertification().equals("multiplication")) {
			result = marks1*marks2;
		}else if(user.getCertification().equals("division")) {
			result = marks1/marks2;
		}
	}

	/* Then Vinod found result is 15 */
	@Then("^Vinod found result is (.*)$")
	public void finalResult(int fresult) throws Throwable {
		if(user.getCertification().equals("addition")) {
			assertEquals(result, fresult);
		}else if(user.getCertification().equals("subtraction")) {
			assertEquals(result, fresult);
		}else if(user.getCertification().equals("multiplication")) {
			assertEquals(result, fresult);
		}else if(user.getCertification().equals("division")) {
			assertEquals(result, fresult);
		}
	}
	
	/***************************************/
	
	@When("^User enter the first number$")
	public void user_enter_the_first_number() throws Throwable 
	{
		System.out.println("Enter first number :"+10);
	}

	@When("^User enter the second number$")
	public void user_enter_the_second_number() throws Throwable 
	{
		System.out.println("Enter second number :"+20);
	}
	
	@When("^User enter the third number$")
	public void user_enter_the_third_number() throws Throwable 
	{
		System.out.println("Enter third number :"+30);
	}
	
	@Then("^User check the two numbers for positive test$")
	public void user_check_the_two_numbers_for_positive_test() throws Throwable {
			if(10 >0 && 20 >0)
				pos="Positive";
	}

	@Then("^Print the pos$")
	public void print_the_pos() throws Throwable {
		System.out.println("Number is  :"+pos);
	}
	
	@Then("^User check the two numbers for negative test$")
	public void user_check_the_two_numbers_for_negative_test() throws Throwable {
		if(-10 <0 && -20 <0)
			neg="Negative";
	}

	@Then("^Print the neg$")
	public void print_the_neg() throws Throwable {
		
		System.out.println("Number is  :"+neg);
	}
	
}
