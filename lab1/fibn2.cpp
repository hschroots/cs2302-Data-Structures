#include <iostream>
#include <string>

unsigned long long fib(const unsigned long long &n)
{
	if(n == 0 || n == 1 )
		return 1;
	return fib(n-1) + fib(n-2);
}

int main(void)
{
	std::cout << "Please enter a positive interger to find the fibonaci value of" << std::endl;

	std::string input;
	std::getline(std::cin, input);

	unsigned long long fibnum = stoull(input);

	unsigned long long fibvalue = fib(fibnum);

	std::cout << "The " << fibnum << "th fibonocci number is " << fibvalue << std::endl;
			
	return 0;
}
