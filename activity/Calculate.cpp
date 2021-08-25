#include <iostream>

using namespace std;

class Calculate
{
	private:
		int num,f,rev;
	public:
		Calculate(int n)
		{
			num = n;
			f=0;
			rev=0;
		}

		int prime()
		{
			int c=0;
			for(int i=2;i<num;i++)
			{
				if(num%i == 0)
					c++;
			}
			if(c == 0)
				return 1;
			else
				return 0;
		}

		int reverse()
		{
			int n = num;
			int r = 0;
			while(n>0)
			{
				r = r*10 + n%10;
				n = n/10;
			}
			return r;
		}

		void display()
		{
			if(this->prime()==1 && this->reverse()==this->num)
				cout<<"Prime Palindrome"<<endl;
			else
				cout<<"Not prime palindrome";
		}
};

int main()
{
	Calculate o(101);
	o.display();
}
