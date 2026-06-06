using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsolePractice
{
    internal class FactorialNum
    {
        internal void FactorialNumber()
        {
            int num = 7;
            int fact = 1;
            for (int i = 1; i <= 7; i++)
            {
                fact = fact*i;

            }
            Console.WriteLine("Factorial of {0} is {1}",num,fact);
        }
    }
}
