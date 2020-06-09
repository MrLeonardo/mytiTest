#!/usr/bin/python
import sys

def fib(n, fib1, fib2):
    if n == 0:
        return 0;
    if n == 1:
        return 1;
    else:
        return fib1 + fib2
    
    
if __name__ == '__main__':
    
    nameOfScript, numberOfDigit = sys.argv
    
    numberOfDigit = int(numberOfDigit)
    
    fib1 = 0
    fib2 = 1
    c = 0
    i = 0
    
    while not len(str(c)) == numberOfDigit:      
        i = i+1
        c = fib(i, fib2, fib1)
        fib2 = fib1
        fib1 = c        
    
    print(i)