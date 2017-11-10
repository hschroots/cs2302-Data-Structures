#include <iostream>
#include <string>
#include <map>

std::map<unsigned long long, unsigned long long> memo;

unsigned long long fib(const unsigned long long &n)
{
	if(memo.find(n) != memo.end())
	{
		//std::cout << "Found existing value for " << n << std::endl;
		return memo[n];
	}

	if(n == 0 || n == 1 ) {
		memo.insert({n,1});
		return memo[n];
	}

	unsigned long long val = fib(n-1) + fib(n-2);
	//std::cout << "Inserting new valeu for " << n << std::endl;
	memo.insert({n,val});

	return memo[n];
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
