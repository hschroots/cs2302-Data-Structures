#include <iostream>
#include <string>
#include <cmath>

#define RECIP_SQRT5 0.447213595499957939281834733746255247088124 
#define ROOTA  1.61803398874989484820458683436563811772031
#define ROOTB -0.618033988749894848204586834365638117720309   

long long fib(const long double &n)
{
	if( n == 0 )
		return 0;
	if( n == 1 )
		return 1; 

	long double A = pow((long double)ROOTA, (long double)n);
	long double B = pow((long double)ROOTB, (long double)n);

	return (long long)ceil(( RECIP_SQRT5 * (A - B)));
}

int main(void)
{
	std::cout << "Please enter a positive interger to find the fibonaci value of" << std::endl;

	std::string input;
	std::getline(std::cin, input);

	long double fibnum = stold(input);

	unsigned long long fibvalue = fib(fibnum+1);

	std::cout << "The " << fibnum << "th fibonocci number is " << fibvalue << std::endl;
			
	return 0;
}
