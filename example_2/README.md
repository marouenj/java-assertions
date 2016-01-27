# example_2
Assertions are controlled by the class loader. To enable it

	Thread.currentThread().getContextClassLoader().setDefaultAssertionStatus(true);

However this won't activate the assertion in this example because the class is already loaded. The above statement will have effect on future loading of classes.
