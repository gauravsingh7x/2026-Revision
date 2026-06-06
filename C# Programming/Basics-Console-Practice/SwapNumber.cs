using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsolePractice
{
    internal class SwapNumber
    {
        static int a = 10, b = 20;
        internal static void Swap()
        {
            //we're swaping by two numbers only
            a = a + b; //30
            b = a - b; //30-20=10=a but store into b
            a = a - b; //30-10=20=b but stroe into a

            Console.WriteLine("value of a = {0} and  b = {1}",a,b);


        }
    }
}
