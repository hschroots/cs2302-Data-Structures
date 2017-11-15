#include <iostream>
#include <string>
#include <math>

std::map<unsigned long long, unsigned long long> memo;

unsigned long long fib(const unsigned int &n)
{

	long long root5 = std::sqrt(5);
	long long c = 1/root5;

	long long root1 = ( (1 + root5) / 2 );
	long long root2 = ( (1 - root5) / 2 );

	long long A = std::pow(root1, n);
	long long B = std::pow(root2, n);

	return c * A - c * B ;
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
