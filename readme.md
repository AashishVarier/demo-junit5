# Junit 5 Demo

- Junit Arch
	- Platform
		- Jupiter = Juint 5 API  to interact with Platform
		- Vintage = to use Platform to test using older methods (ie use test from Junit 4)
		- EXT = 3rd party extention to interact with Junit5 Platform

- Junit test lifecycle
	- @BeforeAll -> @BeforeEach }- used to perform initialization task
	- @Test  }- actual test cases
	- @AfterEach -> @AfterAll }- used to perform cleanup tasks for test
- Good to know annotations / methods
	- @BeforeAll 
	- @BeforeEach
	- @Test
	- @AfterEach 
	- @AfterAll
	- @DisplayName
	- @Disabled
	- @EnabledOnOs 
	- @DisabledOnOs
	- Assertions
	- assertThrows()
	- Assumptions
	- @RepeatedTest