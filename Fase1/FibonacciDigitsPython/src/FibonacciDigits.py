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
    
    try:
        nameOfScript, numberOfDigit = sys.argv
        
        numberOfDigit = int(numberOfDigit)
        
        fib1 = 0
        fib2 = 0
        c = 0
        i = 0
        
        while not len(str(c)) == numberOfDigit:      
            i = i+1
            c = fib(i, fib1, fib2)
            fib2 = fib1
            fib1 = c        
        
        print("Il " + str(i) + "° numero è il primo della sequenza ad essere di " + 
              str(numberOfDigit) + " cifre")
        
    except Exception as error:
        print("Inserire il paramentro numero di cifre")
        
