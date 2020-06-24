//11.14 List the various exceptional conditions that have occurred in programs throughout this text
//so far. List as many additional exceptional conditions as you can. For each of these, describe briefly
//how a program typically would handle the exception by using the exception-handling techniques
//discussed in this chapter. Typical exceptions include division by zero and array index out of bounds.

//ANS: A few examples are: Division by zero—catch the exception, inform user of the attempt to divide by zero. 
//Array subscript out of bounds—catch the exception, print
//an error message telling the user what index was being referenced incorrectly, and exit
//the program in a controlled manner. Bad cast—catch the exception and either cast it
//to the proper type if that can be determined, or print an error message indicating
//what the bad cast was, and exit the program. Invalid input—catch the exception and
//inform the user that the input cannot be converted to the proper type.


//11.15 Until this chapter, we’ve found dealing with errors detected by constructors to be a bit awkward. 
//Explain why exception handling is an effective means for dealing with constructor failure.

//ANS: A thrown exception passes to the outside world the information about the failed constructor 
//and the responsibility to deal with the failure. Exceptions thrown in constructors cause objects built as part of the object being constructed to be marked for
//eventual garbage collection. 