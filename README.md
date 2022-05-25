# fizzbuzz

## Assignment
Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
For numbers which are multiples of both three and five print “FizzBuzz”.

## My comments
I imagined the project as a requirement from a customer, and created it in a way that deals with the problem mathematically rather than the classic programming-test way (as in "do this on this condition, do that on that condition, and do a different thing entirely when several conditions are met) - this allowed me to keep the implementation extremely simple, which would reduce our development and maintenance costs significantly.

If the customer changes their mind and decides to alter the requirements to add new conditions that are not based on division of numbers (which would be quite out of scope of the original project anyway), we would need to rework the implementation, but considering the minimal development time and my quite hefty estimate for an alternative I decided that it would be worth the risk. (In a work environment, I would of course discuss this decision with my team and my superiors) .
New conditions such as print "aaaaa" if a number is divisible by 17, 896 and 90135 are easily added, and the project can be modified to enable changing the configuration at runtime as well.
