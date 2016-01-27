# example_4
'static main' is better invoked as a static method rather than through an object. When using reflection, instead of

	new Main().main(new String[0])

we use

	Main.main(new String[0])

