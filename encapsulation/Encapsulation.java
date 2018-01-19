/*
PRE-CODE
--------
Object oriented programming became important around the time when it became a norm for
software projects to become really really large: millions of lines of code, hundreds of
man years, and teams with 50s and 100s of developers in it. A software system would
more often than not be a result of the efforts of a very large number of people.

Under such circumstances, the most important source of software failures is not the failure
of an individual programmer but failure of communication between members of the same team.

Communication failure leads to lack of understanding about the code written by other 
programmers. This leads to subtle bugs, either because we try to use a code written by
someone else in a wrong way; or, worse still, mess around with it in an inappropriate 
manner to fit to our requirements.

In such chaotic circumstances, defensive programming comes to our rescue. We must build 
our programs in a way such that they are safeguarded from other piece of the programs
written by other programmers.

Much of object oriented concepts are centred around: re-use and safety.

In this section, we introduce a concept, named 'access modifiers', which is specifically
designed to help us write safe code. Safe in what sense? Safe from any kind misuse -- either 
accidental or intentional -- by 
other parts of the program which is not written by us.
*/

/*
POST-CODE
---------
So, we saw here that using the 'private' access modifier we have successfully tightened 
the design of our classes. The objects of these classes are now less susceptible to getting
corrupted by other pieces of code -- which could be due to innocent mistakes of a team
mate, or could be a malware contributed from a third-party.

Going forward, we will time and again return to the theme of writing safe code which is
one of the central concerns of writing robust and professional quality code. Many of the
features of Java -- and all other modern object-oriented programming languages for that
matter -- are devised with the central purpose of enabling the programmer to write 
safe and secure code.

QUESTION
--------
Which of the following programming language features is designed for safety?
1) Inheritance
2) Access modifiers
3) Strong typing
*/
