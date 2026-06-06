using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsolePractice
{
    internal class Dec2Bin
    {
        internal void Decimal2Binary()
        {
            int num = 1001;
            int b, expo = 0, dec = 0;
            while (num!=0)
            {
                b = num%10;
                
                dec = dec + b*(int)(Math.Pow(2, expo));

                num = (int)num / 10;

                expo++;
            }
            Console.WriteLine(dec);
        }
    }
}
