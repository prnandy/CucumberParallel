@ABC
Feature: Calculator Demo
	
	@Sceanrio1
    Scenario: User wants to perform the basic math operation
        Given that the user Vinod enter two number for calculation
        When Vinod enters 10,5 for addition
        Then Vinod found result is 15

	@Sceanrio2
    Scenario: User wants to perform the basic math operation
        Given that the user Vinod enter two number for calculation
        When Vinod enters 10,5 for subtraction
        Then Vinod found result is 5

	@Sceanrio3
	Scenario: User wants to perform the basic math operation
        Given that the user Vinod enter two number for calculation
        When Vinod enters 10,5 for multiplication
        Then Vinod found result is 50
    
    @Sceanrio4            
	Scenario: User wants to perform the basic math operation
        Given that the user Vinod enter two number for calculation
        When Vinod enters 10,5 for division
        Then Vinod found result is 2