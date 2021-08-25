class Calculate:

    def __init__(self, n) -> None:
        self.num = n
        self.f = 0
        self.rev = 0

    def prime(self):
        c=0
        for i in range(2, self.num):
            if self.num%i == 0:
                c += 1
        if c == 0:
            return 1
        else:
            return 0
    
    def reverse(self):
        n = self.num
        r = 0
        while n>0:
            r = r*10 + n%10
            n = n//10
        return r

    def display(self):
        if self.prime()==1 and self.reverse()==self.num:
            print("Prime palindrome")
        else:
            print("Not Prime palindrome")
        return

o = Calculate(121)
o.display()
